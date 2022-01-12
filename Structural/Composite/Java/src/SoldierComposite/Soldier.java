package SoldierComposite;

import jdk.jshell.spi.ExecutionControl;
import kotlin.NotImplementedError;

import java.util.ArrayList;
import java.util.List;

enum Rank{
        General,
        Colonel,
        LieutenantColonel,
        Major,
        Captain,
        Lieutenant
}

public abstract class Soldier {
    protected String _name;
    protected Rank _rank;

    public Soldier(String name, Rank rank) {
        this._name = name;
        this._rank = rank;
    }

    public abstract void AddSoldier(Soldier soldier);
    public abstract void RemoveSoldier(Soldier soldier);
    public abstract void ExecuteOrder(); // Hem Leaf hemde Composite tipi için uygulanacak olan fonksiyon
}

// leaf
class PrimitiveSoldier extends Soldier {

    public PrimitiveSoldier(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void AddSoldier(Soldier soldier) {
        throw new NotImplementedError("EXC");
    }

    @Override
    public void RemoveSoldier(Soldier soldier) {
        throw new NotImplementedError("EXC");
    }

    @Override
    public void ExecuteOrder() {
        System.out.println(_rank + " " + _name);
    }
}

// composite
class CompositeSoldier extends Soldier {
    private List<Soldier> soldiers = new ArrayList<>();

    public CompositeSoldier(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void AddSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    @Override
    public void RemoveSoldier(Soldier soldier) {
        soldiers.remove(soldier);
    }

    @Override
    public void ExecuteOrder() {
        System.out.println(super._rank + " " + super._name);
        for (Soldier soldier:soldiers) {
            soldier.ExecuteOrder();
        }
    }
}