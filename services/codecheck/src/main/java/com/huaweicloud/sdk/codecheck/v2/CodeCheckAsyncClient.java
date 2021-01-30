package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.codecheck.v2.model.*;

public class CodeCheckAsyncClient {
    protected HcClient hcClient;

    public CodeCheckAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeCheckAsyncClient> newBuilder() {
        return new ClientBuilder<>(CodeCheckAsyncClient::new);
    }


    /**
     * 新建检查任务
     * 新建检查任务但是不执行。
     *
     * @param CreateTaskV2Request 请求对象
     * @return CompletableFuture<CreateTaskV2Response>
     */
    public CompletableFuture<CreateTaskV2Response> createTaskV2Async(CreateTaskV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.createTaskV2);
    }

    /**
     * 新建检查任务
     * 新建检查任务但是不执行。
     *
     * @param CreateTaskV2Request 请求对象
     * @return AsyncInvoker<CreateTaskV2Request, CreateTaskV2Response>
     */
    public AsyncInvoker<CreateTaskV2Request, CreateTaskV2Response> createTaskV2AsyncInvoker(CreateTaskV2Request request) {
        return new AsyncInvoker<CreateTaskV2Request, CreateTaskV2Response>(request, CodeCheckMeta.createTaskV2, hcClient);
    }

    /**
     * 执行检查任务
     * 执行检查任务。
     *
     * @param RunTaskV2Request 请求对象
     * @return CompletableFuture<RunTaskV2Response>
     */
    public CompletableFuture<RunTaskV2Response> runTaskV2Async(RunTaskV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.runTaskV2);
    }

    /**
     * 执行检查任务
     * 执行检查任务。
     *
     * @param RunTaskV2Request 请求对象
     * @return AsyncInvoker<RunTaskV2Request, RunTaskV2Response>
     */
    public AsyncInvoker<RunTaskV2Request, RunTaskV2Response> runTaskV2AsyncInvoker(RunTaskV2Request request) {
        return new AsyncInvoker<RunTaskV2Request, RunTaskV2Response>(request, CodeCheckMeta.runTaskV2, hcClient);
    }

    /**
     * 查询任务执行状态
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailV2Request 请求对象
     * @return CompletableFuture<ShowProgressDetailV2Response>
     */
    public CompletableFuture<ShowProgressDetailV2Response> showProgressDetailV2Async(ShowProgressDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showProgressDetailV2);
    }

    /**
     * 查询任务执行状态
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailV2Request 请求对象
     * @return AsyncInvoker<ShowProgressDetailV2Request, ShowProgressDetailV2Response>
     */
    public AsyncInvoker<ShowProgressDetailV2Request, ShowProgressDetailV2Response> showProgressDetailV2AsyncInvoker(ShowProgressDetailV2Request request) {
        return new AsyncInvoker<ShowProgressDetailV2Request, ShowProgressDetailV2Response>(request, CodeCheckMeta.showProgressDetailV2, hcClient);
    }

    /**
     * 查询缺陷概要
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailV2Request 请求对象
     * @return CompletableFuture<ShowTaskDetailV2Response>
     */
    public CompletableFuture<ShowTaskDetailV2Response> showTaskDetailV2Async(ShowTaskDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDetailV2);
    }

    /**
     * 查询缺陷概要
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailV2Request 请求对象
     * @return AsyncInvoker<ShowTaskDetailV2Request, ShowTaskDetailV2Response>
     */
    public AsyncInvoker<ShowTaskDetailV2Request, ShowTaskDetailV2Response> showTaskDetailV2AsyncInvoker(ShowTaskDetailV2Request request) {
        return new AsyncInvoker<ShowTaskDetailV2Request, ShowTaskDetailV2Response>(request, CodeCheckMeta.showTaskDetailV2, hcClient);
    }

    /**
     * 查询任务列表
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdV2Request 请求对象
     * @return CompletableFuture<ShowTaskListByProjectIdV2Response>
     */
    public CompletableFuture<ShowTaskListByProjectIdV2Response> showTaskListByProjectIdV2Async(ShowTaskListByProjectIdV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskListByProjectIdV2);
    }

    /**
     * 查询任务列表
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdV2Request 请求对象
     * @return AsyncInvoker<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response>
     */
    public AsyncInvoker<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response> showTaskListByProjectIdV2AsyncInvoker(ShowTaskListByProjectIdV2Request request) {
        return new AsyncInvoker<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response>(request, CodeCheckMeta.showTaskListByProjectIdV2, hcClient);
    }

    /**
     * 终止检查任务
     * 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdV2Request 请求对象
     * @return CompletableFuture<StopTaskByIdV2Response>
     */
    public CompletableFuture<StopTaskByIdV2Response> stopTaskByIdV2Async(StopTaskByIdV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.stopTaskByIdV2);
    }

    /**
     * 终止检查任务
     * 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdV2Request 请求对象
     * @return AsyncInvoker<StopTaskByIdV2Request, StopTaskByIdV2Response>
     */
    public AsyncInvoker<StopTaskByIdV2Request, StopTaskByIdV2Response> stopTaskByIdV2AsyncInvoker(StopTaskByIdV2Request request) {
        return new AsyncInvoker<StopTaskByIdV2Request, StopTaskByIdV2Response>(request, CodeCheckMeta.stopTaskByIdV2, hcClient);
    }

}