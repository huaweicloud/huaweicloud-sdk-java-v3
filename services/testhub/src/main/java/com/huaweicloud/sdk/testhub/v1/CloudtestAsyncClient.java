package com.huaweicloud.sdk.testhub.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.testhub.v1.model.*;

public class CloudtestAsyncClient {
    protected HcClient hcClient;

    public CloudtestAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudtestAsyncClient::new);
    }


    public CompletableFuture<CreatePlanResponse> createPlanAsync(CreatePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    public CompletableFuture<CreateTestCaseInPlanResponse> createTestCaseInPlanAsync(CreateTestCaseInPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createService);
    }

    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    public CompletableFuture<ShowRegisterServiceResponse> showRegisterServiceAsync(ShowRegisterServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateService);
    }

    public CompletableFuture<BatchDeleteTestCaseResponse> batchDeleteTestCaseAsync(BatchDeleteTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    public CompletableFuture<CreateTestCaseResponse> createTestCaseAsync(CreateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    public CompletableFuture<RunTestCaseResponse> runTestCaseAsync(RunTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    public CompletableFuture<ShowTestCaseDetailResponse> showTestCaseDetailAsync(ShowTestCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    public CompletableFuture<ShowTestCaseDetailV2Response> showTestCaseDetailV2Async(ShowTestCaseDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    public CompletableFuture<UpdateTestCaseResponse> updateTestCaseAsync(UpdateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    public CompletableFuture<UpdateTestCaseResultResponse> updateTestCaseResultAsync(UpdateTestCaseResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

}