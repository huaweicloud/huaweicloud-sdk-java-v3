package com.huaweicloud.sdk.koomap.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.koomap.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class KooMapAsyncClient {

    protected HcClient hcClient;

    public KooMapAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooMapAsyncClient> newBuilder() {
        return new ClientBuilder<>(KooMapAsyncClient::new);
    }

    /**
     * 新建任务
     *
     * 在工作共享空间内新建数据处理任务，新建任务的“成果影像名称”参数可从“校验原始影像文件”接口中获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.createTask);
    }

    /**
     * 新建任务
     *
     * 在工作共享空间内新建数据处理任务，新建任务的“成果影像名称”参数可从“校验原始影像文件”接口中获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, KooMapMeta.createTask, hcClient);
    }

    /**
     * 新建工作共享空间
     *
     * 新建工作共享空间，可以在空间内创建数据处理任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkspaceRequest 请求对象
     * @return CompletableFuture<CreateWorkspaceResponse>
     */
    public CompletableFuture<CreateWorkspaceResponse> createWorkspaceAsync(CreateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.createWorkspace);
    }

    /**
     * 新建工作共享空间
     *
     * 新建工作共享空间，可以在空间内创建数据处理任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkspaceRequest 请求对象
     * @return AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceAsyncInvoker(
        CreateWorkspaceRequest request) {
        return new AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>(request, KooMapMeta.createWorkspace,
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
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.deleteTask);
    }

    /**
     * 删除任务
     *
     * 任务的删除，只有失败、未运行、停止成功状态的任务可以删除，删除成功后任务不在任务列表中显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, KooMapMeta.deleteTask, hcClient);
    }

    /**
     * 删除工作共享空间
     *
     * 删除工作共享空间，该空间未被启动且没有任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkspaceRequest 请求对象
     * @return CompletableFuture<DeleteWorkspaceResponse>
     */
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.deleteWorkspace);
    }

    /**
     * 删除工作共享空间
     *
     * 删除工作共享空间，该空间未被启动且没有任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkspaceRequest 请求对象
     * @return AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceAsyncInvoker(
        DeleteWorkspaceRequest request) {
        return new AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>(request, KooMapMeta.deleteWorkspace,
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
     * @return CompletableFuture<ListImageBaseInfoResponse>
     */
    public CompletableFuture<ListImageBaseInfoResponse> listImageBaseInfoAsync(ListImageBaseInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.listImageBaseInfo);
    }

    /**
     * 查询卫星影像基本信息
     *
     * 根据过滤条件查询卫星影像信息列表。过滤条件有：影像名称、上传日期、影像别名、影像等级、影像状态、是否为成果数据、分页偏移量、每页显示条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageBaseInfoRequest 请求对象
     * @return AsyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse>
     */
    public AsyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse> listImageBaseInfoAsyncInvoker(
        ListImageBaseInfoRequest request) {
        return new AsyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse>(request,
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
     * @return CompletableFuture<ListTaskInfoResponse>
     */
    public CompletableFuture<ListTaskInfoResponse> listTaskInfoAsync(ListTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.listTaskInfo);
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
     * @return AsyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse>
     */
    public AsyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse> listTaskInfoAsyncInvoker(
        ListTaskInfoRequest request) {
        return new AsyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse>(request, KooMapMeta.listTaskInfo, hcClient);
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
     * @return CompletableFuture<ListUsageInfoResponse>
     */
    public CompletableFuture<ListUsageInfoResponse> listUsageInfoAsync(ListUsageInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.listUsageInfo);
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
     * @return AsyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse>
     */
    public AsyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse> listUsageInfoAsyncInvoker(
        ListUsageInfoRequest request) {
        return new AsyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse>(request, KooMapMeta.listUsageInfo,
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
     * @return CompletableFuture<ListWorkspaceResponse>
     */
    public CompletableFuture<ListWorkspaceResponse> listWorkspaceAsync(ListWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.listWorkspace);
    }

    /**
     * 查询工作共享空间
     *
     * 根据过滤条件分页查询工作共享空间列表以及在首页展示的空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspaceRequest 请求对象
     * @return AsyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse>
     */
    public AsyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse> listWorkspaceAsyncInvoker(
        ListWorkspaceRequest request) {
        return new AsyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse>(request, KooMapMeta.listWorkspace,
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
     * @return CompletableFuture<ShowTaskOverviewResponse>
     */
    public CompletableFuture<ShowTaskOverviewResponse> showTaskOverviewAsync(ShowTaskOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.showTaskOverview);
    }

    /**
     * 查看任务概览
     *
     * 查看工作共享空间下的所有任务概览，包括全部任务数量、处理完成任务数量和执行中任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskOverviewRequest 请求对象
     * @return AsyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse>
     */
    public AsyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse> showTaskOverviewAsyncInvoker(
        ShowTaskOverviewRequest request) {
        return new AsyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse>(request, KooMapMeta.showTaskOverview,
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
     * @return CompletableFuture<StartTaskResponse>
     */
    public CompletableFuture<StartTaskResponse> startTaskAsync(StartTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.startTask);
    }

    /**
     * 启动任务
     *
     * 启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return AsyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public AsyncInvoker<StartTaskRequest, StartTaskResponse> startTaskAsyncInvoker(StartTaskRequest request) {
        return new AsyncInvoker<StartTaskRequest, StartTaskResponse>(request, KooMapMeta.startTask, hcClient);
    }

    /**
     * 停止任务
     *
     * 停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return CompletableFuture<StopTaskResponse>
     */
    public CompletableFuture<StopTaskResponse> stopTaskAsync(StopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.stopTask);
    }

    /**
     * 停止任务
     *
     * 停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return AsyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public AsyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskAsyncInvoker(StopTaskRequest request) {
        return new AsyncInvoker<StopTaskRequest, StopTaskResponse>(request, KooMapMeta.stopTask, hcClient);
    }

    /**
     * 归档/取消归档任务
     *
     * 任务的归档和取消归档操作，归档成功之后的任务不会在任务列表显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskArchivedStatusRequest 请求对象
     * @return CompletableFuture<UpdateTaskArchivedStatusResponse>
     */
    public CompletableFuture<UpdateTaskArchivedStatusResponse> updateTaskArchivedStatusAsync(
        UpdateTaskArchivedStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.updateTaskArchivedStatus);
    }

    /**
     * 归档/取消归档任务
     *
     * 任务的归档和取消归档操作，归档成功之后的任务不会在任务列表显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskArchivedStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse>
     */
    public AsyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> updateTaskArchivedStatusAsyncInvoker(
        UpdateTaskArchivedStatusRequest request) {
        return new AsyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse>(request,
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
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.updateWorkspace);
    }

    /**
     * 修改工作共享空间
     *
     * 修改工作共享空间名称、描述、置顶状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(request, KooMapMeta.updateWorkspace,
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
     * @return CompletableFuture<ValidateImageResponse>
     */
    public CompletableFuture<ValidateImageResponse> validateImageAsync(ValidateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMapMeta.validateImage);
    }

    /**
     * 校验原始影像文件
     *
     * 校验原始影像文件是否满足匹配规则（全色与多光谱一一对应或全为多光谱）并返回成果影像名称。如果不满足匹配规则，会以报错方式提示用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateImageRequest 请求对象
     * @return AsyncInvoker<ValidateImageRequest, ValidateImageResponse>
     */
    public AsyncInvoker<ValidateImageRequest, ValidateImageResponse> validateImageAsyncInvoker(
        ValidateImageRequest request) {
        return new AsyncInvoker<ValidateImageRequest, ValidateImageResponse>(request, KooMapMeta.validateImage,
            hcClient);
    }

}
