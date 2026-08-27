package com.huaweicloud.sdk.optverse.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.optverse.v1.model.AuthorizePermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.AuthorizePermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.BatchDeleteEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.BatchDeleteEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmResponse;
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
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskResponse;

import java.util.concurrent.CompletableFuture;

public class OptVerseAsyncClient {

    protected HcClient hcClient;

    public OptVerseAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OptVerseAsyncClient> newBuilder() {
        ClientBuilder<OptVerseAsyncClient> clientBuilder = new ClientBuilder<>(OptVerseAsyncClient::new);
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
     * @return CompletableFuture<BatchDeleteEvolveTaskResponse>
     */
    public CompletableFuture<BatchDeleteEvolveTaskResponse> batchDeleteEvolveTaskAsync(
        BatchDeleteEvolveTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.batchDeleteEvolveTask);
    }

    /**
     * 删除算法演化任务
     *
     * 删除算法演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteEvolveTaskRequest 请求对象
     * @return AsyncInvoker<BatchDeleteEvolveTaskRequest, BatchDeleteEvolveTaskResponse>
     */
    public AsyncInvoker<BatchDeleteEvolveTaskRequest, BatchDeleteEvolveTaskResponse> batchDeleteEvolveTaskAsyncInvoker(
        BatchDeleteEvolveTaskRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.batchDeleteEvolveTask, hcClient);
    }

    /**
     * 创建设计项目
     *
     * 创建设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return CompletableFuture<CreateAlgorithmResponse>
     */
    public CompletableFuture<CreateAlgorithmResponse> createAlgorithmAsync(CreateAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.createAlgorithm);
    }

    /**
     * 创建设计项目
     *
     * 创建设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return AsyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse>
     */
    public AsyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse> createAlgorithmAsyncInvoker(
        CreateAlgorithmRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.createAlgorithm, hcClient);
    }

    /**
     * 创建演化任务
     *
     * 创建演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvolveTaskRequest 请求对象
     * @return CompletableFuture<CreateEvolveTaskResponse>
     */
    public CompletableFuture<CreateEvolveTaskResponse> createEvolveTaskAsync(CreateEvolveTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.createEvolveTask);
    }

    /**
     * 创建演化任务
     *
     * 创建演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvolveTaskRequest 请求对象
     * @return AsyncInvoker<CreateEvolveTaskRequest, CreateEvolveTaskResponse>
     */
    public AsyncInvoker<CreateEvolveTaskRequest, CreateEvolveTaskResponse> createEvolveTaskAsyncInvoker(
        CreateEvolveTaskRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.createEvolveTask, hcClient);
    }

    /**
     * 删除算法设计项目
     *
     * 删除算法设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return CompletableFuture<DeleteAlgorithmResponse>
     */
    public CompletableFuture<DeleteAlgorithmResponse> deleteAlgorithmAsync(DeleteAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.deleteAlgorithm);
    }

    /**
     * 删除算法设计项目
     *
     * 删除算法设计项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return AsyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse>
     */
    public AsyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse> deleteAlgorithmAsyncInvoker(
        DeleteAlgorithmRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.deleteAlgorithm, hcClient);
    }

    /**
     * 删除算法设计项目中的文件
     *
     * 删除算法设计项目中的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmFileRequest 请求对象
     * @return CompletableFuture<DeleteAlgorithmFileResponse>
     */
    public CompletableFuture<DeleteAlgorithmFileResponse> deleteAlgorithmFileAsync(DeleteAlgorithmFileRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.deleteAlgorithmFile);
    }

    /**
     * 删除算法设计项目中的文件
     *
     * 删除算法设计项目中的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmFileRequest 请求对象
     * @return AsyncInvoker<DeleteAlgorithmFileRequest, DeleteAlgorithmFileResponse>
     */
    public AsyncInvoker<DeleteAlgorithmFileRequest, DeleteAlgorithmFileResponse> deleteAlgorithmFileAsyncInvoker(
        DeleteAlgorithmFileRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.deleteAlgorithmFile, hcClient);
    }

    /**
     * 删除算法演化任务
     *
     * 删除算法演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEvolveTaskRequest 请求对象
     * @return CompletableFuture<DeleteEvolveTaskResponse>
     */
    public CompletableFuture<DeleteEvolveTaskResponse> deleteEvolveTaskAsync(DeleteEvolveTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.deleteEvolveTask);
    }

    /**
     * 删除算法演化任务
     *
     * 删除算法演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEvolveTaskRequest 请求对象
     * @return AsyncInvoker<DeleteEvolveTaskRequest, DeleteEvolveTaskResponse>
     */
    public AsyncInvoker<DeleteEvolveTaskRequest, DeleteEvolveTaskResponse> deleteEvolveTaskAsyncInvoker(
        DeleteEvolveTaskRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.deleteEvolveTask, hcClient);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlgorithmFileRequest 请求对象
     * @return CompletableFuture<ImportAlgorithmFileResponse>
     */
    public CompletableFuture<ImportAlgorithmFileResponse> importAlgorithmFileAsync(ImportAlgorithmFileRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.importAlgorithmFile);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlgorithmFileRequest 请求对象
     * @return AsyncInvoker<ImportAlgorithmFileRequest, ImportAlgorithmFileResponse>
     */
    public AsyncInvoker<ImportAlgorithmFileRequest, ImportAlgorithmFileResponse> importAlgorithmFileAsyncInvoker(
        ImportAlgorithmFileRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.importAlgorithmFile, hcClient);
    }

    /**
     * 批量查询设计项目列表
     *
     * 批量查询设计项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return CompletableFuture<ListAlgorithmsResponse>
     */
    public CompletableFuture<ListAlgorithmsResponse> listAlgorithmsAsync(ListAlgorithmsRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listAlgorithms);
    }

    /**
     * 批量查询设计项目列表
     *
     * 批量查询设计项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return AsyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse>
     */
    public AsyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse> listAlgorithmsAsyncInvoker(
        ListAlgorithmsRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listAlgorithms, hcClient);
    }

    /**
     * 获取某一算法设计项目文件目录
     *
     * 获取某一算法设计项目文件目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByAlgorithmIdRequest 请求对象
     * @return CompletableFuture<ListDirectoryByAlgorithmIdResponse>
     */
    public CompletableFuture<ListDirectoryByAlgorithmIdResponse> listDirectoryByAlgorithmIdAsync(
        ListDirectoryByAlgorithmIdRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listDirectoryByAlgorithmId);
    }

    /**
     * 获取某一算法设计项目文件目录
     *
     * 获取某一算法设计项目文件目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByAlgorithmIdRequest 请求对象
     * @return AsyncInvoker<ListDirectoryByAlgorithmIdRequest, ListDirectoryByAlgorithmIdResponse>
     */
    public AsyncInvoker<ListDirectoryByAlgorithmIdRequest, ListDirectoryByAlgorithmIdResponse> listDirectoryByAlgorithmIdAsyncInvoker(
        ListDirectoryByAlgorithmIdRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listDirectoryByAlgorithmId, hcClient);
    }

    /**
     * 获取某一演化任务某次结果的commit的目录
     *
     * 获取某一演化任务某次结果的commit的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByResultCommitIdRequest 请求对象
     * @return CompletableFuture<ListDirectoryByResultCommitIdResponse>
     */
    public CompletableFuture<ListDirectoryByResultCommitIdResponse> listDirectoryByResultCommitIdAsync(
        ListDirectoryByResultCommitIdRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listDirectoryByResultCommitId);
    }

    /**
     * 获取某一演化任务某次结果的commit的目录
     *
     * 获取某一演化任务某次结果的commit的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoryByResultCommitIdRequest 请求对象
     * @return AsyncInvoker<ListDirectoryByResultCommitIdRequest, ListDirectoryByResultCommitIdResponse>
     */
    public AsyncInvoker<ListDirectoryByResultCommitIdRequest, ListDirectoryByResultCommitIdResponse> listDirectoryByResultCommitIdAsyncInvoker(
        ListDirectoryByResultCommitIdRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listDirectoryByResultCommitId, hcClient);
    }

    /**
     * 批量查询演化项目列表
     *
     * 批量查询演化项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskMetasRequest 请求对象
     * @return CompletableFuture<ListEvolveTaskMetasResponse>
     */
    public CompletableFuture<ListEvolveTaskMetasResponse> listEvolveTaskMetasAsync(ListEvolveTaskMetasRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listEvolveTaskMetas);
    }

    /**
     * 批量查询演化项目列表
     *
     * 批量查询演化项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskMetasRequest 请求对象
     * @return AsyncInvoker<ListEvolveTaskMetasRequest, ListEvolveTaskMetasResponse>
     */
    public AsyncInvoker<ListEvolveTaskMetasRequest, ListEvolveTaskMetasResponse> listEvolveTaskMetasAsyncInvoker(
        ListEvolveTaskMetasRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listEvolveTaskMetas, hcClient);
    }

    /**
     * 查询演化任务状态统计
     *
     * 查询演化任务状态统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskStatsRequest 请求对象
     * @return CompletableFuture<ListEvolveTaskStatsResponse>
     */
    public CompletableFuture<ListEvolveTaskStatsResponse> listEvolveTaskStatsAsync(ListEvolveTaskStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listEvolveTaskStats);
    }

    /**
     * 查询演化任务状态统计
     *
     * 查询演化任务状态统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvolveTaskStatsRequest 请求对象
     * @return AsyncInvoker<ListEvolveTaskStatsRequest, ListEvolveTaskStatsResponse>
     */
    public AsyncInvoker<ListEvolveTaskStatsRequest, ListEvolveTaskStatsResponse> listEvolveTaskStatsAsyncInvoker(
        ListEvolveTaskStatsRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listEvolveTaskStats, hcClient);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAlgorithmFileRequest 请求对象
     * @return CompletableFuture<SaveAlgorithmFileResponse>
     */
    public CompletableFuture<SaveAlgorithmFileResponse> saveAlgorithmFileAsync(SaveAlgorithmFileRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.saveAlgorithmFile);
    }

    /**
     * 保存算法文件
     *
     * 保存算法文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAlgorithmFileRequest 请求对象
     * @return AsyncInvoker<SaveAlgorithmFileRequest, SaveAlgorithmFileResponse>
     */
    public AsyncInvoker<SaveAlgorithmFileRequest, SaveAlgorithmFileResponse> saveAlgorithmFileAsyncInvoker(
        SaveAlgorithmFileRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.saveAlgorithmFile, hcClient);
    }

    /**
     * 获取某一算法信息详情
     *
     * 获取某一算法信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmRequest 请求对象
     * @return CompletableFuture<ShowAlgorithmResponse>
     */
    public CompletableFuture<ShowAlgorithmResponse> showAlgorithmAsync(ShowAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.showAlgorithm);
    }

    /**
     * 获取某一算法信息详情
     *
     * 获取某一算法信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmRequest 请求对象
     * @return AsyncInvoker<ShowAlgorithmRequest, ShowAlgorithmResponse>
     */
    public AsyncInvoker<ShowAlgorithmRequest, ShowAlgorithmResponse> showAlgorithmAsyncInvoker(
        ShowAlgorithmRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.showAlgorithm, hcClient);
    }

    /**
     * 获取某一算法设计项目某一文件中的内容
     *
     * 获取某一算法设计项目某一文件中的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmFileRequest 请求对象
     * @return CompletableFuture<ShowAlgorithmFileResponse>
     */
    public CompletableFuture<ShowAlgorithmFileResponse> showAlgorithmFileAsync(ShowAlgorithmFileRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.showAlgorithmFile);
    }

    /**
     * 获取某一算法设计项目某一文件中的内容
     *
     * 获取某一算法设计项目某一文件中的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmFileRequest 请求对象
     * @return AsyncInvoker<ShowAlgorithmFileRequest, ShowAlgorithmFileResponse>
     */
    public AsyncInvoker<ShowAlgorithmFileRequest, ShowAlgorithmFileResponse> showAlgorithmFileAsyncInvoker(
        ShowAlgorithmFileRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.showAlgorithmFile, hcClient);
    }

    /**
     * 获取某一演化任务详情
     *
     * 获取某一演化任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowTaskDetailsResponse>
     */
    public CompletableFuture<ShowTaskDetailsResponse> showTaskDetailsAsync(ShowTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.showTaskDetails);
    }

    /**
     * 获取某一演化任务详情
     *
     * 获取某一演化任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTaskDetailsRequest, ShowTaskDetailsResponse>
     */
    public AsyncInvoker<ShowTaskDetailsRequest, ShowTaskDetailsResponse> showTaskDetailsAsyncInvoker(
        ShowTaskDetailsRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.showTaskDetails, hcClient);
    }

    /**
     * 获取某一演化任务某次结果的commit文件
     *
     * 获取某一演化任务某次结果的commit文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultCommitRequest 请求对象
     * @return CompletableFuture<ShowTaskResultCommitResponse>
     */
    public CompletableFuture<ShowTaskResultCommitResponse> showTaskResultCommitAsync(
        ShowTaskResultCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.showTaskResultCommit);
    }

    /**
     * 获取某一演化任务某次结果的commit文件
     *
     * 获取某一演化任务某次结果的commit文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultCommitRequest 请求对象
     * @return AsyncInvoker<ShowTaskResultCommitRequest, ShowTaskResultCommitResponse>
     */
    public AsyncInvoker<ShowTaskResultCommitRequest, ShowTaskResultCommitResponse> showTaskResultCommitAsyncInvoker(
        ShowTaskResultCommitRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.showTaskResultCommit, hcClient);
    }

    /**
     * 获取某一演化任务运行详结果列表
     *
     * 获取某一演化任务运行详结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultListRequest 请求对象
     * @return CompletableFuture<ShowTaskResultListResponse>
     */
    public CompletableFuture<ShowTaskResultListResponse> showTaskResultListAsync(ShowTaskResultListRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.showTaskResultList);
    }

    /**
     * 获取某一演化任务运行详结果列表
     *
     * 获取某一演化任务运行详结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskResultListRequest 请求对象
     * @return AsyncInvoker<ShowTaskResultListRequest, ShowTaskResultListResponse>
     */
    public AsyncInvoker<ShowTaskResultListRequest, ShowTaskResultListResponse> showTaskResultListAsyncInvoker(
        ShowTaskResultListRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.showTaskResultList, hcClient);
    }

    /**
     * 获取某一演化任务运行详情
     *
     * 获取某一演化任务运行详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningDetailsRequest 请求对象
     * @return CompletableFuture<ShowTaskRunningDetailsResponse>
     */
    public CompletableFuture<ShowTaskRunningDetailsResponse> showTaskRunningDetailsAsync(
        ShowTaskRunningDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.showTaskRunningDetails);
    }

    /**
     * 获取某一演化任务运行详情
     *
     * 获取某一演化任务运行详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTaskRunningDetailsRequest, ShowTaskRunningDetailsResponse>
     */
    public AsyncInvoker<ShowTaskRunningDetailsRequest, ShowTaskRunningDetailsResponse> showTaskRunningDetailsAsyncInvoker(
        ShowTaskRunningDetailsRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.showTaskRunningDetails, hcClient);
    }

    /**
     * 获取某一演化任务运行日志
     *
     * 获取某一演化任务运行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningLogRequest 请求对象
     * @return CompletableFuture<ShowTaskRunningLogResponse>
     */
    public CompletableFuture<ShowTaskRunningLogResponse> showTaskRunningLogAsync(ShowTaskRunningLogRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.showTaskRunningLog);
    }

    /**
     * 获取某一演化任务运行日志
     *
     * 获取某一演化任务运行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRunningLogRequest 请求对象
     * @return AsyncInvoker<ShowTaskRunningLogRequest, ShowTaskRunningLogResponse>
     */
    public AsyncInvoker<ShowTaskRunningLogRequest, ShowTaskRunningLogResponse> showTaskRunningLogAsyncInvoker(
        ShowTaskRunningLogRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.showTaskRunningLog, hcClient);
    }

    /**
     * 启动演化任务
     *
     * 启动演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartEvolveTaskRequest 请求对象
     * @return CompletableFuture<StartEvolveTaskResponse>
     */
    public CompletableFuture<StartEvolveTaskResponse> startEvolveTaskAsync(StartEvolveTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.startEvolveTask);
    }

    /**
     * 启动演化任务
     *
     * 启动演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartEvolveTaskRequest 请求对象
     * @return AsyncInvoker<StartEvolveTaskRequest, StartEvolveTaskResponse>
     */
    public AsyncInvoker<StartEvolveTaskRequest, StartEvolveTaskResponse> startEvolveTaskAsyncInvoker(
        StartEvolveTaskRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.startEvolveTask, hcClient);
    }

    /**
     * 停止演化任务
     *
     * 停止演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopEvolveTaskRequest 请求对象
     * @return CompletableFuture<StopEvolveTaskResponse>
     */
    public CompletableFuture<StopEvolveTaskResponse> stopEvolveTaskAsync(StopEvolveTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.stopEvolveTask);
    }

    /**
     * 停止演化任务
     *
     * 停止演化任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopEvolveTaskRequest 请求对象
     * @return AsyncInvoker<StopEvolveTaskRequest, StopEvolveTaskResponse>
     */
    public AsyncInvoker<StopEvolveTaskRequest, StopEvolveTaskResponse> stopEvolveTaskAsyncInvoker(
        StopEvolveTaskRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.stopEvolveTask, hcClient);
    }

    /**
     * 更新算法设计项目信息
     *
     * 更新算法设计项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlgorithmRequest 请求对象
     * @return CompletableFuture<UpdateAlgorithmResponse>
     */
    public CompletableFuture<UpdateAlgorithmResponse> updateAlgorithmAsync(UpdateAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.updateAlgorithm);
    }

    /**
     * 更新算法设计项目信息
     *
     * 更新算法设计项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlgorithmRequest 请求对象
     * @return AsyncInvoker<UpdateAlgorithmRequest, UpdateAlgorithmResponse>
     */
    public AsyncInvoker<UpdateAlgorithmRequest, UpdateAlgorithmResponse> updateAlgorithmAsyncInvoker(
        UpdateAlgorithmRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.updateAlgorithm, hcClient);
    }

    /**
     * 更新算法演化任务信息
     *
     * 更新算法演化任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEvolveTaskRequest 请求对象
     * @return CompletableFuture<UpdateEvolveTaskResponse>
     */
    public CompletableFuture<UpdateEvolveTaskResponse> updateEvolveTaskAsync(UpdateEvolveTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.updateEvolveTask);
    }

    /**
     * 更新算法演化任务信息
     *
     * 更新算法演化任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEvolveTaskRequest 请求对象
     * @return AsyncInvoker<UpdateEvolveTaskRequest, UpdateEvolveTaskResponse>
     */
    public AsyncInvoker<UpdateEvolveTaskRequest, UpdateEvolveTaskResponse> updateEvolveTaskAsyncInvoker(
        UpdateEvolveTaskRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.updateEvolveTask, hcClient);
    }

    /**
     * 授权
     *
     * 授予LLM4AD操作用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizePermissionRequest 请求对象
     * @return CompletableFuture<AuthorizePermissionResponse>
     */
    public CompletableFuture<AuthorizePermissionResponse> authorizePermissionAsync(AuthorizePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.authorizePermission);
    }

    /**
     * 授权
     *
     * 授予LLM4AD操作用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizePermissionRequest 请求对象
     * @return AsyncInvoker<AuthorizePermissionRequest, AuthorizePermissionResponse>
     */
    public AsyncInvoker<AuthorizePermissionRequest, AuthorizePermissionResponse> authorizePermissionAsyncInvoker(
        AuthorizePermissionRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.authorizePermission, hcClient);
    }

    /**
     * 获取Bucket清单
     *
     * 获取Bucket清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return CompletableFuture<ListBucketsResponse>
     */
    public CompletableFuture<ListBucketsResponse> listBucketsAsync(ListBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listBuckets);
    }

    /**
     * 获取Bucket清单
     *
     * 获取Bucket清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return AsyncInvoker<ListBucketsRequest, ListBucketsResponse>
     */
    public AsyncInvoker<ListBucketsRequest, ListBucketsResponse> listBucketsAsyncInvoker(ListBucketsRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listBuckets, hcClient);
    }

    /**
     * 获取Object清单
     *
     * 获取Object清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObjectRequest 请求对象
     * @return CompletableFuture<ListObjectResponse>
     */
    public CompletableFuture<ListObjectResponse> listObjectAsync(ListObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listObject);
    }

    /**
     * 获取Object清单
     *
     * 获取Object清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObjectRequest 请求对象
     * @return AsyncInvoker<ListObjectRequest, ListObjectResponse>
     */
    public AsyncInvoker<ListObjectRequest, ListObjectResponse> listObjectAsyncInvoker(ListObjectRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listObject, hcClient);
    }

    /**
     * 检查桶的权限
     *
     * 检查桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionRequest 请求对象
     * @return CompletableFuture<ListPermissionResponse>
     */
    public CompletableFuture<ListPermissionResponse> listPermissionAsync(ListPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.listPermission);
    }

    /**
     * 检查桶的权限
     *
     * 检查桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionRequest 请求对象
     * @return AsyncInvoker<ListPermissionRequest, ListPermissionResponse>
     */
    public AsyncInvoker<ListPermissionRequest, ListPermissionResponse> listPermissionAsyncInvoker(
        ListPermissionRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.listPermission, hcClient);
    }

    /**
     * 取消授权
     *
     * 取消LLM4AD对用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokePermissionRequest 请求对象
     * @return CompletableFuture<RevokePermissionResponse>
     */
    public CompletableFuture<RevokePermissionResponse> revokePermissionAsync(RevokePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, OptVerseMeta.revokePermission);
    }

    /**
     * 取消授权
     *
     * 取消LLM4AD对用户桶的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokePermissionRequest 请求对象
     * @return AsyncInvoker<RevokePermissionRequest, RevokePermissionResponse>
     */
    public AsyncInvoker<RevokePermissionRequest, RevokePermissionResponse> revokePermissionAsyncInvoker(
        RevokePermissionRequest request) {
        return new AsyncInvoker<>(request, OptVerseMeta.revokePermission, hcClient);
    }

}
