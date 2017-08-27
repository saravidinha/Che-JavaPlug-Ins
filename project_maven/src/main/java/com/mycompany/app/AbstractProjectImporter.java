package com.mycompany.app;

import java.io.File;
import java.util.Objects;

public abstract class AbstractProjectImporter implements IProjectImporter {

	protected File rootFolder;

	@Override
	public void initialize(File rootFolder) {
		if (!Objects.equals(this.rootFolder, rootFolder)) {
			reset();
		}
		this.rootFolder = rootFolder;
	}

	@Override
	public void reset() {
		// No-Op
	}

}