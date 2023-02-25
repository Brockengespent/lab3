package interfaces;

import base.Face;
import base.Group;
import base.Surrounding;

public interface DunnoEyes {
    public void stare(Face obj);

    public void notice(Surrounding obj);

    public void lookAround(Surrounding obj);

    public void watched(Group obj);
}
