package com.huaweicloud.sdk.koomap.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageRequest;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageResponse;

public class KooMapClient {

    protected HcClient hcClient;

    public KooMapClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooMapClient> newBuilder() {
        ClientBuilder<KooMapClient> clientBuilder = new ClientBuilder<>(KooMapClient::new);
        return clientBuilder;
    }

    /**
     * 新建任务
     *
     * 在工作共享空间内新建数据处理任务，新建任务的“成果影像名称”参数可从“校验原始影像文件”接口中获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.createTask);
    }

    /**
     * 新建任务
     *
     * 在工作共享空间内新建数据处理任务，新建任务的“成果影像名称”参数可从“校验原始影像文件”接口中获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, KooMapMeta.createTask, hcClient);
    }

    /**
     * 新建工作共享空间
     *
     * 新建工作共享空间，可以在空间内创建数据处理任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkspaceRequest 请求对象
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.createWorkspace);
    }

    /**
     * 新建工作共享空间
     *
     * 新建工作共享空间，可以在空间内创建数据处理任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceInvoker(
        CreateWorkspaceRequest request) {
        return new SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>(request, KooMapMeta.createWorkspace,
            hcClient);
    }

    /**
     * 删除任务
     *
     * 任务的删除，只有失败、未运行、停止成功状态的任务可以删除，删除成功后任务不在任务列表中显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteTask);
    }

    /**
     * 删除任务
     *
     * 任务的删除，只有失败、未运行、停止成功状态的任务可以删除，删除成功后任务不在任务列表中显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, KooMapMeta.deleteTask, hcClient);
    }

    /**
     * 删除工作共享空间
     *
     * 删除工作共享空间，该空间未被启动且没有任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkspaceRequest 请求对象
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteWorkspace);
    }

    /**
     * 删除工作共享空间
     *
     * 删除工作共享空间，该空间未被启动且没有任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkspaceRequest 请求对象
     * @return SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceInvoker(
        DeleteWorkspaceRequest request) {
        return new SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>(request, KooMapMeta.deleteWorkspace,
            hcClient);
    }

    /**
     * 查询卫星影像基本信息
     *
     * 根据过滤条件查询卫星影像信息列表。过滤条件有：影像名称、上传日期、影像别名、影像等级、影像状态、是否为成果数据、分页偏移量、每页显示条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageBaseInfoRequest 请求对象
     * @return ListImageBaseInfoResponse
     */
    public ListImageBaseInfoResponse listImageBaseInfo(ListImageBaseInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listImageBaseInfo);
    }

    /**
     * 查询卫星影像基本信息
     *
     * 根据过滤条件查询卫星影像信息列表。过滤条件有：影像名称、上传日期、影像别名、影像等级、影像状态、是否为成果数据、分页偏移量、每页显示条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageBaseInfoRequest 请求对象
     * @return SyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse>
     */
    public SyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse> listImageBaseInfoInvoker(
        ListImageBaseInfoRequest request) {
        return new SyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse>(request,
            KooMapMeta.listImageBaseInfo, hcClient);
    }

    /**
     * 查询任务
     *
     * 根据设置的过滤条件（任务状态）分页查询任务。
     * 当过滤条件为“全部任务”时，查询不到已归档的任务，您只有设置过滤条件为“已归档”时，才可查询到已归档任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskInfoRequest 请求对象
     * @return ListTaskInfoResponse
     */
    public ListTaskInfoResponse listTaskInfo(ListTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listTaskInfo);
    }

    /**
     * 查询任务
     *
     * 根据设置的过滤条件（任务状态）分页查询任务。
     * 当过滤条件为“全部任务”时，查询不到已归档的任务，您只有设置过滤条件为“已归档”时，才可查询到已归档任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskInfoRequest 请求对象
     * @return SyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse>
     */
    public SyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse> listTaskInfoInvoker(ListTaskInfoRequest request) {
        return new SyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse>(request, KooMapMeta.listTaskInfo, hcClient);
    }

    /**
     * 查询用量
     *
     * 您可以查询时空专属服务或卫星影像处理服务的用量统计。
     * - 时空专属存储：统计导入的原始影像、矢量数据和处理成功后的成果影像存储总量。
     * - 卫星影像处理服务：统计L2、L4、L5等级处理成功的成果影像存储用量、成功处理的次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageInfoRequest 请求对象
     * @return ListUsageInfoResponse
     */
    public ListUsageInfoResponse listUsageInfo(ListUsageInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listUsageInfo);
    }

    /**
     * 查询用量
     *
     * 您可以查询时空专属服务或卫星影像处理服务的用量统计。
     * - 时空专属存储：统计导入的原始影像、矢量数据和处理成功后的成果影像存储总量。
     * - 卫星影像处理服务：统计L2、L4、L5等级处理成功的成果影像存储用量、成功处理的次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageInfoRequest 请求对象
     * @return SyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse>
     */
    public SyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse> listUsageInfoInvoker(ListUsageInfoRequest request) {
        return new SyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse>(request, KooMapMeta.listUsageInfo,
            hcClient);
    }

    /**
     * 查询工作共享空间
     *
     * 根据过滤条件分页查询工作共享空间列表以及在首页展示的空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspaceRequest 请求对象
     * @return ListWorkspaceResponse
     */
    public ListWorkspaceResponse listWorkspace(ListWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listWorkspace);
    }

    /**
     * 查询工作共享空间
     *
     * 根据过滤条件分页查询工作共享空间列表以及在首页展示的空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspaceRequest 请求对象
     * @return SyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse>
     */
    public SyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse> listWorkspaceInvoker(ListWorkspaceRequest request) {
        return new SyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse>(request, KooMapMeta.listWorkspace,
            hcClient);
    }

    /**
     * 查看任务概览
     *
     * 查看工作共享空间下的所有任务概览，包括全部任务数量、处理完成任务数量和执行中任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskOverviewRequest 请求对象
     * @return ShowTaskOverviewResponse
     */
    public ShowTaskOverviewResponse showTaskOverview(ShowTaskOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.showTaskOverview);
    }

    /**
     * 查看任务概览
     *
     * 查看工作共享空间下的所有任务概览，包括全部任务数量、处理完成任务数量和执行中任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskOverviewRequest 请求对象
     * @return SyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse>
     */
    public SyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse> showTaskOverviewInvoker(
        ShowTaskOverviewRequest request) {
        return new SyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse>(request, KooMapMeta.showTaskOverview,
            hcClient);
    }

    /**
     * 启动任务
     *
     * 启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(StartTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.startTask);
    }

    /**
     * 启动任务
     *
     * 启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return SyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public SyncInvoker<StartTaskRequest, StartTaskResponse> startTaskInvoker(StartTaskRequest request) {
        return new SyncInvoker<StartTaskRequest, StartTaskResponse>(request, KooMapMeta.startTask, hcClient);
    }

    /**
     * 停止任务
     *
     * 停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.stopTask);
    }

    /**
     * 停止任务
     *
     * 停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return SyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public SyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskInvoker(StopTaskRequest request) {
        return new SyncInvoker<StopTaskRequest, StopTaskResponse>(request, KooMapMeta.stopTask, hcClient);
    }

    /**
     * 归档/取消归档任务
     *
     * 任务的归档和取消归档操作，归档成功之后的任务不会在任务列表显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskArchivedStatusRequest 请求对象
     * @return UpdateTaskArchivedStatusResponse
     */
    public UpdateTaskArchivedStatusResponse updateTaskArchivedStatus(UpdateTaskArchivedStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.updateTaskArchivedStatus);
    }

    /**
     * 归档/取消归档任务
     *
     * 任务的归档和取消归档操作，归档成功之后的任务不会在任务列表显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskArchivedStatusRequest 请求对象
     * @return SyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse>
     */
    public SyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> updateTaskArchivedStatusInvoker(
        UpdateTaskArchivedStatusRequest request) {
        return new SyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse>(request,
            KooMapMeta.updateTaskArchivedStatus, hcClient);
    }

    /**
     * 修改工作共享空间
     *
     * 修改工作共享空间名称、描述、置顶状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.updateWorkspace);
    }

    /**
     * 修改工作共享空间
     *
     * 修改工作共享空间名称、描述、置顶状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(request, KooMapMeta.updateWorkspace,
            hcClient);
    }

    /**
     * 校验原始影像文件
     *
     * 校验原始影像文件是否满足匹配规则（全色与多光谱一一对应或全为多光谱）并返回成果影像名称。如果不满足匹配规则，会以报错方式提示用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateImageRequest 请求对象
     * @return ValidateImageResponse
     */
    public ValidateImageResponse validateImage(ValidateImageRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.validateImage);
    }

    /**
     * 校验原始影像文件
     *
     * 校验原始影像文件是否满足匹配规则（全色与多光谱一一对应或全为多光谱）并返回成果影像名称。如果不满足匹配规则，会以报错方式提示用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateImageRequest 请求对象
     * @return SyncInvoker<ValidateImageRequest, ValidateImageResponse>
     */
    public SyncInvoker<ValidateImageRequest, ValidateImageResponse> validateImageInvoker(ValidateImageRequest request) {
        return new SyncInvoker<ValidateImageRequest, ValidateImageResponse>(request, KooMapMeta.validateImage,
            hcClient);
    }

}
