package com.huaweicloud.sdk.fgs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.fgs.v2.model.*;

public class FgsClient {
    protected HcClient hcClient;

    public FgsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FgsClient> newBuilder() {
        return new ClientBuilder<>(FgsClient::new);
    }

    public AsyncInvokeFunctionResponse asyncInvokeFunction(AsyncInvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.asyncInvokeFunction);
    }

    public CreateFunctionResponse createFunction(CreateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.createFunction);
    }

    public CreateFunctionVersionResponse createFunctionVersion(CreateFunctionVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.createFunctionVersion);
    }

    public CreateVersionAliasResponse createVersionAlias(CreateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.createVersionAlias);
    }

    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.deleteFunction);
    }

    public DeleteVersionAliasResponse deleteVersionAlias(DeleteVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.deleteVersionAlias);
    }

    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.invokeFunction);
    }

    public ListFunctionVersionsResponse listFunctionVersions(ListFunctionVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.listFunctionVersions);
    }

    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.listFunctions);
    }

    public ListVersionAliasesResponse listVersionAliases(ListVersionAliasesRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.listVersionAliases);
    }

    public ShowFunctionCodeResponse showFunctionCode(ShowFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.showFunctionCode);
    }

    public ShowFunctionConfigResponse showFunctionConfig(ShowFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.showFunctionConfig);
    }

    public ShowVersionAliasResponse showVersionAlias(ShowVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.showVersionAlias);
    }

    public UpdateFunctionCodeResponse updateFunctionCode(UpdateFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.updateFunctionCode);
    }

    public UpdateFunctionConfigResponse updateFunctionConfig(UpdateFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.updateFunctionConfig);
    }

    public UpdateVersionAliasResponse updateVersionAlias(UpdateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.updateVersionAlias);
    }

    public BatchDeleteFunctionTriggersResponse batchDeleteFunctionTriggers(BatchDeleteFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.batchDeleteFunctionTriggers);
    }

    public CreateFunctionTriggerResponse createFunctionTrigger(CreateFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.createFunctionTrigger);
    }

    public DeleteFunctionTriggerResponse deleteFunctionTrigger(DeleteFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.deleteFunctionTrigger);
    }

    public ListFunctionTriggersResponse listFunctionTriggers(ListFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.listFunctionTriggers);
    }

    public ShowFunctionTriggerResponse showFunctionTrigger(ShowFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FgsMeta.showFunctionTrigger);
    }

}