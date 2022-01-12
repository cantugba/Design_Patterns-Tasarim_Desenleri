package SoldierComposite;

public class Main {
    public static void main(String[] args) {
        // root olusturulur
        CompositeSoldier generalBurak = new CompositeSoldier("Burak", Rank.General);

        // root altına Leaf tipten nesne örnekleri eklenir.
        generalBurak.AddSoldier(new PrimitiveSoldier("Mayk",Rank.Colonel));
        generalBurak.AddSoldier(new PrimitiveSoldier("Tobiassen",Rank.Colonel));

        // Composite tipler oluşturulur.
        CompositeSoldier colonelNevi=new CompositeSoldier("Nevi", Rank.Colonel);
        CompositeSoldier lieutenantColonelZing=new CompositeSoldier("Zing",
                Rank.LieutenantColonel);

        // Composite tipe bağlı primitive tipler oluşturulur.
        lieutenantColonelZing.AddSoldier(new PrimitiveSoldier("Tomasson", Rank.Captain));
        colonelNevi.AddSoldier(lieutenantColonelZing);
        colonelNevi.AddSoldier(new PrimitiveSoldier("Mayro", Rank.LieutenantColonel));

        // Root' un altına Composite nesne örneği eklenir.
        generalBurak.AddSoldier(colonelNevi);
        generalBurak.AddSoldier(new PrimitiveSoldier("Zulu",Rank.Colonel));

        // root için ExecuteOrder operasyonu uygulanır. Buna göre root altındaki tüm nesneler için bu operasyon uygulanır
        generalBurak.ExecuteOrder();
    }
}
