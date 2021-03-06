/*
 * This file is part of libbluray
 * Copyright (C) 2010  William Hahne
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package javax.tv.service.guide;

import javax.tv.locator.Locator;
import javax.tv.locator.InvalidLocatorException;
import javax.tv.service.SIRequest;
import javax.tv.service.SIRequestor;
import javax.tv.service.SIException;
import java.util.Date;

public interface ProgramSchedule {
    public SIRequest retrieveCurrentProgramEvent(SIRequestor requestor);

    public SIRequest retrieveFutureProgramEvent(Date date, SIRequestor requestor)
            throws SIException;

    public SIRequest retrieveFutureProgramEvents(Date begin, Date end,
            SIRequestor requestor) throws SIException;

    public SIRequest retrieveNextProgramEvent(ProgramEvent event,
            SIRequestor requestor) throws SIException;

    public SIRequest retrieveProgramEvent(Locator locator, SIRequestor requestor)
            throws InvalidLocatorException, SecurityException;

    public void addListener(ProgramScheduleListener listener);

    public void removeListener(ProgramScheduleListener listener);

    public Locator getServiceLocator();
}
