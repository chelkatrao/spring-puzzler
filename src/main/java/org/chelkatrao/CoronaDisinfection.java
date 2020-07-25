package org.chelkatrao;

@Deprecated
public class CoronaDisinfection {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Dizinfeksiyani boshlayapmiz hamma xonadan chiqib ketsin");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Xonaga qaytib kirishingiz mumkun");
    }

    private void disinfect(Room room) {
        System.out.println("CoronaVirus honada chiqib ket");
    }

}
