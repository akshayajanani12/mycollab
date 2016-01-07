/**
 * This file is part of mycollab-mobile.
 *
 * mycollab-mobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-mobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-mobile.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.mobile.ui;

import com.vaadin.addon.touchkit.ui.DatePicker;

import java.util.Calendar;

/**
 * @author MyCollab Ltd.
 * @since 4.0
 */
public class BirthdayPickerField extends DatePicker {
    private static final long serialVersionUID = -7552080488000737394L;

    @Override
    public void attach() {
        super.attach();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2004);
        this.setMax(cal.getTime());
    }
}
