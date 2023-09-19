package com.huaweicloud.sdk.sms.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sms.v3.model.CheckNetAclRequest;
import com.huaweicloud.sdk.sms.v3.model.CheckNetAclResponse;
import com.huaweicloud.sdk.sms.v3.model.CollectLogRequest;
import com.huaweicloud.sdk.sms.v3.model.CollectLogResponse;
import com.huaweicloud.sdk.sms.v3.model.CreateMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.CreateMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.CreatePrivacyAgreementsRequest;
import com.huaweicloud.sdk.sms.v3.model.CreatePrivacyAgreementsResponse;
import com.huaweicloud.sdk.sms.v3.model.CreateTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.CreateTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.CreateTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.CreateTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteServerRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteServerResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteServersRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteServersResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTasksRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTasksResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplatesRequest;
import com.huaweicloud.sdk.sms.v3.model.DeleteTemplatesResponse;
import com.huaweicloud.sdk.sms.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.sms.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.sms.v3.model.ListErrorServersRequest;
import com.huaweicloud.sdk.sms.v3.model.ListErrorServersResponse;
import com.huaweicloud.sdk.sms.v3.model.ListMigprojectsRequest;
import com.huaweicloud.sdk.sms.v3.model.ListMigprojectsResponse;
import com.huaweicloud.sdk.sms.v3.model.ListServersRequest;
import com.huaweicloud.sdk.sms.v3.model.ListServersResponse;
import com.huaweicloud.sdk.sms.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.sms.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.sms.v3.model.ListTemplatesRequest;
import com.huaweicloud.sdk.sms.v3.model.ListTemplatesResponse;
import com.huaweicloud.sdk.sms.v3.model.RegisterServerRequest;
import com.huaweicloud.sdk.sms.v3.model.RegisterServerResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowCertKeyRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowCertKeyResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowCommandRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowCommandResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigSettingRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowConfigSettingResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowOverviewRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowOverviewResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowPassphraseRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowPassphraseResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowPrivacyAgreementsRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowPrivacyAgreementsResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowServerRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowServerResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowSha256Request;
import com.huaweicloud.sdk.sms.v3.model.ShowSha256Response;
import com.huaweicloud.sdk.sms.v3.model.ShowTargetPasswordRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowTargetPasswordResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.ShowsSpeedLimitsRequest;
import com.huaweicloud.sdk.sms.v3.model.ShowsSpeedLimitsResponse;
import com.huaweicloud.sdk.sms.v3.model.UnlockTargetEcsRequest;
import com.huaweicloud.sdk.sms.v3.model.UnlockTargetEcsResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateCommandResultRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateCommandResultResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateCopyStateRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateCopyStateResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateDefaultMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateDefaultMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateDiskInfoRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateDiskInfoResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateMigprojectRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateMigprojectResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateNetworkCheckInfoRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateNetworkCheckInfoResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateServerNameRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateServerNameResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateSpeedRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateSpeedResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskSpeedRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskSpeedResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskStatusRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskStatusResponse;
import com.huaweicloud.sdk.sms.v3.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.sms.v3.model.UpdateTemplateResponse;
import com.huaweicloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingRequest;
import com.huaweicloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingResponse;

import java.util.concurrent.CompletableFuture;

public class SmsAsyncClient {

    protected HcClient hcClient;

    public SmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmsAsyncClient> newBuilder() {
        ClientBuilder<SmsAsyncClient> clientBuilder = new ClientBuilder<>(SmsAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 检查网卡安全组端口是否符合要求
     *
     * 检查网卡安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckNetAclRequest 请求对象
     * @return CompletableFuture<CheckNetAclResponse>
     */
    public CompletableFuture<CheckNetAclResponse> checkNetAclAsync(CheckNetAclRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.checkNetAcl);
    }

    /**
     * 检查网卡安全组端口是否符合要求
     *
     * 检查网卡安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckNetAclRequest 请求对象
     * @return AsyncInvoker<CheckNetAclRequest, CheckNetAclResponse>
     */
    public AsyncInvoker<CheckNetAclRequest, CheckNetAclResponse> checkNetAclAsyncInvoker(CheckNetAclRequest request) {
        return new AsyncInvoker<CheckNetAclRequest, CheckNetAclResponse>(request, SmsMeta.checkNetAcl, hcClient);
    }

    /**
     * 上传迁移任务的日志
     *
     * 上传迁移任务的日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectLogRequest 请求对象
     * @return CompletableFuture<CollectLogResponse>
     */
    public CompletableFuture<CollectLogResponse> collectLogAsync(CollectLogRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.collectLog);
    }

