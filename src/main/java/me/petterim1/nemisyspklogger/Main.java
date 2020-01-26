package me.petterim1.nemisyspklogger;

import org.itxtech.nemisys.event.EventHandler;
import org.itxtech.nemisys.event.Listener;
import org.itxtech.nemisys.event.server.DataPacketReceiveEvent;
import org.itxtech.nemisys.plugin.PluginBase;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        new Logger(System.getProperty("user.dir") + "/packets.log");
        getServer().getPluginManager().registerEvents(this, this);
    }

    /*@EventHandler
    public void send(DataPacketSendEvent e) {
        String p = e.getPlayer().getName();
        String pk = String.valueOf(e.getPacket().pid());
        Logger.get.print("Send|" + pk + '|' + p);
    }*/

    @EventHandler
    public void receive(DataPacketReceiveEvent e) {
        String p = e.getPlayer().getName();
        String pk = String.valueOf(e.getPacket().pid());
        Logger.get.print("Receive|" + pk + '|' + p);
    }
}
