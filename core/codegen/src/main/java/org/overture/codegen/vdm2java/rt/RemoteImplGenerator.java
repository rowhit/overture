package org.overture.codegen.vdm2java.rt;

import java.util.LinkedList;
import java.util.List;

import org.overture.codegen.cgast.declarations.AClassDeclCG;
import org.overture.codegen.cgast.declarations.AMethodDeclCG;
import org.overture.codegen.cgast.declarations.ARemoteContractImplDeclCG;
import org.overture.codegen.ir.IRGeneratedTag;

/*
 * This sets up the remote contract implementation
 * with the relevant parameters and methods described in
 * the main report.
 * 
 * Sets up the ARemoteContractImplDeclCG node
 */

public class RemoteImplGenerator {

	private List<AClassDeclCG> irClasses;

	public RemoteImplGenerator(List<AClassDeclCG> irClasses) {
		super();
		this.irClasses = irClasses;
	}

	public List<ARemoteContractImplDeclCG> run() {
		List<ARemoteContractImplDeclCG> contractImpls = new LinkedList<ARemoteContractImplDeclCG>();

		for(AClassDeclCG classCg : irClasses)
		{
			List<AMethodDeclCG> publicMethods = new LinkedList<AMethodDeclCG>();
			ARemoteContractImplDeclCG contractImpl = new ARemoteContractImplDeclCG();
			LinkedList<AMethodDeclCG> a = classCg.getMethods();
			contractImpl.setName(classCg.getName());
			contractImpl.setFields(classCg.getFields());
			contractImpl.setSuperName(classCg.getSuperName());
			contractImpl.setInnerClasses(classCg.getInnerClasses());
			contractImpl.setInterfaces(classCg.getInterfaces());
			contractImpl.setThread(classCg.getThread());
			if(classCg.getSuperName()==null) contractImpl.setIsUniCast(true);
			else contractImpl.setIsUniCast(false);
			for(AMethodDeclCG method : classCg.getMethods()){
				
				// The autogenerated method "toString" is skipped
				if(method.getName().equals("toString")){
				}
				else if(method.getAccess().equals("public") && !isIRGenerated(method)){ //&& !method.getIsConstructor()){
					method.setStatic(false);
					method.setIsRemote(true); // only public is remote
					publicMethods.add(method);
				}
				else{
					method.setStatic(false);
					method.setIsRemote(false);
					publicMethods.add(method);
				}
			}

			contractImpl.setMethods(publicMethods);

			contractImpls.add(contractImpl);
		}

		return contractImpls;
	}
	private boolean isIRGenerated(AMethodDeclCG method)
	{
		return method.getTag() instanceof IRGeneratedTag;
	}

}