    /**
     * 上传迁移任务的日志
     *
     * 上传迁移任务的日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectLogRequest 请求对象
     * @return AsyncInvoker<CollectLogRequest, CollectLogResponse>
     */
    public AsyncInvoker<CollectLogRequest, CollectLogResponse> collectLogAsyncInvoker(CollectLogRequest request) {
        return new AsyncInvoker<CollectLogRequest, CollectLogResponse>(request, SmsMeta.collectLog, hcClient);
    }

    /**
     * 新建迁移项目
     *
     * 新建迁移项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMigprojectRequest 请求对象
     * @return CompletableFuture<CreateMigprojectResponse>
     */
    public CompletableFuture<CreateMigprojectResponse> createMigprojectAsync(CreateMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.createMigproject);
    }

    /**
     * 新建迁移项目
     *
     * 新建迁移项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMigprojectRequest 请求对象
     * @return AsyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse>
     */
    public AsyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse> createMigprojectAsyncInvoker(
        CreateMigprojectRequest request) {
        return new AsyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse>(request, SmsMeta.createMigproject,
            hcClient);
    }

    /**
     * 同意隐私协议
     *
     * 同意隐私协议接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivacyAgreementsRequest 请求对象
     * @return CompletableFuture<CreatePrivacyAgreementsResponse>
     */
    public CompletableFuture<CreatePrivacyAgreementsResponse> createPrivacyAgreementsAsync(
        CreatePrivacyAgreementsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.createPrivacyAgreements);
    }

    /**
     * 同意隐私协议
     *
     * 同意隐私协议接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivacyAgreementsRequest 请求对象
     * @return AsyncInvoker<CreatePrivacyAgreementsRequest, CreatePrivacyAgreementsResponse>
     */
    public AsyncInvoker<CreatePrivacyAgreementsRequest, CreatePrivacyAgreementsResponse> createPrivacyAgreementsAsyncInvoker(
        CreatePrivacyAgreementsRequest request) {
        return new AsyncInvoker<CreatePrivacyAgreementsRequest, CreatePrivacyAgreementsResponse>(request,
            SmsMeta.createPrivacyAgreements, hcClient);
    }

    /**
     * 创建迁移任务
     *
     * 根据源端服务器创建一个迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.createTask);
    }

    /**
     * 创建迁移任务
     *
     * 根据源端服务器创建一个迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, SmsMeta.createTask, hcClient);
    }

    /**
     * 新增模板信息
     *
     * 新增源端模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.createTemplate);
    }

    /**
     * 新增模板信息
     *
     * 新增源端模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, SmsMeta.createTemplate,
            hcClient);
    }

    /**
     * 删除迁移项目
     *
     * 删除指定ID的迁移项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMigprojectRequest 请求对象
     * @return CompletableFuture<DeleteMigprojectResponse>
     */
    public CompletableFuture<DeleteMigprojectResponse> deleteMigprojectAsync(DeleteMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteMigproject);
    }

    /**
     * 删除迁移项目
     *
     * 删除指定ID的迁移项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMigprojectRequest 请求对象
     * @return AsyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse>
     */
    public AsyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse> deleteMigprojectAsyncInvoker(
        DeleteMigprojectRequest request) {
        return new AsyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse>(request, SmsMeta.deleteMigproject,
            hcClient);
    }

    /**
     * 删除指定ID的源端服务器信息
     *
     * 从主机迁移服务界面上删除指定ID的源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerRequest 请求对象
     * @return CompletableFuture<DeleteServerResponse>
     */
    public CompletableFuture<DeleteServerResponse> deleteServerAsync(DeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteServer);
    }

    /**
     * 删除指定ID的源端服务器信息
     *
     * 从主机迁移服务界面上删除指定ID的源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerRequest 请求对象
     * @return AsyncInvoker<DeleteServerRequest, DeleteServerResponse>
     */
    public AsyncInvoker<DeleteServerRequest, DeleteServerResponse> deleteServerAsyncInvoker(
        DeleteServerRequest request) {
        return new AsyncInvoker<DeleteServerRequest, DeleteServerResponse>(request, SmsMeta.deleteServer, hcClient);
    }

    /**
     * 批量删除源端服务器信息
     *
     * 批量删除源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServersRequest 请求对象
     * @return CompletableFuture<DeleteServersResponse>
     */
    public CompletableFuture<DeleteServersResponse> deleteServersAsync(DeleteServersRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteServers);
    }

    /**
     * 批量删除源端服务器信息
     *
     * 批量删除源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServersRequest 请求对象
     * @return AsyncInvoker<DeleteServersRequest, DeleteServersResponse>
     */
    public AsyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersAsyncInvoker(
        DeleteServersRequest request) {
        return new AsyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, SmsMeta.deleteServers, hcClient);
    }

    /**
     * 删除指定ID的迁移任务
     *
     * 删除指定ID的迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTask);
    }

    /**
     * 删除指定ID的迁移任务
     *
     * 删除指定ID的迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, SmsMeta.deleteTask, hcClient);
    }

    /**
     * 批量删除迁移任务
     *
     * 批量删除迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTasksRequest 请求对象
     * @return CompletableFuture<DeleteTasksResponse>
     */
    public CompletableFuture<DeleteTasksResponse> deleteTasksAsync(DeleteTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTasks);
    }

    /**
     * 批量删除迁移任务
     *
     * 批量删除迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTasksRequest 请求对象
     * @return AsyncInvoker<DeleteTasksRequest, DeleteTasksResponse>
     */
    public AsyncInvoker<DeleteTasksRequest, DeleteTasksResponse> deleteTasksAsyncInvoker(DeleteTasksRequest request) {
        return new AsyncInvoker<DeleteTasksRequest, DeleteTasksResponse>(request, SmsMeta.deleteTasks, hcClient);
    }

    /**
     * 删除指定ID的模板
     *
     * 删除指定ID的模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTemplate);
    }

    /**
     * 删除指定ID的模板
     *
     * 删除指定ID的模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, SmsMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 批量删除指定ID的模板
     *
     * 批量删除指定ID的模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplatesRequest 请求对象
     * @return CompletableFuture<DeleteTemplatesResponse>
     */
    public CompletableFuture<DeleteTemplatesResponse> deleteTemplatesAsync(DeleteTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTemplates);
    }

    /**
     * 批量删除指定ID的模板
     *
     * 批量删除指定ID的模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplatesRequest 请求对象
     * @return AsyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse>
     */
    public AsyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplatesAsyncInvoker(
        DeleteTemplatesRequest request) {
        return new AsyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse>(request, SmsMeta.deleteTemplates,
            hcClient);
    }

    /**
     * 查询待迁移源端的所有错误
     *
     * 主机迁移过程中可能发生错误，使用该接口可以批量查询迁移过程中出现错误的源端服务器信息，以及它们的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorServersRequest 请求对象
     * @return CompletableFuture<ListErrorServersResponse>
     */
    public CompletableFuture<ListErrorServersResponse> listErrorServersAsync(ListErrorServersRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listErrorServers);
    }

    /**
     * 查询待迁移源端的所有错误
     *
     * 主机迁移过程中可能发生错误，使用该接口可以批量查询迁移过程中出现错误的源端服务器信息，以及它们的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorServersRequest 请求对象
     * @return AsyncInvoker<ListErrorServersRequest, ListErrorServersResponse>
     */
    public AsyncInvoker<ListErrorServersRequest, ListErrorServersResponse> listErrorServersAsyncInvoker(
        ListErrorServersRequest request) {
        return new AsyncInvoker<ListErrorServersRequest, ListErrorServersResponse>(request, SmsMeta.listErrorServers,
            hcClient);
    }

    /**
     * 获取项目列表
     *
     * 主机迁移服务中可以使用迁移项目来对源端进行项目管理，使用该接口获取当前账户下所有的迁移项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMigprojectsRequest 请求对象
     * @return CompletableFuture<ListMigprojectsResponse>
     */
    public CompletableFuture<ListMigprojectsResponse> listMigprojectsAsync(ListMigprojectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listMigprojects);
    }

    /**
     * 获取项目列表
     *
     * 主机迁移服务中可以使用迁移项目来对源端进行项目管理，使用该接口获取当前账户下所有的迁移项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMigprojectsRequest 请求对象
     * @return AsyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse>
     */
    public AsyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse> listMigprojectsAsyncInvoker(
        ListMigprojectsRequest request) {
        return new AsyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse>(request, SmsMeta.listMigprojects,
            hcClient);
    }

    /**
     * 查询源端服务器列表
     *
     * 用户在源端安装并成功启动Agent后，Agent会将源端服务器信息注册在主机迁移服务中，调用该接口查询已注册的源端服务器列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersRequest 请求对象
     * @return CompletableFuture<ListServersResponse>
     */
    public CompletableFuture<ListServersResponse> listServersAsync(ListServersRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listServers);
    }

    /**
     * 查询源端服务器列表
     *
     * 用户在源端安装并成功启动Agent后，Agent会将源端服务器信息注册在主机迁移服务中，调用该接口查询已注册的源端服务器列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersRequest 请求对象
     * @return AsyncInvoker<ListServersRequest, ListServersResponse>
     */
    public AsyncInvoker<ListServersRequest, ListServersResponse> listServersAsyncInvoker(ListServersRequest request) {
        return new AsyncInvoker<ListServersRequest, ListServersResponse>(request, SmsMeta.listServers, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 在设置目的端后，主机迁移服务会自动创建迁移任务，使用该接口可以查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listTasks);
    }

    /**
     * 查询迁移任务列表
     *
     * 在设置目的端后，主机迁移服务会自动创建迁移任务，使用该接口可以查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<ListTasksRequest, ListTasksResponse>(request, SmsMeta.listTasks, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询弹性云服务器模板列表，迁移时选择“新建服务器”时可使用该模板创建弹性云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询弹性云服务器模板列表，迁移时选择“新建服务器”时可使用该模板创建弹性云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, SmsMeta.listTemplates, hcClient);
    }

    /**
     * 上报源端服务器基本信息
     *
     * 上报源端服务器信息，上报成功后会在sms服务器列表中看到对应的源端服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerRequest 请求对象
     * @return CompletableFuture<RegisterServerResponse>
     */
    public CompletableFuture<RegisterServerResponse> registerServerAsync(RegisterServerRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.registerServer);
    }

    /**
     * 上报源端服务器基本信息
     *
     * 上报源端服务器信息，上报成功后会在sms服务器列表中看到对应的源端服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerRequest 请求对象
     * @return AsyncInvoker<RegisterServerRequest, RegisterServerResponse>
     */
    public AsyncInvoker<RegisterServerRequest, RegisterServerResponse> registerServerAsyncInvoker(
        RegisterServerRequest request) {
        return new AsyncInvoker<RegisterServerRequest, RegisterServerResponse>(request, SmsMeta.registerServer,
            hcClient);
    }

    /**
     * 获取SSL目的端证书和私钥
     *
     * 当源端服务器为Windows操作系统时，安装在源端服务器上的迁移Agent通过SSLSocket同目的端服务器通信，该接口用于下载目的端服务器所需要的证书和私钥(PEM格式)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertKeyRequest 请求对象
     * @return CompletableFuture<ShowCertKeyResponse>
     */
    public CompletableFuture<ShowCertKeyResponse> showCertKeyAsync(ShowCertKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showCertKey);
    }

    /**
     * 获取SSL目的端证书和私钥
     *
     * 当源端服务器为Windows操作系统时，安装在源端服务器上的迁移Agent通过SSLSocket同目的端服务器通信，该接口用于下载目的端服务器所需要的证书和私钥(PEM格式)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertKeyRequest 请求对象
     * @return AsyncInvoker<ShowCertKeyRequest, ShowCertKeyResponse>
     */
    public AsyncInvoker<ShowCertKeyRequest, ShowCertKeyResponse> showCertKeyAsyncInvoker(ShowCertKeyRequest request) {
        return new AsyncInvoker<ShowCertKeyRequest, ShowCertKeyResponse>(request, SmsMeta.showCertKey, hcClient);
    }

    /**
     * 获取服务端命令
     *
     * 迁移Agent调用该接口从SMS服务端获取下发给指定源端迁移Agent的命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommandRequest 请求对象
     * @return CompletableFuture<ShowCommandResponse>
     */
    public CompletableFuture<ShowCommandResponse> showCommandAsync(ShowCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showCommand);
    }

    /**
     * 获取服务端命令
     *
     * 迁移Agent调用该接口从SMS服务端获取下发给指定源端迁移Agent的命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommandRequest 请求对象
     * @return AsyncInvoker<ShowCommandRequest, ShowCommandResponse>
     */
    public AsyncInvoker<ShowCommandRequest, ShowCommandResponse> showCommandAsyncInvoker(ShowCommandRequest request) {
        return new AsyncInvoker<ShowCommandRequest, ShowCommandResponse>(request, SmsMeta.showCommand, hcClient);
    }

    /**
     * 查询配置资源
     *
     * 使用该接口查询任指定任务的指定配置类型的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigSettingRequest 请求对象
     * @return CompletableFuture<ShowConfigSettingResponse>
     */
    public CompletableFuture<ShowConfigSettingResponse> showConfigSettingAsync(ShowConfigSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showConfigSetting);
    }

    /**
     * 查询配置资源
     *
     * 使用该接口查询任指定任务的指定配置类型的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigSettingRequest 请求对象
     * @return AsyncInvoker<ShowConfigSettingRequest, ShowConfigSettingResponse>
     */
    public AsyncInvoker<ShowConfigSettingRequest, ShowConfigSettingResponse> showConfigSettingAsyncInvoker(
        ShowConfigSettingRequest request) {
        return new AsyncInvoker<ShowConfigSettingRequest, ShowConfigSettingResponse>(request, SmsMeta.showConfigSetting,
            hcClient);
    }

    /**
     * 查询指定ID迁移项目详情
     *
     * 查询指定ID的迁移项目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMigprojectRequest 请求对象
     * @return CompletableFuture<ShowMigprojectResponse>
     */
    public CompletableFuture<ShowMigprojectResponse> showMigprojectAsync(ShowMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showMigproject);
    }

    /**
     * 查询指定ID迁移项目详情
     *
     * 查询指定ID的迁移项目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMigprojectRequest 请求对象
     * @return AsyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse>
     */
    public AsyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse> showMigprojectAsyncInvoker(
        ShowMigprojectRequest request) {
        return new AsyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse>(request, SmsMeta.showMigproject,
            hcClient);
    }

    /**
     * 获取服务器总览
     *
     * 获取服务器总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
     * @return CompletableFuture<ShowOverviewResponse>
     */
    public CompletableFuture<ShowOverviewResponse> showOverviewAsync(ShowOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showOverview);
    }

    /**
     * 获取服务器总览
     *
     * 获取服务器总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
     * @return AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewAsyncInvoker(
        ShowOverviewRequest request) {
        return new AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, SmsMeta.showOverview, hcClient);
    }

    /**
     * 查询指定任务ID的安全传输通道的证书passphrase
     *
     * 查询指定任务ID的安全传输通道的证书passphrase。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPassphraseRequest 请求对象
     * @return CompletableFuture<ShowPassphraseResponse>
     */
    public CompletableFuture<ShowPassphraseResponse> showPassphraseAsync(ShowPassphraseRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showPassphrase);
    }

    /**
     * 查询指定任务ID的安全传输通道的证书passphrase
     *
     * 查询指定任务ID的安全传输通道的证书passphrase。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPassphraseRequest 请求对象
     * @return AsyncInvoker<ShowPassphraseRequest, ShowPassphraseResponse>
     */
    public AsyncInvoker<ShowPassphraseRequest, ShowPassphraseResponse> showPassphraseAsyncInvoker(
        ShowPassphraseRequest request) {
        return new AsyncInvoker<ShowPassphraseRequest, ShowPassphraseResponse>(request, SmsMeta.showPassphrase,
            hcClient);
    }

    /**
     * 查询用户是否同意隐私协议
     *
     * 查询用户是否同意隐私协议接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivacyAgreementsRequest 请求对象
     * @return CompletableFuture<ShowPrivacyAgreementsResponse>
     */
    public CompletableFuture<ShowPrivacyAgreementsResponse> showPrivacyAgreementsAsync(
        ShowPrivacyAgreementsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showPrivacyAgreements);
    }

    /**
     * 查询用户是否同意隐私协议
     *
     * 查询用户是否同意隐私协议接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivacyAgreementsRequest 请求对象
     * @return AsyncInvoker<ShowPrivacyAgreementsRequest, ShowPrivacyAgreementsResponse>
     */
    public AsyncInvoker<ShowPrivacyAgreementsRequest, ShowPrivacyAgreementsResponse> showPrivacyAgreementsAsyncInvoker(
        ShowPrivacyAgreementsRequest request) {
        return new AsyncInvoker<ShowPrivacyAgreementsRequest, ShowPrivacyAgreementsResponse>(request,
            SmsMeta.showPrivacyAgreements, hcClient);
    }

    /**
     * 查询指定ID的源端服务器
     *
     * 迁移Agent将源端服务器信息上报到主机迁移服务后，主机迁移服务会对迁移的可行性进行检测，该接口返回源端服务器的基本信息和检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerRequest 请求对象
     * @return CompletableFuture<ShowServerResponse>
     */
    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showServer);
    }

    /**
     * 查询指定ID的源端服务器
     *
     * 迁移Agent将源端服务器信息上报到主机迁移服务后，主机迁移服务会对迁移的可行性进行检测，该接口返回源端服务器的基本信息和检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerRequest 请求对象
     * @return AsyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<ShowServerRequest, ShowServerResponse>(request, SmsMeta.showServer, hcClient);
    }

    /**
     * 计算sha256
     *
     * 计算sha256，加密字段值为uuid。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSha256Request 请求对象
     * @return CompletableFuture<ShowSha256Response>
     */
    public CompletableFuture<ShowSha256Response> showSha256Async(ShowSha256Request request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showSha256);
    }

    /**
     * 计算sha256
     *
     * 计算sha256，加密字段值为uuid。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSha256Request 请求对象
     * @return AsyncInvoker<ShowSha256Request, ShowSha256Response>
     */
    public AsyncInvoker<ShowSha256Request, ShowSha256Response> showSha256AsyncInvoker(ShowSha256Request request) {
        return new AsyncInvoker<ShowSha256Request, ShowSha256Response>(request, SmsMeta.showSha256, hcClient);
    }

    /**
     * 查询指定ID的模板中的目的端服务器的密码
     *
     * 查询指定ID的模板中的目的端服务器的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTargetPasswordRequest 请求对象
     * @return CompletableFuture<ShowTargetPasswordResponse>
     */
    public CompletableFuture<ShowTargetPasswordResponse> showTargetPasswordAsync(ShowTargetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showTargetPassword);
    }

    /**
     * 查询指定ID的模板中的目的端服务器的密码
     *
     * 查询指定ID的模板中的目的端服务器的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTargetPasswordRequest 请求对象
     * @return AsyncInvoker<ShowTargetPasswordRequest, ShowTargetPasswordResponse>
     */
    public AsyncInvoker<ShowTargetPasswordRequest, ShowTargetPasswordResponse> showTargetPasswordAsyncInvoker(
        ShowTargetPasswordRequest request) {
        return new AsyncInvoker<ShowTargetPasswordRequest, ShowTargetPasswordResponse>(request,
            SmsMeta.showTargetPassword, hcClient);
    }

    /**
     * 查询指定ID的迁移任务
     *
     * 查询指定ID的迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showTask);
    }

    /**
     * 查询指定ID的迁移任务
     *
     * 查询指定ID的迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, SmsMeta.showTask, hcClient);
    }

    /**
     * 查询指定ID模板信息
     *
     * 查询指定ID的弹性云服务器模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return CompletableFuture<ShowTemplateResponse>
     */
    public CompletableFuture<ShowTemplateResponse> showTemplateAsync(ShowTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showTemplate);
    }

    /**
     * 查询指定ID模板信息
     *
     * 查询指定ID的弹性云服务器模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateAsyncInvoker(
        ShowTemplateRequest request) {
        return new AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, SmsMeta.showTemplate, hcClient);
    }

    /**
     * 查询任务限速规则
     *
     * 按时间段查询迁移任务的迁移速率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowsSpeedLimitsRequest 请求对象
     * @return CompletableFuture<ShowsSpeedLimitsResponse>
     */
    public CompletableFuture<ShowsSpeedLimitsResponse> showsSpeedLimitsAsync(ShowsSpeedLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showsSpeedLimits);
    }

    /**
     * 查询任务限速规则
     *
     * 按时间段查询迁移任务的迁移速率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowsSpeedLimitsRequest 请求对象
     * @return AsyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse>
     */
    public AsyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> showsSpeedLimitsAsyncInvoker(
        ShowsSpeedLimitsRequest request) {
        return new AsyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse>(request, SmsMeta.showsSpeedLimits,
            hcClient);
    }

    /**
     * 解锁指定任务的目的端服务器
     *
     * 解锁指定任务的目的端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockTargetEcsRequest 请求对象
     * @return CompletableFuture<UnlockTargetEcsResponse>
     */
    public CompletableFuture<UnlockTargetEcsResponse> unlockTargetEcsAsync(UnlockTargetEcsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.unlockTargetEcs);
    }

    /**
     * 解锁指定任务的目的端服务器
     *
     * 解锁指定任务的目的端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockTargetEcsRequest 请求对象
     * @return AsyncInvoker<UnlockTargetEcsRequest, UnlockTargetEcsResponse>
     */
    public AsyncInvoker<UnlockTargetEcsRequest, UnlockTargetEcsResponse> unlockTargetEcsAsyncInvoker(
        UnlockTargetEcsRequest request) {
        return new AsyncInvoker<UnlockTargetEcsRequest, UnlockTargetEcsResponse>(request, SmsMeta.unlockTargetEcs,
            hcClient);
    }

    /**
     * 上报服务端命令执行结果
     *
     * 迁移Agent调用该接口向SMS服务端反馈指定指令的执行结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCommandResultRequest 请求对象
     * @return CompletableFuture<UpdateCommandResultResponse>
     */
    public CompletableFuture<UpdateCommandResultResponse> updateCommandResultAsync(UpdateCommandResultRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateCommandResult);
    }

    /**
     * 上报服务端命令执行结果
     *
     * 迁移Agent调用该接口向SMS服务端反馈指定指令的执行结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCommandResultRequest 请求对象
     * @return AsyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse>
     */
    public AsyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse> updateCommandResultAsyncInvoker(
        UpdateCommandResultRequest request) {
        return new AsyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse>(request,
            SmsMeta.updateCommandResult, hcClient);
    }

    /**
     * 更新任务对应源端复制状态
     *
     * 更新任务对应源端复制状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCopyStateRequest 请求对象
     * @return CompletableFuture<UpdateCopyStateResponse>
     */
    public CompletableFuture<UpdateCopyStateResponse> updateCopyStateAsync(UpdateCopyStateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateCopyState);
    }

    /**
     * 更新任务对应源端复制状态
     *
     * 更新任务对应源端复制状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCopyStateRequest 请求对象
     * @return AsyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse>
     */
    public AsyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse> updateCopyStateAsyncInvoker(
        UpdateCopyStateRequest request) {
        return new AsyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse>(request, SmsMeta.updateCopyState,
            hcClient);
    }

    /**
     * 更新默认迁移项目
     *
     * 更改默认迁移项目，注册源端会注册在当前的默认项目下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDefaultMigprojectRequest 请求对象
     * @return CompletableFuture<UpdateDefaultMigprojectResponse>
     */
    public CompletableFuture<UpdateDefaultMigprojectResponse> updateDefaultMigprojectAsync(
        UpdateDefaultMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateDefaultMigproject);
    }

    /**
     * 更新默认迁移项目
     *
     * 更改默认迁移项目，注册源端会注册在当前的默认项目下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDefaultMigprojectRequest 请求对象
     * @return AsyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse>
     */
    public AsyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> updateDefaultMigprojectAsyncInvoker(
        UpdateDefaultMigprojectRequest request) {
        return new AsyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse>(request,
            SmsMeta.updateDefaultMigproject, hcClient);
    }

    /**
     * 更新磁盘信息
     *
     * 更新服务器的磁盘信息，此接口会把服务器原有磁盘信息清空，然后更新成新磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDiskInfoRequest 请求对象
     * @return CompletableFuture<UpdateDiskInfoResponse>
     */
    public CompletableFuture<UpdateDiskInfoResponse> updateDiskInfoAsync(UpdateDiskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateDiskInfo);
    }

    /**
     * 更新磁盘信息
     *
     * 更新服务器的磁盘信息，此接口会把服务器原有磁盘信息清空，然后更新成新磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDiskInfoRequest 请求对象
     * @return AsyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse>
     */
    public AsyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse> updateDiskInfoAsyncInvoker(
        UpdateDiskInfoRequest request) {
        return new AsyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse>(request, SmsMeta.updateDiskInfo,
            hcClient);
    }

    /**
     * 更新迁移项目信息
     *
     * 更新迁移项目的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMigprojectRequest 请求对象
     * @return CompletableFuture<UpdateMigprojectResponse>
     */
    public CompletableFuture<UpdateMigprojectResponse> updateMigprojectAsync(UpdateMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateMigproject);
    }

    /**
     * 更新迁移项目信息
     *
     * 更新迁移项目的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMigprojectRequest 请求对象
     * @return AsyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse>
     */
    public AsyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse> updateMigprojectAsyncInvoker(
        UpdateMigprojectRequest request) {
        return new AsyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse>(request, SmsMeta.updateMigproject,
            hcClient);
    }

    /**
     * 更新网络检测相关的信息
     *
     * Agent 上报网络检测相关的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNetworkCheckInfoRequest 请求对象
     * @return CompletableFuture<UpdateNetworkCheckInfoResponse>
     */
    public CompletableFuture<UpdateNetworkCheckInfoResponse> updateNetworkCheckInfoAsync(
        UpdateNetworkCheckInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateNetworkCheckInfo);
    }

    /**
     * 更新网络检测相关的信息
     *
     * Agent 上报网络检测相关的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNetworkCheckInfoRequest 请求对象
     * @return AsyncInvoker<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse>
     */
    public AsyncInvoker<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> updateNetworkCheckInfoAsyncInvoker(
        UpdateNetworkCheckInfoRequest request) {
        return new AsyncInvoker<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse>(request,
            SmsMeta.updateNetworkCheckInfo, hcClient);
    }

    /**
     * 修改指定ID的源端服务器名称
     *
     * 该功能用来修改SMS服务端的源端名称，方便用户对源端进行管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerNameRequest 请求对象
     * @return CompletableFuture<UpdateServerNameResponse>
     */
    public CompletableFuture<UpdateServerNameResponse> updateServerNameAsync(UpdateServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateServerName);
    }

    /**
     * 修改指定ID的源端服务器名称
     *
     * 该功能用来修改SMS服务端的源端名称，方便用户对源端进行管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerNameRequest 请求对象
     * @return AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>
     */
    public AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameAsyncInvoker(
        UpdateServerNameRequest request) {
        return new AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>(request, SmsMeta.updateServerName,
            hcClient);
    }

    /**
     * 设置迁移限速规则
     *
     * 设置迁移任务的迁移速率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSpeedRequest 请求对象
     * @return CompletableFuture<UpdateSpeedResponse>
     */
    public CompletableFuture<UpdateSpeedResponse> updateSpeedAsync(UpdateSpeedRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateSpeed);
    }

    /**
     * 设置迁移限速规则
     *
     * 设置迁移任务的迁移速率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSpeedRequest 请求对象
     * @return AsyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse>
     */
    public AsyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse> updateSpeedAsyncInvoker(UpdateSpeedRequest request) {
        return new AsyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse>(request, SmsMeta.updateSpeed, hcClient);
    }

    /**
     * 更新指定ID的迁移任务
     *
     * 更新指定ID的迁移任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTask);
    }

    /**
     * 更新指定ID的迁移任务
     *
     * 更新指定ID的迁移任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, SmsMeta.updateTask, hcClient);
    }

    /**
     * 上报数据迁移进度和速率
     *
     * 此接口由安装在源端服务器上的迁移Agent在数据迁移阶段调用，用来将迁移的具体进度上报给SMS服务端。
     * 
     * 迁移Agent自动调用此接口用于上报数据迁移进度，您无需调用此接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskSpeedRequest 请求对象
     * @return CompletableFuture<UpdateTaskSpeedResponse>
     */
    public CompletableFuture<UpdateTaskSpeedResponse> updateTaskSpeedAsync(UpdateTaskSpeedRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTaskSpeed);
    }

    /**
     * 上报数据迁移进度和速率
     *
     * 此接口由安装在源端服务器上的迁移Agent在数据迁移阶段调用，用来将迁移的具体进度上报给SMS服务端。
     * 
     * 迁移Agent自动调用此接口用于上报数据迁移进度，您无需调用此接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskSpeedRequest 请求对象
     * @return AsyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse>
     */
    public AsyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> updateTaskSpeedAsyncInvoker(
        UpdateTaskSpeedRequest request) {
        return new AsyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse>(request, SmsMeta.updateTaskSpeed,
            hcClient);
    }

    /**
     * 管理迁移任务
     *
     * 管理迁移任务，包括启动任务，暂停任务，同步任务，日志上传，回滚失败迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return CompletableFuture<UpdateTaskStatusResponse>
     */
    public CompletableFuture<UpdateTaskStatusResponse> updateTaskStatusAsync(UpdateTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTaskStatus);
    }

    /**
     * 管理迁移任务
     *
     * 管理迁移任务，包括启动任务，暂停任务，同步任务，日志上传，回滚失败迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>
     */
    public AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusAsyncInvoker(
        UpdateTaskStatusRequest request) {
        return new AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>(request, SmsMeta.updateTaskStatus,
            hcClient);
    }

    /**
     * 修改模板信息
     *
     * 修改源端模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTemplateResponse>
     */
    public CompletableFuture<UpdateTemplateResponse> updateTemplateAsync(UpdateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTemplate);
    }

    /**
     * 修改模板信息
     *
     * 修改源端模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateAsyncInvoker(
        UpdateTemplateRequest request) {
        return new AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>(request, SmsMeta.updateTemplate,
            hcClient);
    }

    /**
     * 迁移任务配置设置
     *
     * 配置迁移任务特殊设置，例如配置指定同步的文件或路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSpecialConfigurationSettingRequest 请求对象
     * @return CompletableFuture<UploadSpecialConfigurationSettingResponse>
     */
    public CompletableFuture<UploadSpecialConfigurationSettingResponse> uploadSpecialConfigurationSettingAsync(
        UploadSpecialConfigurationSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.uploadSpecialConfigurationSetting);
    }

    /**
     * 迁移任务配置设置
     *
     * 配置迁移任务特殊设置，例如配置指定同步的文件或路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSpecialConfigurationSettingRequest 请求对象
     * @return AsyncInvoker<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse>
     */
    public AsyncInvoker<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> uploadSpecialConfigurationSettingAsyncInvoker(
        UploadSpecialConfigurationSettingRequest request) {
        return new AsyncInvoker<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse>(
            request, SmsMeta.uploadSpecialConfigurationSetting, hcClient);
    }

    /**
     * 获取Agent配置信息
     *
     * 源端Agent启动后，访问此接口获取配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigRequest 请求对象
     * @return CompletableFuture<ShowConfigResponse>
     */
    public CompletableFuture<ShowConfigResponse> showConfigAsync(ShowConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showConfig);
    }

    /**
     * 获取Agent配置信息
     *
     * 源端Agent启动后，访问此接口获取配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigRequest 请求对象
     * @return AsyncInvoker<ShowConfigRequest, ShowConfigResponse>
     */
    public AsyncInvoker<ShowConfigRequest, ShowConfigResponse> showConfigAsyncInvoker(ShowConfigRequest request) {
        return new AsyncInvoker<ShowConfigRequest, ShowConfigResponse>(request, SmsMeta.showConfig, hcClient);
    }

    /**
     * 查询主机迁移服务的API版本信息
     *
     * 查询主机迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listApiVersion);
    }

    /**
     * 查询主机迁移服务的API版本信息
     *
     * 查询主机迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, SmsMeta.listApiVersion,
            hcClient);
    }

    /**
     * 查询主机迁移服务指定API版本信息
     *
     * 查询主机迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showApiVersion);
    }

    /**
     * 查询主机迁移服务指定API版本信息
     *
     * 查询主机迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, SmsMeta.showApiVersion,
            hcClient);
    }

}
