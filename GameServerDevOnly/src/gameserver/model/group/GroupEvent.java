/**
 * This file is part of Aion X Emu <aionxemu.com>
 *
 *  This is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This software is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser Public License
 *  along with this software.  If not, see <http://www.gnu.org/licenses/>.
 */
package gameserver.model.group;

/**
 * @author Lyahim
 */
public enum GroupEvent {

    LEAVE(0),
    MOVEMENT(1),
    ENTER(5),
    UPDATE(5),
    CHANGELEADER(3);

    private int id;

    private GroupEvent(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
