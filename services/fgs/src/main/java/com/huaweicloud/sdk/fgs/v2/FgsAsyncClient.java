package com.huaweicloud.sdk.fgs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.fgs.v2.model.*;

public class FgsAsyncClient {
    protected HcClient hcClient;

    public FgsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FgsAsyncClient> newBuilder() {
        return new ClientBuilder<>(FgsAsyncClient::new);
    }


    public CompletableFuture<AsyncInvokeFunctionResponse> asyncInvokeFunctionAsync(AsyncInvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.asyncInvokeFunction);
    }

    public CompletableFuture<CreateFunctionResponse> createFunctionAsync(CreateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.createFunction);
    }

    public CompletableFuture<CreateFunctionVersionResponse> createFunctionVersionAsync(CreateFunctionVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.createFunctionVersion);
    }

    public CompletableFuture<CreateVersionAliasResponse> createVersionAliasAsync(CreateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.createVersionAlias);
    }

    public CompletableFuture<DeleteFunctionResponse> deleteFunctionAsync(DeleteFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.deleteFunction);
    }

    public CompletableFuture<DeleteVersionAliasResponse> deleteVersionAliasAsync(DeleteVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.deleteVersionAlias);
    }

    public CompletableFuture<InvokeFunctionResponse> invokeFunctionAsync(InvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.invokeFunction);
    }

    public CompletableFuture<ListFunctionVersionsResponse> listFunctionVersionsAsync(ListFunctionVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.listFunctionVersions);
    }

    public CompletableFuture<ListFunctionsResponse> listFunctionsAsync(ListFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.listFunctions);
    }

    public CompletableFuture<ListVersionAliasesResponse> listVersionAliasesAsync(ListVersionAliasesRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.listVersionAliases);
    }

    public CompletableFuture<ShowFunctionCodeResponse> showFunctionCodeAsync(ShowFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.showFunctionCode);
    }

    public CompletableFuture<ShowFunctionConfigResponse> showFunctionConfigAsync(ShowFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.showFunctionConfig);
    }

    public CompletableFuture<ShowVersionAliasResponse> showVersionAliasAsync(ShowVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.showVersionAlias);
    }

    public CompletableFuture<UpdateFunctionCodeResponse> updateFunctionCodeAsync(UpdateFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.updateFunctionCode);
    }

    public CompletableFuture<UpdateFunctionConfigResponse> updateFunctionConfigAsync(UpdateFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.updateFunctionConfig);
    }

    public CompletableFuture<UpdateVersionAliasResponse> updateVersionAliasAsync(UpdateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.updateVersionAlias);
    }

    public CompletableFuture<BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersAsync(BatchDeleteFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.batchDeleteFunctionTriggers);
    }

    public CompletableFuture<CreateFunctionTriggerResponse> createFunctionTriggerAsync(CreateFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.createFunctionTrigger);
    }

    public CompletableFuture<DeleteFunctionTriggerResponse> deleteFunctionTriggerAsync(DeleteFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.deleteFunctionTrigger);
    }

    public CompletableFuture<ListFunctionTriggersResponse> listFunctionTriggersAsync(ListFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.listFunctionTriggers);
    }

    public CompletableFuture<ShowFunctionTriggerResponse> showFunctionTriggerAsync(ShowFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FgsMeta.showFunctionTrigger);
    }

}