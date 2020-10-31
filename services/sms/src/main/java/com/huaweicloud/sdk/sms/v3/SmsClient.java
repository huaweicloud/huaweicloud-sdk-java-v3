package com.huaweicloud.sdk.sms.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.sms.v3.model.*;

public class SmsClient {
    protected HcClient hcClient;

    public SmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmsClient> newBuilder() {
        return new ClientBuilder<>(SmsClient::new, "GlobalCredentials");
    }


    /**
     * 新建迁移项目
     * 新建迁移项目
     *
     * @param CreateMigprojectRequest 请求对象
     * @return CreateMigprojectResponse
     */
    public CreateMigprojectResponse createMigproject(CreateMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createMigproject);
    }

    /**
     * 创建迁移任务
     * 根据源端服务器创建一个迁移任务。
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createTask);
    }

    /**
     * 新增模板信息
     * 新增源端模板信息
     *
     * @param CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createTemplate);
    }

    /**
     * 删除迁移项目
     * 删除指定ID的迁移项目
     *
     * @param DeleteMigprojectRequest 请求对象
     * @return DeleteMigprojectResponse
     */
    public DeleteMigprojectResponse deleteMigproject(DeleteMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteMigproject);
    }

    /**
     * 删除指定ID的源端服务器信息
     * 从主机迁移服务界面上删除指定ID的源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     *
     * @param DeleteServerRequest 请求对象
     * @return DeleteServerResponse
     */
    public DeleteServerResponse deleteServer(DeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteServer);
    }

    /**
     * 批量删除源端服务器信息
     * 批量删除源端服务器信息。一旦源端服务器信息被删除，则只能通过重启源端服务器上的迁移Agent来将源端服务器信息重新添加在主机迁移服务界面。
     *
     * @param DeleteServersRequest 请求对象
     * @return DeleteServersResponse
     */
    public DeleteServersResponse deleteServers(DeleteServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteServers);
    }

    /**
     * 删除指定ID的迁移任务
     * 删除指定ID的迁移任务。
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTask);
    }

    /**
     * 批量删除迁移任务
     * 批量删除迁移任务。
     *
     * @param DeleteTasksRequest 请求对象
     * @return DeleteTasksResponse
     */
    public DeleteTasksResponse deleteTasks(DeleteTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTasks);
    }

    /**
     * 删除指定ID的模板
     * 删除指定ID的模板。
     *
     * @param DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTemplate);
    }

    /**
     * 批量删除指定ID的模板
     * 批量删除指定ID的模板。
     *
     * @param DeleteTemplatesRequest 请求对象
     * @return DeleteTemplatesResponse
     */
    public DeleteTemplatesResponse deleteTemplates(DeleteTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTemplates);
    }

    /**
     * 查询迁移错误列表
     * 主机迁移过程中可能发生错误，使用该接口可以批量查询迁移过程中出现错误的源端服务器信息，以及它们的错误信息。
     *
     * @param ListErrorServersRequest 请求对象
     * @return ListErrorServersResponse
     */
    public ListErrorServersResponse listErrorServers(ListErrorServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listErrorServers);
    }

    /**
     * 获取项目列表
     * 主机迁移服务中可以使用迁移项目来对源端进行项目管理，使用该接口获取当前账户下所有的迁移项目列表。
     *
     * @param ListMigprojectsRequest 请求对象
     * @return ListMigprojectsResponse
     */
    public ListMigprojectsResponse listMigprojects(ListMigprojectsRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listMigprojects);
    }

    /**
     * 查询源端服务器列表
     * 用户在源端安装并成功启动Agent后，Agent会将源端服务器信息注册在主机迁移服务中，调用该接口查询已注册的源端服务器列表信息。
     *
     * @param ListServersRequest 请求对象
     * @return ListServersResponse
     */
    public ListServersResponse listServers(ListServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listServers);
    }

    /**
     * 查询迁移任务列表
     * 在设置目的端后，主机迁移服务会自动创建迁移任务，使用该接口可以查询迁移任务列表。
     *
     * @param ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listTasks);
    }

    /**
     * 上报源端服务器基本信息
     * 上报源端服务器信息，上报成功后会在sms服务器列表中看到对应的源端服务器信息。
     *
     * @param RegisterServerRequest 请求对象
     * @return RegisterServerResponse
     */
    public RegisterServerResponse registerServer(RegisterServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.registerServer);
    }

    /**
     * 查询指定ID迁移项目详情
     * 查询指定ID的迁移项目详情。
     *
     * @param ShowMigprojectRequest 请求对象
     * @return ShowMigprojectResponse
     */
    public ShowMigprojectResponse showMigproject(ShowMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showMigproject);
    }

    /**
     * 查询指定ID的源端服务器
     * 迁移Agent将源端服务器信息上报到主机迁移服务后，主机迁移服务会对迁移的可行性进行检测，该接口返回源端服务器的基本信息和检查结果。
     *
     * @param ShowServerRequest 请求对象
     * @return ShowServerResponse
     */
    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showServer);
    }

    /**
     * 查询指定ID的迁移任务
     * 查询指定ID的迁移任务。
     *
     * @param ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTask);
    }

    /**
     * 查询指定ID模板信息
     * 查询指定ID的弹性云服务器模板信息。
     *
     * @param ShowTemplateRequest 请求对象
     * @return ShowTemplateResponse
     */
    public ShowTemplateResponse showTemplate(ShowTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTemplate);
    }

    /**
     * 查询模板列表
     * 查询弹性云服务器模板列表，迁移时选择“新建服务器”时可使用该模板创建弹性云服务器。
     *
     * @param ShowTemplatesRequest 请求对象
     * @return ShowTemplatesResponse
     */
    public ShowTemplatesResponse showTemplates(ShowTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTemplates);
    }

    /**
     * 查询任务限速规则
     * 按时间段查询迁移任务的迁移速率
     *
     * @param ShowsSpeedLimitsRequest 请求对象
     * @return ShowsSpeedLimitsResponse
     */
    public ShowsSpeedLimitsResponse showsSpeedLimits(ShowsSpeedLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showsSpeedLimits);
    }

    /**
     * 更新默认迁移项目
     * 更改默认迁移项目，注册源端会注册在当前的默认项目下。
     *
     * @param UpdateDefaultMigprojectRequest 请求对象
     * @return UpdateDefaultMigprojectResponse
     */
    public UpdateDefaultMigprojectResponse updateDefaultMigproject(UpdateDefaultMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateDefaultMigproject);
    }

    /**
     * 更新迁移项目信息
     * 更新迁移项目的信息
     *
     * @param UpdateMigprojectRequest 请求对象
     * @return UpdateMigprojectResponse
     */
    public UpdateMigprojectResponse updateMigproject(UpdateMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateMigproject);
    }

    /**
     * 修改指定ID的源端服务器名称
     * 该功能用来修改SMS服务端的源端名称，方便用户对源端进行管理。
     *
     * @param UpdateServerNameRequest 请求对象
     * @return UpdateServerNameResponse
     */
    public UpdateServerNameResponse updateServerName(UpdateServerNameRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateServerName);
    }

    /**
     * 设置迁移限速规则
     * 设置迁移任务的迁移速率。
     *
     * @param UpdateSpeedRequest 请求对象
     * @return UpdateSpeedResponse
     */
    public UpdateSpeedResponse updateSpeed(UpdateSpeedRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateSpeed);
    }

    /**
     * 管理迁移任务
     * 管理迁移任务，包括启动任务，暂停任务，同步任务，日志上传，回滚失败迁移任务
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return UpdateTaskStatusResponse
     */
    public UpdateTaskStatusResponse updateTaskStatus(UpdateTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTaskStatus);
    }

    /**
     * 修改模板信息
     * 修改源端模板信息。
     *
     * @param UpdateTemplateRequest 请求对象
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTemplate);
    }

}