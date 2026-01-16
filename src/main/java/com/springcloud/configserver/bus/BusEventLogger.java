package com.springcloud.configserver.bus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BusEventLogger {

    private static final Logger log =
            LoggerFactory.getLogger(BusEventLogger.class);

    @EventListener
    public void onRefreshRemoteEvent(RefreshRemoteApplicationEvent event) {
        log.info(
                "RefreshRemoteApplicationEvent published. originService={}, destinationService={}",
                event.getOriginService(),
                event.getDestinationService()
        );
    }
}
