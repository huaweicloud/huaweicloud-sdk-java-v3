package com.huaweicloud.sdk.optverse.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.optverse.v1.model.AuthorizePermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.AuthorizePermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.BatchDeleteEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.BatchDeleteEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.CancelChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.CancelChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateArtifactsRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateArtifactsResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelAssetRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelAssetResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.DownloadFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.DownloadFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListArtifactsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListArtifactsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListModelAssetsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListModelAssetsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListModelServiceTasksRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListModelServiceTasksResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.PublishChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.PublishChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.PublishModelRequest;
import com.huaweicloud.sdk.optverse.v1.model.PublishModelResponse;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelAssetDetailRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelAssetDetailResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceDetailRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceDetailResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceListRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceListResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskDetailsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskDetailsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultCommitRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultCommitResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultListRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultListResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningDetailsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningDetailsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningLogRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningLogResponse;
import com.huaweicloud.sdk.optverse.v1.model.StartEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.StartEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.StartModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.StartModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.StopModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.StopModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelAssetRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelAssetResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.UploadFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.UploadFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.UploadModelServiceTaskFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.UploadModelServiceTaskFileResponse;

public class OptVerseClient {

    protected HcClient hcClient;

    public OptVerseClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OptVerseClient> newBuilder() {
        ClientBuilder<OptVerseClient> clientBuilder = new ClientBuilder<>(OptVerseClient::new);
        return clientBuilder;
    }

