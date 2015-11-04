package org.YiiCommunity.GitterBot.PingCommand;

import com.amatkivskiy.gitter.rx.sdk.model.response.message.MessageResponse;
import com.amatkivskiy.gitter.rx.sdk.model.response.room.RoomResponse;
import org.YiiCommunity.GitterBot.api.Command;
import org.YiiCommunity.GitterBot.containers.Gitter;

public class Ping extends Command {
    @Override
    public void onMessage(RoomResponse room, MessageResponse message) {
        if (message.text.equals("ping")) {
            try {
                Gitter.sendMessage(room, "pong");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
