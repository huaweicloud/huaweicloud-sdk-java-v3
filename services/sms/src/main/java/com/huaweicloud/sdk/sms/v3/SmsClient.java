package com.huaweicloud.sdk.sms.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sms.v3.model.*;

public class SmsClient {

    protected HcClient hcClient;

    public SmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmsClient> newBuilder() {
        return new ClientBuilder<>(SmsClient::new, "GlobalCredentials");
    }

    /** 新建迁移项目 新建迁移项目
     *
     * @param CreateMigprojectRequest 请求对象
     * @return CreateMigprojectResponse */
    public CreateMigprojectResponse createMigproject(CreateMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createMigproject);
    }

    /** 新建迁移项目 新建迁移项目
     *
     * @param CreateMigprojectRequest 请求对象
     * @return SyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse> */
    public SyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse> createMigprojectInvoker(
        CreateMigprojectRequest request) {
        return new SyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse>(request, SmsMeta.createMigproject,
            hcClient);
    }

    /** 创建迁移任务 根据源端服务器创建一个迁移任务。
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createTask);
    }

    /** 创建迁移任务 根据源端服务器创建一个迁移任务。
     *
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse> */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, SmsMeta.createTask, hcClient);
    }

    /** 新增模板信息 新增源端模板信息
     *
     * @param CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createTemplate);
    }

    /** 新增模板信息 新增源端模板信息
     *
     * @param CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, SmsMeta.createTemplate,
            hcClient);
    }

    /** 删除迁移项目 删除指定ID的迁移项目
     *
     * @param DeleteMigprojectRequest 请求对象
     * @return DeleteMigprojectResponse */
    public DeleteMigprojectResponse deleteMigproject(DeleteMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteMigproject);
    }

    /** 删除迁移项目 删除指定ID的迁移项目
     *
     * @param DeleteMigprojectRequest 请求对象
     * @return SyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse> */
    public SyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse> deleteMigprojectInvoker(
        DeleteMigprojectRequest request) {
        return new SyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse>(request, SmsMeta.deleteMigproject,
            hcClient);
    }

    /** 删除指定ID的源端服务器信息 从主机迁移服务界面上删除指定ID的源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     *
     * @param DeleteServerRequest 请求对象
     * @return DeleteServerResponse */
    public DeleteServerResponse deleteServer(DeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteServer);
    }

    /** 删除指定ID的源端服务器信息 从主机迁移服务界面上删除指定ID的源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     *
     * @param DeleteServerRequest 请求对象
     * @return SyncInvoker<DeleteServerRequest, DeleteServerResponse> */
    public SyncInvoker<DeleteServerRequest, DeleteServerResponse> deleteServerInvoker(DeleteServerRequest request) {
        return new SyncInvoker<DeleteServerRequest, DeleteServerResponse>(request, SmsMeta.deleteServer, hcClient);
    }

    /** 批量删除源端服务器信息 批量删除源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     *
     * @param DeleteServersRequest 请求对象
     * @return DeleteServersResponse */
    public DeleteServersResponse deleteServers(DeleteServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteServers);
    }

    /** 批量删除源端服务器信息 批量删除源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     *
     * @param DeleteServersRequest 请求对象
     * @return SyncInvoker<DeleteServersRequest, DeleteServersResponse> */
    public SyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersInvoker(DeleteServersRequest request) {
        return new SyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, SmsMeta.deleteServers, hcClient);
    }

    /** 删除指定ID的迁移任务 删除指定ID的迁移任务。
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTask);
    }

    /** 删除指定ID的迁移任务 删除指定ID的迁移任务。
     *
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, SmsMeta.deleteTask, hcClient);
    }

    /** 批量删除迁移任务 批量删除迁移任务。
     *
     * @param DeleteTasksRequest 请求对象
     * @return DeleteTasksResponse */
    public DeleteTasksResponse deleteTasks(DeleteTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTasks);
    }

    /** 批量删除迁移任务 批量删除迁移任务。
     *
     * @param DeleteTasksRequest 请求对象
     * @return SyncInvoker<DeleteTasksRequest, DeleteTasksResponse> */
    public SyncInvoker<DeleteTasksRequest, DeleteTasksResponse> deleteTasksInvoker(DeleteTasksRequest request) {
        return new SyncInvoker<DeleteTasksRequest, DeleteTasksResponse>(request, SmsMeta.deleteTasks, hcClient);
    }

    /** 删除指定ID的模板 删除指定ID的模板。
     *
     * @param DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTemplate);
    }

    /** 删除指定ID的模板 删除指定ID的模板。
     *
     * @param DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, SmsMeta.deleteTemplate,
            hcClient);
    }

    /** 批量删除指定ID的模板 批量删除指定ID的模板。
     *
     * @param DeleteTemplatesRequest 请求对象
     * @return DeleteTemplatesResponse */
    public DeleteTemplatesResponse deleteTemplates(DeleteTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTemplates);
    }

    /** 批量删除指定ID的模板 批量删除指定ID的模板。
     *
     * @param DeleteTemplatesRequest 请求对象
     * @return SyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse> */
    public SyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplatesInvoker(
        DeleteTemplatesRequest request) {
        return new SyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse>(request, SmsMeta.deleteTemplates,
            hcClient);
    }

    /** 查询待迁移源端的所有错误 主机迁移过程中可能发生错误，使用该接口可以批量查询迁移过程中出现错误的源端服务器信息，以及它们的错误信息。
     *
     * @param ListErrorServersRequest 请求对象
     * @return ListErrorServersResponse */
    public ListErrorServersResponse listErrorServers(ListErrorServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listErrorServers);
    }

    /** 查询待迁移源端的所有错误 主机迁移过程中可能发生错误，使用该接口可以批量查询迁移过程中出现错误的源端服务器信息，以及它们的错误信息。
     *
     * @param ListErrorServersRequest 请求对象
     * @return SyncInvoker<ListErrorServersRequest, ListErrorServersResponse> */
    public SyncInvoker<ListErrorServersRequest, ListErrorServersResponse> listErrorServersInvoker(
        ListErrorServersRequest request) {
        return new SyncInvoker<ListErrorServersRequest, ListErrorServersResponse>(request, SmsMeta.listErrorServers,
            hcClient);
    }

    /** 获取项目列表 主机迁移服务中可以使用迁移项目来对源端进行项目管理，使用该接口获取当前账户下所有的迁移项目列表。
     *
     * @param ListMigprojectsRequest 请求对象
     * @return ListMigprojectsResponse */
    public ListMigprojectsResponse listMigprojects(ListMigprojectsRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listMigprojects);
    }

    /** 获取项目列表 主机迁移服务中可以使用迁移项目来对源端进行项目管理，使用该接口获取当前账户下所有的迁移项目列表。
     *
     * @param ListMigprojectsRequest 请求对象
     * @return SyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse> */
    public SyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse> listMigprojectsInvoker(
        ListMigprojectsRequest request) {
        return new SyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse>(request, SmsMeta.listMigprojects,
            hcClient);
    }

    /** 查询源端服务器列表 用户在源端安装并成功启动Agent后，Agent会将源端服务器信息注册在主机迁移服务中，调用该接口查询已注册的源端服务器列表信息。
     *
     * @param ListServersRequest 请求对象
     * @return ListServersResponse */
    public ListServersResponse listServers(ListServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listServers);
    }

    /** 查询源端服务器列表 用户在源端安装并成功启动Agent后，Agent会将源端服务器信息注册在主机迁移服务中，调用该接口查询已注册的源端服务器列表信息。
     *
     * @param ListServersRequest 请求对象
     * @return SyncInvoker<ListServersRequest, ListServersResponse> */
    public SyncInvoker<ListServersRequest, ListServersResponse> listServersInvoker(ListServersRequest request) {
        return new SyncInvoker<ListServersRequest, ListServersResponse>(request, SmsMeta.listServers, hcClient);
    }

    /** 查询迁移任务列表 在设置目的端后，主机迁移服务会自动创建迁移任务，使用该接口可以查询迁移任务列表。
     *
     * @param ListTasksRequest 请求对象
     * @return ListTasksResponse */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listTasks);
    }

    /** 查询迁移任务列表 在设置目的端后，主机迁移服务会自动创建迁移任务，使用该接口可以查询迁移任务列表。
     *
     * @param ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse> */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<ListTasksRequest, ListTasksResponse>(request, SmsMeta.listTasks, hcClient);
    }

    /** 查询模板列表 查询弹性云服务器模板列表，迁移时选择“新建服务器”时可使用该模板创建弹性云服务器。
     *
     * @param ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listTemplates);
    }

    /** 查询模板列表 查询弹性云服务器模板列表，迁移时选择“新建服务器”时可使用该模板创建弹性云服务器。
     *
     * @param ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, SmsMeta.listTemplates, hcClient);
    }

    /** 上报源端服务器基本信息 上报源端服务器信息，上报成功后会在sms服务器列表中看到对应的源端服务器信息。
     *
     * @param RegisterServerRequest 请求对象
     * @return RegisterServerResponse */
    public RegisterServerResponse registerServer(RegisterServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.registerServer);
    }

    /** 上报源端服务器基本信息 上报源端服务器信息，上报成功后会在sms服务器列表中看到对应的源端服务器信息。
     *
     * @param RegisterServerRequest 请求对象
     * @return SyncInvoker<RegisterServerRequest, RegisterServerResponse> */
    public SyncInvoker<RegisterServerRequest, RegisterServerResponse> registerServerInvoker(
        RegisterServerRequest request) {
        return new SyncInvoker<RegisterServerRequest, RegisterServerResponse>(request, SmsMeta.registerServer,
            hcClient);
    }

    /** 获取服务端命令 迁移Agent调用该接口从SMS服务端获取下发给指定源端迁移Agent的命令。
     *
     * @param ShowCommandRequest 请求对象
     * @return ShowCommandResponse */
    public ShowCommandResponse showCommand(ShowCommandRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showCommand);
    }

    /** 获取服务端命令 迁移Agent调用该接口从SMS服务端获取下发给指定源端迁移Agent的命令。
     *
     * @param ShowCommandRequest 请求对象
     * @return SyncInvoker<ShowCommandRequest, ShowCommandResponse> */
    public SyncInvoker<ShowCommandRequest, ShowCommandResponse> showCommandInvoker(ShowCommandRequest request) {
        return new SyncInvoker<ShowCommandRequest, ShowCommandResponse>(request, SmsMeta.showCommand, hcClient);
    }

    /** 查询指定ID迁移项目详情 查询指定ID的迁移项目详情。
     *
     * @param ShowMigprojectRequest 请求对象
     * @return ShowMigprojectResponse */
    public ShowMigprojectResponse showMigproject(ShowMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showMigproject);
    }

    /** 查询指定ID迁移项目详情 查询指定ID的迁移项目详情。
     *
     * @param ShowMigprojectRequest 请求对象
     * @return SyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse> */
    public SyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse> showMigprojectInvoker(
        ShowMigprojectRequest request) {
        return new SyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse>(request, SmsMeta.showMigproject,
            hcClient);
    }

    /** 获取服务器总览 获取服务器总览
     *
     * @param ShowOverviewRequest 请求对象
     * @return ShowOverviewResponse */
    public ShowOverviewResponse showOverview(ShowOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showOverview);
    }

    /** 获取服务器总览 获取服务器总览
     *
     * @param ShowOverviewRequest 请求对象
     * @return SyncInvoker<ShowOverviewRequest, ShowOverviewResponse> */
    public SyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewInvoker(ShowOverviewRequest request) {
        return new SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, SmsMeta.showOverview, hcClient);
    }

    /** 查询指定ID的源端服务器 迁移Agent将源端服务器信息上报到主机迁移服务后，主机迁移服务会对迁移的可行性进行检测，该接口返回源端服务器的基本信息和检查结果。
     *
     * @param ShowServerRequest 请求对象
     * @return ShowServerResponse */
    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showServer);
    }

    /** 查询指定ID的源端服务器 迁移Agent将源端服务器信息上报到主机迁移服务后，主机迁移服务会对迁移的可行性进行检测，该接口返回源端服务器的基本信息和检查结果。
     *
     * @param ShowServerRequest 请求对象
     * @return SyncInvoker<ShowServerRequest, ShowServerResponse> */
    public SyncInvoker<ShowServerRequest, ShowServerResponse> showServerInvoker(ShowServerRequest request) {
        return new SyncInvoker<ShowServerRequest, ShowServerResponse>(request, SmsMeta.showServer, hcClient);
    }

    /** 查询指定ID的迁移任务 查询指定ID的迁移任务。
     *
     * @param ShowTaskRequest 请求对象
     * @return ShowTaskResponse */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTask);
    }

    /** 查询指定ID的迁移任务 查询指定ID的迁移任务。
     *
     * @param ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse> */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, SmsMeta.showTask, hcClient);
    }

    /** 查询指定ID模板信息 查询指定ID的弹性云服务器模板信息。
     *
     * @param ShowTemplateRequest 请求对象
     * @return ShowTemplateResponse */
    public ShowTemplateResponse showTemplate(ShowTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTemplate);
    }

    /** 查询指定ID模板信息 查询指定ID的弹性云服务器模板信息。
     *
     * @param ShowTemplateRequest 请求对象
     * @return SyncInvoker<ShowTemplateRequest, ShowTemplateResponse> */
    public SyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateInvoker(ShowTemplateRequest request) {
        return new SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, SmsMeta.showTemplate, hcClient);
    }

    /** 查询任务限速规则 按时间段查询迁移任务的迁移速率
     *
     * @param ShowsSpeedLimitsRequest 请求对象
     * @return ShowsSpeedLimitsResponse */
    public ShowsSpeedLimitsResponse showsSpeedLimits(ShowsSpeedLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showsSpeedLimits);
    }

    /** 查询任务限速规则 按时间段查询迁移任务的迁移速率
     *
     * @param ShowsSpeedLimitsRequest 请求对象
     * @return SyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> */
    public SyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> showsSpeedLimitsInvoker(
        ShowsSpeedLimitsRequest request) {
        return new SyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse>(request, SmsMeta.showsSpeedLimits,
            hcClient);
    }

    /** 上报服务端命令执行结果 迁移Agent调用该接口向SMS服务端反馈指定指令的执行结果。
     *
     * @param UpdateCommandResultRequest 请求对象
     * @return UpdateCommandResultResponse */
    public UpdateCommandResultResponse updateCommandResult(UpdateCommandResultRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateCommandResult);
    }

    /** 上报服务端命令执行结果 迁移Agent调用该接口向SMS服务端反馈指定指令的执行结果。
     *
     * @param UpdateCommandResultRequest 请求对象
     * @return SyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse> */
    public SyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse> updateCommandResultInvoker(
        UpdateCommandResultRequest request) {
        return new SyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse>(request,
            SmsMeta.updateCommandResult, hcClient);
    }

    /** 更新任务对应源端复制状态 更新任务对应源端复制状态
     *
     * @param UpdateCopyStateRequest 请求对象
     * @return UpdateCopyStateResponse */
    public UpdateCopyStateResponse updateCopyState(UpdateCopyStateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateCopyState);
    }

    /** 更新任务对应源端复制状态 更新任务对应源端复制状态
     *
     * @param UpdateCopyStateRequest 请求对象
     * @return SyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse> */
    public SyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse> updateCopyStateInvoker(
        UpdateCopyStateRequest request) {
        return new SyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse>(request, SmsMeta.updateCopyState,
            hcClient);
    }

    /** 更新默认迁移项目 更改默认迁移项目，注册源端会注册在当前的默认项目下。
     *
     * @param UpdateDefaultMigprojectRequest 请求对象
     * @return UpdateDefaultMigprojectResponse */
    public UpdateDefaultMigprojectResponse updateDefaultMigproject(UpdateDefaultMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateDefaultMigproject);
    }

    /** 更新默认迁移项目 更改默认迁移项目，注册源端会注册在当前的默认项目下。
     *
     * @param UpdateDefaultMigprojectRequest 请求对象
     * @return SyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> */
    public SyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> updateDefaultMigprojectInvoker(
        UpdateDefaultMigprojectRequest request) {
        return new SyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse>(request,
            SmsMeta.updateDefaultMigproject, hcClient);
    }

    /** 更新磁盘信息 更新服务器的磁盘信息，此接口会把服务器原有磁盘信息清空，然后更新成新磁盘信息
     *
     * @param UpdateDiskInfoRequest 请求对象
     * @return UpdateDiskInfoResponse */
    public UpdateDiskInfoResponse updateDiskInfo(UpdateDiskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateDiskInfo);
    }

    /** 更新磁盘信息 更新服务器的磁盘信息，此接口会把服务器原有磁盘信息清空，然后更新成新磁盘信息
     *
     * @param UpdateDiskInfoRequest 请求对象
     * @return SyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse> */
    public SyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse> updateDiskInfoInvoker(
        UpdateDiskInfoRequest request) {
        return new SyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse>(request, SmsMeta.updateDiskInfo,
            hcClient);
    }

    /** 更新迁移项目信息 更新迁移项目的信息
     *
     * @param UpdateMigprojectRequest 请求对象
     * @return UpdateMigprojectResponse */
    public UpdateMigprojectResponse updateMigproject(UpdateMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateMigproject);
    }

    /** 更新迁移项目信息 更新迁移项目的信息
     *
     * @param UpdateMigprojectRequest 请求对象
     * @return SyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse> */
    public SyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse> updateMigprojectInvoker(
        UpdateMigprojectRequest request) {
        return new SyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse>(request, SmsMeta.updateMigproject,
            hcClient);
    }

    /** 修改指定ID的源端服务器名称 该功能用来修改SMS服务端的源端名称，方便用户对源端进行管理。
     *
     * @param UpdateServerNameRequest 请求对象
     * @return UpdateServerNameResponse */
    public UpdateServerNameResponse updateServerName(UpdateServerNameRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateServerName);
    }

    /** 修改指定ID的源端服务器名称 该功能用来修改SMS服务端的源端名称，方便用户对源端进行管理。
     *
     * @param UpdateServerNameRequest 请求对象
     * @return SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> */
    public SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameInvoker(
        UpdateServerNameRequest request) {
        return new SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>(request, SmsMeta.updateServerName,
            hcClient);
    }

    /** 设置迁移限速规则 设置迁移任务的迁移速率。
     *
     * @param UpdateSpeedRequest 请求对象
     * @return UpdateSpeedResponse */
    public UpdateSpeedResponse updateSpeed(UpdateSpeedRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateSpeed);
    }

    /** 设置迁移限速规则 设置迁移任务的迁移速率。
     *
     * @param UpdateSpeedRequest 请求对象
     * @return SyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse> */
    public SyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse> updateSpeedInvoker(UpdateSpeedRequest request) {
        return new SyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse>(request, SmsMeta.updateSpeed, hcClient);
    }

    /** 更新指定ID的迁移任务 更新指定ID的迁移任务
     *
     * @param UpdateTaskRequest 请求对象
     * @return UpdateTaskResponse */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTask);
    }

    /** 更新指定ID的迁移任务 更新指定ID的迁移任务
     *
     * @param UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, SmsMeta.updateTask, hcClient);
    }

    /** 上报数据迁移进度和速率 此接口由安装在源端服务器上的迁移Agent在数据迁移阶段调用，用来将迁移的具体进度上报给SMS服务端。 迁移Agent自动调用此接口用于上报数据迁移进度，您无需调用此接口。
     *
     * @param UpdateTaskSpeedRequest 请求对象
     * @return UpdateTaskSpeedResponse */
    public UpdateTaskSpeedResponse updateTaskSpeed(UpdateTaskSpeedRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTaskSpeed);
    }

    /** 上报数据迁移进度和速率 此接口由安装在源端服务器上的迁移Agent在数据迁移阶段调用，用来将迁移的具体进度上报给SMS服务端。 迁移Agent自动调用此接口用于上报数据迁移进度，您无需调用此接口。
     *
     * @param UpdateTaskSpeedRequest 请求对象
     * @return SyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> */
    public SyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> updateTaskSpeedInvoker(
        UpdateTaskSpeedRequest request) {
        return new SyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse>(request, SmsMeta.updateTaskSpeed,
            hcClient);
    }

    /** 管理迁移任务 管理迁移任务，包括启动任务，暂停任务，同步任务，日志上传，回滚失败迁移任务
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return UpdateTaskStatusResponse */
    public UpdateTaskStatusResponse updateTaskStatus(UpdateTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTaskStatus);
    }

    /** 管理迁移任务 管理迁移任务，包括启动任务，暂停任务，同步任务，日志上传，回滚失败迁移任务
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> */
    public SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusInvoker(
        UpdateTaskStatusRequest request) {
        return new SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>(request, SmsMeta.updateTaskStatus,
            hcClient);
    }

    /** 修改模板信息 修改源端模板信息。
     *
     * @param UpdateTemplateRequest 请求对象
     * @return UpdateTemplateResponse */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTemplate);
    }

    /** 修改模板信息 修改源端模板信息。
     *
     * @param UpdateTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> */
    public SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateInvoker(
        UpdateTemplateRequest request) {
        return new SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>(request, SmsMeta.updateTemplate,
            hcClient);
    }

}
