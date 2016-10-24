package me.heyimblake.proxyparty.Listeners;

import me.heyimblake.proxyparty.Events.PartyDisbandEvent;
import me.heyimblake.proxyparty.PartyUtils.Party;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

/**
 * Created by heyimblake on 10/24/2016.
 *
 * @author heyimblake
 *         Copyright (c) 2016 heyimblake.
 *         All rights reserved.
 */
public class PartyDisbandListener implements Listener {
    @EventHandler
    public void onPartyDisband(PartyDisbandEvent event) {
        Party party = event.getParty();
        party.sendMessage(party.getLeader() + " has disbanded the party!", ChatColor.YELLOW);
    }
}
