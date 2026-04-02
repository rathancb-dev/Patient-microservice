package com.pm.billingservice.grpc;


import billing.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class BillingGrpcService extends BillingServiceGrpc.BillingServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);

    @Override
    public void createBillingAccount(BillingRequest billingRequest,
                                     StreamObserver<BillingResponse> responseObserver) {
        log.info("createBillingAccount request received {}", billingRequest.toString());
        // Business logic like save to db, perform cal etc

        BillingResponse response = BillingResponse.newBuilder()
                .setAccountId("123")
                .setStatus("Active")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
