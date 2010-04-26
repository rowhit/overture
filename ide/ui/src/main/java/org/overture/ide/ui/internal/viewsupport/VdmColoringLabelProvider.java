package org.overture.ide.ui.internal.viewsupport;


import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DecoratingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IDecorationContext;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerColumn;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;

public class VdmColoringLabelProvider extends DecoratingStyledCellLabelProvider
		implements ILabelProvider {

	

	public static final Styler HIGHLIGHT_STYLE= StyledString.createColorRegistryStyler(null, VdmColoredViewersManager.HIGHLIGHT_BG_COLOR_NAME);
	public static final Styler HIGHLIGHT_WRITE_STYLE= StyledString.createColorRegistryStyler(null, VdmColoredViewersManager.HIGHLIGHT_WRITE_BG_COLOR_NAME);
	
	public static final Styler INHERITED_STYLER= StyledString.createColorRegistryStyler(VdmColoredViewersManager.INHERITED_COLOR_NAME, null);

	public VdmColoringLabelProvider(IStyledLabelProvider labelProvider) {
		this(labelProvider, null, null);
	}

	public VdmColoringLabelProvider(IStyledLabelProvider labelProvider, ILabelDecorator decorator, IDecorationContext decorationContext) {
		super(labelProvider, decorator, decorationContext);
	}

	public void initialize(ColumnViewer viewer, ViewerColumn column) {
		VdmColoredViewersManager.install(this);
		setOwnerDrawEnabled(VdmColoredViewersManager.showColoredLabels());

		super.initialize(viewer, column);
	}

	public void dispose() {
		super.dispose();
		VdmColoredViewersManager.uninstall(this);
	}

	public void update() {
		ColumnViewer viewer= getViewer();

		if (viewer == null) {
			return;
		}
		
		boolean needsUpdate= false;
		
		boolean showColoredLabels= VdmColoredViewersManager.showColoredLabels();
		if (showColoredLabels != isOwnerDrawEnabled()) {
			setOwnerDrawEnabled(showColoredLabels);
			needsUpdate= true;
		} else if (showColoredLabels) {
			needsUpdate= true;
		}
		if (needsUpdate) {
			fireLabelProviderChanged(new LabelProviderChangedEvent(this));
		}
	}

	protected StyleRange prepareStyleRange(StyleRange styleRange, boolean applyColors) {
		if (!applyColors && styleRange.background != null) {
			styleRange= super.prepareStyleRange(styleRange, applyColors);
			styleRange.borderStyle= SWT.BORDER_DOT;
			return styleRange;
		}
		return super.prepareStyleRange(styleRange, applyColors);
	}

	public String getText(Object element) {
		return getStyledText(element).getString();
	}

}
