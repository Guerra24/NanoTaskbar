/*
 * 
 * Copyright (C) 2017 Lux Vacuos
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

package net.luxvacuos.win32;

import com.sun.jna.Native;
import com.sun.jna.WString;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;

public interface UxTheme extends StdCallLibrary {

	public static final UxTheme INSTANCE = Native.loadLibrary("uxtheme", UxTheme.class, W32APIOptions.DEFAULT_OPTIONS);

	public HRESULT SetWindowTheme(HWND hwnd, WString pszSubAppName, WString pszSubIdList);
}
