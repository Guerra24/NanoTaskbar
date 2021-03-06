/*
 * This file is part of NanoUI
 * 
 * Copyright (C) 2016-2017 Lux Vacuos
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package net.luxvacuos.nanoui.ui;

import net.luxvacuos.nanoui.rendering.api.glfw.Window;
import net.luxvacuos.nanoui.rendering.api.nanovg.themes.Theme;
import net.luxvacuos.nanoui.rendering.api.nanovg.themes.Theme.ButtonStyle;

public class TitleBarButton extends Button {

	private ButtonStyle style = ButtonStyle.NONE;

	public TitleBarButton(float x, float y, float w, float h) {
		super(x, y, w, h, "");
	}

	@Override
	public void render(Window window) {
		if (!enabled)
			return;
		Theme.renderTitleBarButton(window.getNVGID(), rootComponent.rootX + alignedX,
				window.getHeight() - rootComponent.rootY - alignedY - h, w, h, style, inside);
	}

	public void setStyle(ButtonStyle style) {
		this.style = style;
	}

}
