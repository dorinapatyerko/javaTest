package com.company;

// Olyan elvont fogalom, amely nem tagolható az Animal alá, mert az ottani rendet bontaná. Elvétve léteznek háziasított állatok
// Egy interfészben csak nyilvántartásba vesszük azokat a képességeket, amikre egy Petnek képesnek kell lennie, de ezek interfacen belül nincsenek definiálva.
public interface Pet {
    public void cuddle();
    public void sit();
    public void layDown();

}
