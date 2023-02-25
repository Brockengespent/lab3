import base.*;

public class FairyTale {
    public static void main(String[] args) {
        Group travelers = new Group("путешественники", " Наши отважные");
        Surrounding gate = new Surrounding("калитка");
        travelers.open(gate);
        Surrounding house = new Surrounding("домик", "своему");
        travelers.head(house);
        house.empty();
        Surrounding street = new Surrounding("улица", "");
        Dunno dunno = new Dunno("Незнайка", "");
        dunno.stayAlone(street);
        Group crowd = new Group("толпе", " удаляющейся");
        dunno.watched(crowd);
        Surrounding sides = new Surrounding("стороны", "");
        dunno.lookAround(sides);
        Someone someone = new Someone("кто-то");
        dunno.search(someone);
        street.itWas();
        Group everyone = new Group("Всех", "");
        Wind wind = new Wind("ветер");
        wind.blowAway(everyone);
        Face eyes = new Face("Глаза", "");
        eyes.become(dunno);
        Surrounding oppSite = new Surrounding("сторона улицы", "противоположной");
        dunno.notice(oppSite);
        Shadow shadow = new Shadow("тень забора");
        shadow.arise();
        Figure figure = new Figure("фигурка", "маленькая");
        figure.stay(shadow);
        Face openEyes = new Face("глаза", "широко открытыми");
        figure.observe(openEyes);
        Gunka gunka = new Gunka("Гунька");
        gunka.screech();
        gunka.rush(dunno);
        dunno.towards(gunka);
        Group mates = new Group("Приятели", "");
        Face foreheads = new Face("лбы", "");
        mates.notCollide(foreheads);
        mates.stop(street);
        Dunno friend = new Dunno("друг", "своего");
        gunka.overlook(friend);
        Dunno traveller = new Dunno("путешественник", "знаменитым");
        traveller.become();
        Face sadSmile = new Face("улыбка", "виноватой");
        dunno.stare(sadSmile);
        Group they = new Group("они", "");
        they.contemplate();
        they.stayLong();
        they.silence();
        Tears tears = new Tears("слёзы");
        they.hug();
        eyes.drop(tears);
    }

}