package com.homework.hoework12;

abstract class BodyGuard {
    Gun gun ;
    abstract void applyMartialArts(Attacker attacker);{
    }

   public  void saveClientLife(Attacker attacker) {
        if (attacker.hasGun())
            gun.shoot();

        else
            applyMartialArts(attacker);
    }


}