    /**
     * 删除算法演化任务
     *
     * 删除算法演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteEvolveTaskRequest 请求对象
     * @return BatchDeleteEvolveTaskResponse
     */
    public BatchDeleteEvolveTaskResponse batchDeleteEvolveTask(BatchDeleteEvolveTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.batchDeleteEvolveTask);
    }

    /**
     * 删除算法演化任务
     *
     * 删除算法演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteEvolveTaskRequest 请求对象
     * @return SyncInvoker<BatchDeleteEvolveTaskRequest, BatchDeleteEvolveTaskResponse>
     */
    public SyncInvoker<BatchDeleteEvolveTaskRequest, BatchDeleteEvolveTaskResponse> batchDeleteEvolveTaskInvoker(
        BatchDeleteEvolveTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.batchDeleteEvolveTask, hcClient);
    }

    /**
     * 创建设计项目
     *
     * 创建设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return CreateAlgorithmResponse
     */
    public CreateAlgorithmResponse createAlgorithm(CreateAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.createAlgorithm);
    }

    /**
     * 创建设计项目
     *
     * 创建设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return SyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse>
     */
    public SyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse> createAlgorithmInvoker(
        CreateAlgorithmRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.createAlgorithm, hcClient);
    }

    /**
     * 创建演化任务
     *
     * 创建演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvolveTaskRequest 请求对象
     * @return CreateEvolveTaskResponse
     */
    public CreateEvolveTaskResponse createEvolveTask(CreateEvolveTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.createEvolveTask);
    }

    /**
     * 创建演化任务
     *
     * 创建演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvolveTaskRequest 请求对象
     * @return SyncInvoker<CreateEvolveTaskRequest, CreateEvolveTaskResponse>
     */
    public SyncInvoker<CreateEvolveTaskRequest, CreateEvolveTaskResponse> createEvolveTaskInvoker(
        CreateEvolveTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.createEvolveTask, hcClient);
    }

    /**
     * 删除算法设计项目
     *
     * 删除算法设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return DeleteAlgorithmResponse
     */
    public DeleteAlgorithmResponse deleteAlgorithm(DeleteAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.deleteAlgorithm);
    }

    /**
     * 删除算法设计项目
     *
     * 删除算法设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return SyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse>
     */
    public SyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse> deleteAlgorithmInvoker(
        DeleteAlgorithmRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.deleteAlgorithm, hcClient);
    }

    /**
     * 删除算法设计项目中的文件
     *
     * 删除算法设计项目中的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmFileRequest 请求对象
     * @return DeleteAlgorithmFileResponse
     */
    public DeleteAlgorithmFileResponse deleteAlgorithmFile(DeleteAlgorithmFileRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.deleteAlgorithmFile);
    }

    /**
     * 删除算法设计项目中的文件
     *
     * 删除算法设计项目中的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmFileRequest 请求对象
     * @return SyncInvoker<DeleteAlgorithmFileRequest, DeleteAlgorithmFileResponse>
     */
    public SyncInvoker<DeleteAlgorithmFileRequest, DeleteAlgorithmFileResponse> deleteAlgorithmFileInvoker(
        DeleteAlgorithmFileRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.deleteAlgorithmFile, hcClient);
    }

    /**
     * 删除算法演化任务
     *
     * 删除算法演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEvolveTaskRequest 请求对象
     * @return DeleteEvolveTaskResponse
     */
    public DeleteEvolveTaskResponse deleteEvolveTask(DeleteEvolveTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.deleteEvolveTask);
    }

    /**
     * 删除算法演化任务
     *
     * 删除算法演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEvolveTaskRequest 请求对象
     * @return SyncInvoker<DeleteEvolveTaskRequest, DeleteEvolveTaskResponse>
     */
    public SyncInvoker<DeleteEvolveTaskRequest, DeleteEvolveTaskResponse> deleteEvolveTaskInvoker(
        DeleteEvolveTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.deleteEvolveTask, hcClient);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlgorithmFileRequest 请求对象
     * @return ImportAlgorithmFileResponse
     */
    public ImportAlgorithmFileResponse importAlgorithmFile(ImportAlgorithmFileRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.importAlgorithmFile);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlgorithmFileRequest 请求对象
     * @return SyncInvoker<ImportAlgorithmFileRequest, ImportAlgorithmFileResponse>
     */
    public SyncInvoker<ImportAlgorithmFileRequest, ImportAlgorithmFileResponse> importAlgorithmFileInvoker(
        ImportAlgorithmFileRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.importAlgorithmFile, hcClient);
    }

    /**
     * 批量查询设计项目列表
     *
     * 批量查询设计项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return ListAlgorithmsResponse
     */
    public ListAlgorithmsResponse listAlgorithms(ListAlgorithmsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listAlgorithms);
    }

    /**
     * 批量查询设计项目列表
     *
     * 批量查询设计项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return SyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse>
     */
    public SyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse> listAlgorithmsInvoker(
        ListAlgorithmsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listAlgorithms, hcClient);
    }

    /**
     * 获取某一算法设计项目文件目录
     *
     * 获取某一算法设计项目文件目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByAlgorithmIdRequest 请求对象
     * @return ListDirectoryByAlgorithmIdResponse
     */
    public ListDirectoryByAlgorithmIdResponse listDirectoryByAlgorithmId(ListDirectoryByAlgorithmIdRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listDirectoryByAlgorithmId);
    }

    /**
     * 获取某一算法设计项目文件目录
     *
     * 获取某一算法设计项目文件目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByAlgorithmIdRequest 请求对象
     * @return SyncInvoker<ListDirectoryByAlgorithmIdRequest, ListDirectoryByAlgorithmIdResponse>
     */
    public SyncInvoker<ListDirectoryByAlgorithmIdRequest, ListDirectoryByAlgorithmIdResponse> listDirectoryByAlgorithmIdInvoker(
        ListDirectoryByAlgorithmIdRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listDirectoryByAlgorithmId, hcClient);
    }

    /**
     * 获取某一演化任务某次结果的commit的目录
     *
     * 获取某一演化任务某次结果的commit的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByResultCommitIdRequest 请求对象
     * @return ListDirectoryByResultCommitIdResponse
     */
    public ListDirectoryByResultCommitIdResponse listDirectoryByResultCommitId(
        ListDirectoryByResultCommitIdRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listDirectoryByResultCommitId);
    }

    /**
     * 获取某一演化任务某次结果的commit的目录
     *
     * 获取某一演化任务某次结果的commit的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByResultCommitIdRequest 请求对象
     * @return SyncInvoker<ListDirectoryByResultCommitIdRequest, ListDirectoryByResultCommitIdResponse>
     */
    public SyncInvoker<ListDirectoryByResultCommitIdRequest, ListDirectoryByResultCommitIdResponse> listDirectoryByResultCommitIdInvoker(
        ListDirectoryByResultCommitIdRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listDirectoryByResultCommitId, hcClient);
    }

    /**
     * 批量查询演化项目列表
     *
     * 批量查询演化项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskMetasRequest 请求对象
     * @return ListEvolveTaskMetasResponse
     */
    public ListEvolveTaskMetasResponse listEvolveTaskMetas(ListEvolveTaskMetasRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listEvolveTaskMetas);
    }

    /**
     * 批量查询演化项目列表
     *
     * 批量查询演化项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskMetasRequest 请求对象
     * @return SyncInvoker<ListEvolveTaskMetasRequest, ListEvolveTaskMetasResponse>
     */
    public SyncInvoker<ListEvolveTaskMetasRequest, ListEvolveTaskMetasResponse> listEvolveTaskMetasInvoker(
        ListEvolveTaskMetasRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listEvolveTaskMetas, hcClient);
    }

    /**
     * 查询演化任务状态统计
     *
     * 查询演化任务状态统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskStatsRequest 请求对象
     * @return ListEvolveTaskStatsResponse
     */
    public ListEvolveTaskStatsResponse listEvolveTaskStats(ListEvolveTaskStatsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listEvolveTaskStats);
    }

    /**
     * 查询演化任务状态统计
     *
     * 查询演化任务状态统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskStatsRequest 请求对象
     * @return SyncInvoker<ListEvolveTaskStatsRequest, ListEvolveTaskStatsResponse>
     */
    public SyncInvoker<ListEvolveTaskStatsRequest, ListEvolveTaskStatsResponse> listEvolveTaskStatsInvoker(
        ListEvolveTaskStatsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listEvolveTaskStats, hcClient);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAlgorithmFileRequest 请求对象
     * @return SaveAlgorithmFileResponse
     */
    public SaveAlgorithmFileResponse saveAlgorithmFile(SaveAlgorithmFileRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.saveAlgorithmFile);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAlgorithmFileRequest 请求对象
     * @return SyncInvoker<SaveAlgorithmFileRequest, SaveAlgorithmFileResponse>
     */
    public SyncInvoker<SaveAlgorithmFileRequest, SaveAlgorithmFileResponse> saveAlgorithmFileInvoker(
        SaveAlgorithmFileRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.saveAlgorithmFile, hcClient);
    }

    /**
     * 获取某一算法信息详情
     *
     * 获取某一算法信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmRequest 请求对象
     * @return ShowAlgorithmResponse
     */
    public ShowAlgorithmResponse showAlgorithm(ShowAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showAlgorithm);
    }

    /**
     * 获取某一算法信息详情
     *
     * 获取某一算法信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmRequest 请求对象
     * @return SyncInvoker<ShowAlgorithmRequest, ShowAlgorithmResponse>
     */
    public SyncInvoker<ShowAlgorithmRequest, ShowAlgorithmResponse> showAlgorithmInvoker(ShowAlgorithmRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showAlgorithm, hcClient);
    }

    /**
     * 获取某一算法设计项目某一文件中的内容
     *
     * 获取某一算法设计项目某一文件中的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmFileRequest 请求对象
     * @return ShowAlgorithmFileResponse
     */
    public ShowAlgorithmFileResponse showAlgorithmFile(ShowAlgorithmFileRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showAlgorithmFile);
    }

    /**
     * 获取某一算法设计项目某一文件中的内容
     *
     * 获取某一算法设计项目某一文件中的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmFileRequest 请求对象
     * @return SyncInvoker<ShowAlgorithmFileRequest, ShowAlgorithmFileResponse>
     */
    public SyncInvoker<ShowAlgorithmFileRequest, ShowAlgorithmFileResponse> showAlgorithmFileInvoker(
        ShowAlgorithmFileRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showAlgorithmFile, hcClient);
    }

    /**
     * 获取某一演化任务详情
     *
     * 获取某一演化任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDetailsRequest 请求对象
     * @return ShowTaskDetailsResponse
     */
    public ShowTaskDetailsResponse showTaskDetails(ShowTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showTaskDetails);
    }

    /**
     * 获取某一演化任务详情
     *
     * 获取某一演化任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowTaskDetailsRequest, ShowTaskDetailsResponse>
     */
    public SyncInvoker<ShowTaskDetailsRequest, ShowTaskDetailsResponse> showTaskDetailsInvoker(
        ShowTaskDetailsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showTaskDetails, hcClient);
    }

    /**
     * 获取某一演化任务某次结果的commit文件
     *
     * 获取某一演化任务某次结果的commit文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultCommitRequest 请求对象
     * @return ShowTaskResultCommitResponse
     */
    public ShowTaskResultCommitResponse showTaskResultCommit(ShowTaskResultCommitRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showTaskResultCommit);
    }

    /**
     * 获取某一演化任务某次结果的commit文件
     *
     * 获取某一演化任务某次结果的commit文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultCommitRequest 请求对象
     * @return SyncInvoker<ShowTaskResultCommitRequest, ShowTaskResultCommitResponse>
     */
    public SyncInvoker<ShowTaskResultCommitRequest, ShowTaskResultCommitResponse> showTaskResultCommitInvoker(
        ShowTaskResultCommitRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showTaskResultCommit, hcClient);
    }

    /**
     * 获取某一演化任务运行详结果列表
     *
     * 获取某一演化任务运行详结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultListRequest 请求对象
     * @return ShowTaskResultListResponse
     */
    public ShowTaskResultListResponse showTaskResultList(ShowTaskResultListRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showTaskResultList);
    }

    /**
     * 获取某一演化任务运行详结果列表
     *
     * 获取某一演化任务运行详结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultListRequest 请求对象
     * @return SyncInvoker<ShowTaskResultListRequest, ShowTaskResultListResponse>
     */
    public SyncInvoker<ShowTaskResultListRequest, ShowTaskResultListResponse> showTaskResultListInvoker(
        ShowTaskResultListRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showTaskResultList, hcClient);
    }

    /**
     * 获取某一演化任务运行详情
     *
     * 获取某一演化任务运行详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningDetailsRequest 请求对象
     * @return ShowTaskRunningDetailsResponse
     */
    public ShowTaskRunningDetailsResponse showTaskRunningDetails(ShowTaskRunningDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showTaskRunningDetails);
    }

    /**
     * 获取某一演化任务运行详情
     *
     * 获取某一演化任务运行详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningDetailsRequest 请求对象
     * @return SyncInvoker<ShowTaskRunningDetailsRequest, ShowTaskRunningDetailsResponse>
     */
    public SyncInvoker<ShowTaskRunningDetailsRequest, ShowTaskRunningDetailsResponse> showTaskRunningDetailsInvoker(
        ShowTaskRunningDetailsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showTaskRunningDetails, hcClient);
    }

    /**
     * 获取某一演化任务运行日志
     *
     * 获取某一演化任务运行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningLogRequest 请求对象
     * @return ShowTaskRunningLogResponse
     */
    public ShowTaskRunningLogResponse showTaskRunningLog(ShowTaskRunningLogRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showTaskRunningLog);
    }

    /**
     * 获取某一演化任务运行日志
     *
     * 获取某一演化任务运行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningLogRequest 请求对象
     * @return SyncInvoker<ShowTaskRunningLogRequest, ShowTaskRunningLogResponse>
     */
    public SyncInvoker<ShowTaskRunningLogRequest, ShowTaskRunningLogResponse> showTaskRunningLogInvoker(
        ShowTaskRunningLogRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showTaskRunningLog, hcClient);
    }

    /**
     * 启动演化任务
     *
     * 启动演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartEvolveTaskRequest 请求对象
     * @return StartEvolveTaskResponse
     */
    public StartEvolveTaskResponse startEvolveTask(StartEvolveTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.startEvolveTask);
    }

    /**
     * 启动演化任务
     *
     * 启动演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartEvolveTaskRequest 请求对象
     * @return SyncInvoker<StartEvolveTaskRequest, StartEvolveTaskResponse>
     */
    public SyncInvoker<StartEvolveTaskRequest, StartEvolveTaskResponse> startEvolveTaskInvoker(
        StartEvolveTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.startEvolveTask, hcClient);
    }

    /**
     * 停止演化任务
     *
     * 停止演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopEvolveTaskRequest 请求对象
     * @return StopEvolveTaskResponse
     */
    public StopEvolveTaskResponse stopEvolveTask(StopEvolveTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.stopEvolveTask);
    }

    /**
     * 停止演化任务
     *
     * 停止演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopEvolveTaskRequest 请求对象
     * @return SyncInvoker<StopEvolveTaskRequest, StopEvolveTaskResponse>
     */
    public SyncInvoker<StopEvolveTaskRequest, StopEvolveTaskResponse> stopEvolveTaskInvoker(
        StopEvolveTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.stopEvolveTask, hcClient);
    }

    /**
     * 更新算法设计项目信息
     *
     * 更新算法设计项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlgorithmRequest 请求对象
     * @return UpdateAlgorithmResponse
     */
    public UpdateAlgorithmResponse updateAlgorithm(UpdateAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.updateAlgorithm);
    }

    /**
     * 更新算法设计项目信息
     *
     * 更新算法设计项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlgorithmRequest 请求对象
     * @return SyncInvoker<UpdateAlgorithmRequest, UpdateAlgorithmResponse>
     */
    public SyncInvoker<UpdateAlgorithmRequest, UpdateAlgorithmResponse> updateAlgorithmInvoker(
        UpdateAlgorithmRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.updateAlgorithm, hcClient);
    }

    /**
     * 更新算法演化任务信息
     *
     * 更新算法演化任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEvolveTaskRequest 请求对象
     * @return UpdateEvolveTaskResponse
     */
    public UpdateEvolveTaskResponse updateEvolveTask(UpdateEvolveTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.updateEvolveTask);
    }

    /**
     * 更新算法演化任务信息
     *
     * 更新算法演化任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEvolveTaskRequest 请求对象
     * @return SyncInvoker<UpdateEvolveTaskRequest, UpdateEvolveTaskResponse>
     */
    public SyncInvoker<UpdateEvolveTaskRequest, UpdateEvolveTaskResponse> updateEvolveTaskInvoker(
        UpdateEvolveTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.updateEvolveTask, hcClient);
    }

    /**
     * 删除模型资产
     *
     * 删除模型资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelAssetRequest 请求对象
     * @return DeleteModelAssetResponse
     */
    public DeleteModelAssetResponse deleteModelAsset(DeleteModelAssetRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.deleteModelAsset);
    }

    /**
     * 删除模型资产
     *
     * 删除模型资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelAssetRequest 请求对象
     * @return SyncInvoker<DeleteModelAssetRequest, DeleteModelAssetResponse>
     */
    public SyncInvoker<DeleteModelAssetRequest, DeleteModelAssetResponse> deleteModelAssetInvoker(
        DeleteModelAssetRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.deleteModelAsset, hcClient);
    }

    /**
     * 获取模型资产列表
     *
     * 获取模型资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelAssetsRequest 请求对象
     * @return ListModelAssetsResponse
     */
    public ListModelAssetsResponse listModelAssets(ListModelAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listModelAssets);
    }

    /**
     * 获取模型资产列表
     *
     * 获取模型资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelAssetsRequest 请求对象
     * @return SyncInvoker<ListModelAssetsRequest, ListModelAssetsResponse>
     */
    public SyncInvoker<ListModelAssetsRequest, ListModelAssetsResponse> listModelAssetsInvoker(
        ListModelAssetsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listModelAssets, hcClient);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelAssetDetailRequest 请求对象
     * @return ShowModelAssetDetailResponse
     */
    public ShowModelAssetDetailResponse showModelAssetDetail(ShowModelAssetDetailRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showModelAssetDetail);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelAssetDetailRequest 请求对象
     * @return SyncInvoker<ShowModelAssetDetailRequest, ShowModelAssetDetailResponse>
     */
    public SyncInvoker<ShowModelAssetDetailRequest, ShowModelAssetDetailResponse> showModelAssetDetailInvoker(
        ShowModelAssetDetailRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showModelAssetDetail, hcClient);
    }

    /**
     * 编辑模型资产
     *
     * 编辑模型资产描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelAssetRequest 请求对象
     * @return UpdateModelAssetResponse
     */
    public UpdateModelAssetResponse updateModelAsset(UpdateModelAssetRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.updateModelAsset);
    }

    /**
     * 编辑模型资产
     *
     * 编辑模型资产描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelAssetRequest 请求对象
     * @return SyncInvoker<UpdateModelAssetRequest, UpdateModelAssetResponse>
     */
    public SyncInvoker<UpdateModelAssetRequest, UpdateModelAssetResponse> updateModelAssetInvoker(
        UpdateModelAssetRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.updateModelAsset, hcClient);
    }

    /**
     * 取消对话
     *
     * 取消对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelChatRequest 请求对象
     * @return CancelChatResponse
     */
    public CancelChatResponse cancelChat(CancelChatRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.cancelChat);
    }

    /**
     * 取消对话
     *
     * 取消对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelChatRequest 请求对象
     * @return SyncInvoker<CancelChatRequest, CancelChatResponse>
     */
    public SyncInvoker<CancelChatRequest, CancelChatResponse> cancelChatInvoker(CancelChatRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.cancelChat, hcClient);
    }

    /**
     * 产物中心
     *
     * 创建产物中心产物。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArtifactsRequest 请求对象
     * @return CreateArtifactsResponse
     */
    public CreateArtifactsResponse createArtifacts(CreateArtifactsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.createArtifacts);
    }

    /**
     * 产物中心
     *
     * 创建产物中心产物。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArtifactsRequest 请求对象
     * @return SyncInvoker<CreateArtifactsRequest, CreateArtifactsResponse>
     */
    public SyncInvoker<CreateArtifactsRequest, CreateArtifactsResponse> createArtifactsInvoker(
        CreateArtifactsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.createArtifacts, hcClient);
    }

    /**
     * 删除对话
     *
     * 删除对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChatRequest 请求对象
     * @return DeleteChatResponse
     */
    public DeleteChatResponse deleteChat(DeleteChatRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.deleteChat);
    }

    /**
     * 删除对话
     *
     * 删除对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChatRequest 请求对象
     * @return SyncInvoker<DeleteChatRequest, DeleteChatResponse>
     */
    public SyncInvoker<DeleteChatRequest, DeleteChatResponse> deleteChatInvoker(DeleteChatRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.deleteChat, hcClient);
    }

    /**
     * 下载文件
     *
     * 下载文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadFileRequest 请求对象
     * @return DownloadFileResponse
     */
    public DownloadFileResponse downloadFile(DownloadFileRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.downloadFile);
    }

    /**
     * 下载文件
     *
     * 下载文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadFileRequest 请求对象
     * @return SyncInvoker<DownloadFileRequest, DownloadFileResponse>
     */
    public SyncInvoker<DownloadFileRequest, DownloadFileResponse> downloadFileInvoker(DownloadFileRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.downloadFile, hcClient);
    }

    /**
     * 获取产物中心列表
     *
     * 获取产物中心列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactsRequest 请求对象
     * @return ListArtifactsResponse
     */
    public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listArtifacts);
    }

    /**
     * 获取产物中心列表
     *
     * 获取产物中心列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactsRequest 请求对象
     * @return SyncInvoker<ListArtifactsRequest, ListArtifactsResponse>
     */
    public SyncInvoker<ListArtifactsRequest, ListArtifactsResponse> listArtifactsInvoker(ListArtifactsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listArtifacts, hcClient);
    }

    /**
     * 获取对话列表
     *
     * 获取对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChatRequest 请求对象
     * @return ListChatResponse
     */
    public ListChatResponse listChat(ListChatRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listChat);
    }

    /**
     * 获取对话列表
     *
     * 获取对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChatRequest 请求对象
     * @return SyncInvoker<ListChatRequest, ListChatResponse>
     */
    public SyncInvoker<ListChatRequest, ListChatResponse> listChatInvoker(ListChatRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listChat, hcClient);
    }

    /**
     * 发布助手
     *
     * 发布助手。
     * 发布前会校验当前助手最后一个阶段的文档是否已确认，确认后才可发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishChatRequest 请求对象
     * @return PublishChatResponse
     */
    public PublishChatResponse publishChat(PublishChatRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.publishChat);
    }

    /**
     * 发布助手
     *
     * 发布助手。
     * 发布前会校验当前助手最后一个阶段的文档是否已确认，确认后才可发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishChatRequest 请求对象
     * @return SyncInvoker<PublishChatRequest, PublishChatResponse>
     */
    public SyncInvoker<PublishChatRequest, PublishChatResponse> publishChatInvoker(PublishChatRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.publishChat, hcClient);
    }

    /**
     * 获取对话详情
     *
     * 获取对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChatRequest 请求对象
     * @return ShowChatResponse
     */
    public ShowChatResponse showChat(ShowChatRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showChat);
    }

    /**
     * 获取对话详情
     *
     * 获取对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChatRequest 请求对象
     * @return SyncInvoker<ShowChatRequest, ShowChatResponse>
     */
    public SyncInvoker<ShowChatRequest, ShowChatResponse> showChatInvoker(ShowChatRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showChat, hcClient);
    }

    /**
     * 更新对话
     *
     * 更新对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChatRequest 请求对象
     * @return UpdateChatResponse
     */
    public UpdateChatResponse updateChat(UpdateChatRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.updateChat);
    }

    /**
     * 更新对话
     *
     * 更新对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChatRequest 请求对象
     * @return SyncInvoker<UpdateChatRequest, UpdateChatResponse>
     */
    public SyncInvoker<UpdateChatRequest, UpdateChatResponse> updateChatInvoker(UpdateChatRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.updateChat, hcClient);
    }

    /**
     * 上传文件
     *
     * 上传文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFile(UploadFileRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.uploadFile);
    }

    /**
     * 上传文件
     *
     * 上传文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return SyncInvoker<UploadFileRequest, UploadFileResponse>
     */
    public SyncInvoker<UploadFileRequest, UploadFileResponse> uploadFileInvoker(UploadFileRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.uploadFile, hcClient);
    }

    /**
     * 创建模型服务
     *
     * 创建模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelServiceRequest 请求对象
     * @return CreateModelServiceResponse
     */
    public CreateModelServiceResponse createModelService(CreateModelServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.createModelService);
    }

    /**
     * 创建模型服务
     *
     * 创建模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelServiceRequest 请求对象
     * @return SyncInvoker<CreateModelServiceRequest, CreateModelServiceResponse>
     */
    public SyncInvoker<CreateModelServiceRequest, CreateModelServiceResponse> createModelServiceInvoker(
        CreateModelServiceRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.createModelService, hcClient);
    }

    /**
     * 调用模型服务创建任务
     *
     * 调用模型服务创建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelServiceTaskRequest 请求对象
     * @return CreateModelServiceTaskResponse
     */
    public CreateModelServiceTaskResponse createModelServiceTask(CreateModelServiceTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.createModelServiceTask);
    }

    /**
     * 调用模型服务创建任务
     *
     * 调用模型服务创建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelServiceTaskRequest 请求对象
     * @return SyncInvoker<CreateModelServiceTaskRequest, CreateModelServiceTaskResponse>
     */
    public SyncInvoker<CreateModelServiceTaskRequest, CreateModelServiceTaskResponse> createModelServiceTaskInvoker(
        CreateModelServiceTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.createModelServiceTask, hcClient);
    }

    /**
     * 删除模型服务
     *
     * 删除模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelServiceRequest 请求对象
     * @return DeleteModelServiceResponse
     */
    public DeleteModelServiceResponse deleteModelService(DeleteModelServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.deleteModelService);
    }

    /**
     * 删除模型服务
     *
     * 删除模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelServiceRequest 请求对象
     * @return SyncInvoker<DeleteModelServiceRequest, DeleteModelServiceResponse>
     */
    public SyncInvoker<DeleteModelServiceRequest, DeleteModelServiceResponse> deleteModelServiceInvoker(
        DeleteModelServiceRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.deleteModelService, hcClient);
    }

    /**
     * 获取模型服务任务列表
     *
     * 获取模型服务任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelServiceTasksRequest 请求对象
     * @return ListModelServiceTasksResponse
     */
    public ListModelServiceTasksResponse listModelServiceTasks(ListModelServiceTasksRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listModelServiceTasks);
    }

    /**
     * 获取模型服务任务列表
     *
     * 获取模型服务任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelServiceTasksRequest 请求对象
     * @return SyncInvoker<ListModelServiceTasksRequest, ListModelServiceTasksResponse>
     */
    public SyncInvoker<ListModelServiceTasksRequest, ListModelServiceTasksResponse> listModelServiceTasksInvoker(
        ListModelServiceTasksRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listModelServiceTasks, hcClient);
    }

    /**
     * 获取模型服务详情
     *
     * 获取模型服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelServiceDetailRequest 请求对象
     * @return ShowModelServiceDetailResponse
     */
    public ShowModelServiceDetailResponse showModelServiceDetail(ShowModelServiceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showModelServiceDetail);
    }

    /**
     * 获取模型服务详情
     *
     * 获取模型服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelServiceDetailRequest 请求对象
     * @return SyncInvoker<ShowModelServiceDetailRequest, ShowModelServiceDetailResponse>
     */
    public SyncInvoker<ShowModelServiceDetailRequest, ShowModelServiceDetailResponse> showModelServiceDetailInvoker(
        ShowModelServiceDetailRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showModelServiceDetail, hcClient);
    }

    /**
     * 获取模型服务列表
     *
     * 获取模型服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelServiceListRequest 请求对象
     * @return ShowModelServiceListResponse
     */
    public ShowModelServiceListResponse showModelServiceList(ShowModelServiceListRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showModelServiceList);
    }

    /**
     * 获取模型服务列表
     *
     * 获取模型服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelServiceListRequest 请求对象
     * @return SyncInvoker<ShowModelServiceListRequest, ShowModelServiceListResponse>
     */
    public SyncInvoker<ShowModelServiceListRequest, ShowModelServiceListResponse> showModelServiceListInvoker(
        ShowModelServiceListRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showModelServiceList, hcClient);
    }

    /**
     * 获取模型服务任务详情
     *
     * 获取模型服务任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelServiceTaskRequest 请求对象
     * @return ShowModelServiceTaskResponse
     */
    public ShowModelServiceTaskResponse showModelServiceTask(ShowModelServiceTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showModelServiceTask);
    }

    /**
     * 获取模型服务任务详情
     *
     * 获取模型服务任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModelServiceTaskRequest 请求对象
     * @return SyncInvoker<ShowModelServiceTaskRequest, ShowModelServiceTaskResponse>
     */
    public SyncInvoker<ShowModelServiceTaskRequest, ShowModelServiceTaskResponse> showModelServiceTaskInvoker(
        ShowModelServiceTaskRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.showModelServiceTask, hcClient);
    }

    /**
     * 启动模型服务
     *
     * 启动模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartModelServiceRequest 请求对象
     * @return StartModelServiceResponse
     */
    public StartModelServiceResponse startModelService(StartModelServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.startModelService);
    }

    /**
     * 启动模型服务
     *
     * 启动模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartModelServiceRequest 请求对象
     * @return SyncInvoker<StartModelServiceRequest, StartModelServiceResponse>
     */
    public SyncInvoker<StartModelServiceRequest, StartModelServiceResponse> startModelServiceInvoker(
        StartModelServiceRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.startModelService, hcClient);
    }

    /**
     * 停止模型服务
     *
     * 停止模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopModelServiceRequest 请求对象
     * @return StopModelServiceResponse
     */
    public StopModelServiceResponse stopModelService(StopModelServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.stopModelService);
    }

    /**
     * 停止模型服务
     *
     * 停止模型服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopModelServiceRequest 请求对象
     * @return SyncInvoker<StopModelServiceRequest, StopModelServiceResponse>
     */
    public SyncInvoker<StopModelServiceRequest, StopModelServiceResponse> stopModelServiceInvoker(
        StopModelServiceRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.stopModelService, hcClient);
    }

    /**
     * 编辑推理服务
     *
     * 编辑推理服务，仅支持修改服务名称和服务描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelServiceRequest 请求对象
     * @return UpdateModelServiceResponse
     */
    public UpdateModelServiceResponse updateModelService(UpdateModelServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.updateModelService);
    }

    /**
     * 编辑推理服务
     *
     * 编辑推理服务，仅支持修改服务名称和服务描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelServiceRequest 请求对象
     * @return SyncInvoker<UpdateModelServiceRequest, UpdateModelServiceResponse>
     */
    public SyncInvoker<UpdateModelServiceRequest, UpdateModelServiceResponse> updateModelServiceInvoker(
        UpdateModelServiceRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.updateModelService, hcClient);
    }

    /**
     * 上传任务依赖的输入文件
     *
     * 上传任务依赖的输入文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadModelServiceTaskFileRequest 请求对象
     * @return UploadModelServiceTaskFileResponse
     */
    public UploadModelServiceTaskFileResponse uploadModelServiceTaskFile(UploadModelServiceTaskFileRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.uploadModelServiceTaskFile);
    }

    /**
     * 上传任务依赖的输入文件
     *
     * 上传任务依赖的输入文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadModelServiceTaskFileRequest 请求对象
     * @return SyncInvoker<UploadModelServiceTaskFileRequest, UploadModelServiceTaskFileResponse>
     */
    public SyncInvoker<UploadModelServiceTaskFileRequest, UploadModelServiceTaskFileResponse> uploadModelServiceTaskFileInvoker(
        UploadModelServiceTaskFileRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.uploadModelServiceTaskFile, hcClient);
    }

    /**
     * 发布模型
     *
     * 发布训练任务生成的模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishModelRequest 请求对象
     * @return PublishModelResponse
     */
    public PublishModelResponse publishModel(PublishModelRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.publishModel);
    }

    /**
     * 发布模型
     *
     * 发布训练任务生成的模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishModelRequest 请求对象
     * @return SyncInvoker<PublishModelRequest, PublishModelResponse>
     */
    public SyncInvoker<PublishModelRequest, PublishModelResponse> publishModelInvoker(PublishModelRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.publishModel, hcClient);
    }

    /**
     * 授权
     *
     * 授予LLM4AD操作用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizePermissionRequest 请求对象
     * @return AuthorizePermissionResponse
     */
    public AuthorizePermissionResponse authorizePermission(AuthorizePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.authorizePermission);
    }

    /**
     * 授权
     *
     * 授予LLM4AD操作用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizePermissionRequest 请求对象
     * @return SyncInvoker<AuthorizePermissionRequest, AuthorizePermissionResponse>
     */
    public SyncInvoker<AuthorizePermissionRequest, AuthorizePermissionResponse> authorizePermissionInvoker(
        AuthorizePermissionRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.authorizePermission, hcClient);
    }

    /**
     * 获取Bucket清单
     *
     * 获取Bucket清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return ListBucketsResponse
     */
    public ListBucketsResponse listBuckets(ListBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listBuckets);
    }

    /**
     * 获取Bucket清单
     *
     * 获取Bucket清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return SyncInvoker<ListBucketsRequest, ListBucketsResponse>
     */
    public SyncInvoker<ListBucketsRequest, ListBucketsResponse> listBucketsInvoker(ListBucketsRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listBuckets, hcClient);
    }

    /**
     * 获取Object清单
     *
     * 获取Object清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObjectRequest 请求对象
     * @return ListObjectResponse
     */
    public ListObjectResponse listObject(ListObjectRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listObject);
    }

    /**
     * 获取Object清单
     *
     * 获取Object清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObjectRequest 请求对象
     * @return SyncInvoker<ListObjectRequest, ListObjectResponse>
     */
    public SyncInvoker<ListObjectRequest, ListObjectResponse> listObjectInvoker(ListObjectRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listObject, hcClient);
    }

    /**
     * 检查桶的权限
     *
     * 检查桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionRequest 请求对象
     * @return ListPermissionResponse
     */
    public ListPermissionResponse listPermission(ListPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listPermission);
    }

    /**
     * 检查桶的权限
     *
     * 检查桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionRequest 请求对象
     * @return SyncInvoker<ListPermissionRequest, ListPermissionResponse>
     */
    public SyncInvoker<ListPermissionRequest, ListPermissionResponse> listPermissionInvoker(
        ListPermissionRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.listPermission, hcClient);
    }

    /**
     * 取消授权
     *
     * 取消LLM4AD对用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokePermissionRequest 请求对象
     * @return RevokePermissionResponse
     */
    public RevokePermissionResponse revokePermission(RevokePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, OptVerseMeta.revokePermission);
    }

    /**
     * 取消授权
     *
     * 取消LLM4AD对用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokePermissionRequest 请求对象
     * @return SyncInvoker<RevokePermissionRequest, RevokePermissionResponse>
     */
    public SyncInvoker<RevokePermissionRequest, RevokePermissionResponse> revokePermissionInvoker(
        RevokePermissionRequest request) {
        return new SyncInvoker<>(request, OptVerseMeta.revokePermission, hcClient);
    }

}
