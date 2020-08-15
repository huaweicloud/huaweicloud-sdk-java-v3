package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.rds.v3.model.*;

public class RdsAsyncClient {
    protected HcClient hcClient;

    public RdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(RdsAsyncClient::new);
    }


    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagAction);
    }

    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createInstance);
    }

    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    public CompletableFuture<DoManualBackupResponse> doManualBackupAsync(DoManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.doManualBackup);
    }

    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listBackups);
    }

    public CompletableFuture<ListCollationsResponse> listCollationsAsync(ListCollationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listCollations);
    }

    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatastores);
    }

    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listFlavors);
    }

    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstances);
    }

    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.resetPwd);
    }

    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    public CompletableFuture<StartInstanceActionResponse> startInstanceActionAsync(StartInstanceActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceAction);
    }

    public CompletableFuture<UpdateDataIpResponse> updateDataIpAsync(UpdateDataIpRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePort);
    }

    public CompletableFuture<AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsync(AllowDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDatabase);
    }

    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDbUser);
    }

    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

}