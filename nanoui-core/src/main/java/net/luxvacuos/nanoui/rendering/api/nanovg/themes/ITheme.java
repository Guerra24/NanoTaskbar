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

package net.luxvacuos.nanoui.rendering.api.nanovg.themes;

import org.lwjgl.nanovg.NVGColor;

import net.luxvacuos.nanoui.rendering.api.nanovg.themes.Theme.ButtonStyle;

public interface ITheme {

	public void renderTitlebar(long vg, float w, NVGColor color);

	public float renderTitleBarText(long vg, String text, String font, int align, float x, float y, float fontSize);

	public void renderTitleBarButton(long vg, float x, float y, float w, float h, ButtonStyle style, boolean highlight);

	public float renderText(long vg, String text, String font, int align, float x, float y, float fontSize,
			NVGColor color);

	public void renderImage(long vg, float x, float y, float w, float h, int image, float alpha);

	public void renderImage(long vg, float x, float y, int image, float alpha);

	public void renderEditBoxBase(long vg, float x, float y, float w, float h, boolean selected);

	public void renderEditBox(long vg, String text, String font, float x, float y, float w, float h, float fontSize,
			boolean selected);

	public void renderButton(long vg, String preicon, String text, String font, String entypo, float x, float y,
			float w, float h, boolean highlight, float fontSize, float preiconSize);

	public void renderContexMenuButton(long vg, String text, String font, float x, float y, float w, float h,
			float fontSize, boolean highlight);

	public void renderToggleButton(long vg, String text, String font, float x, float y, float w, float h,
			float fontSize, boolean status);

	public void renderSpinner(long vg, float cx, float cy, float r, float t);

	public float renderParagraph(long vg, float x, float y, float width, float fontSize, String font, String text,
			int align, NVGColor color);

	public void renderBox(long vg, float x, float y, float w, float h, NVGColor color, float rt, float lt, float rb,
			float lb);

	public void renderSlider(long vg, float pos, float x, float y, float w, float h);

	public void renderScrollBarV(long vg, float x, float y, float w, float h, float pos, float sizeV);

	public void renderDropDownButton(long vg, float x, float y, float w, float h, float fontSize, String font,
			String entypo, String text, boolean inside);

	public void renderTaskbarWindowButton(long vg, String preicon, String text, String font, String entypo, float x,
			float y, float w, float h, boolean highlight, boolean active, boolean flash, float fontSize);

}
