/**
 * Copyright (c) 2015-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.multimedia.actions;

import org.openhab.core.scriptengine.action.ActionService;

public class AudioActionService implements ActionService {

	@Override
	public String getActionClassName() {
		return Audio.class.getCanonicalName();
	}

	@Override
	public Class<?> getActionClass() {
		return Audio.class;
	}

}
 