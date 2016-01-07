package com.hp.octane.plugins.jenkins.model.processors.scm;

import com.hp.octane.plugins.jenkins.model.scm.SCMData;
import hudson.model.AbstractBuild;

/**
 * Created by gullery on 31/03/2015.
 */

public class UnsupportedSCMProcessor extends SCMProcessor {
	UnsupportedSCMProcessor() {
	}

	@Override
	public SCMData getSCMData(AbstractBuild build) {
		return null;
	}
}
