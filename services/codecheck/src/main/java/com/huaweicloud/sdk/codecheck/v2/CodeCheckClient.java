package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.codecheck.v2.model.*;

public class CodeCheckClient {
    protected HcClient hcClient;

    public CodeCheckClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeCheckClient> newBuilder() {
        return new ClientBuilder<>(CodeCheckClient::new);
    }


    /**
     * 新建检查任务
     * 新建检查任务但是不执行。
     *
     * @param CreateTaskV2Request 请求对象
     * @return CreateTaskV2Response
     */
    public CreateTaskV2Response createTaskV2(CreateTaskV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.createTaskV2);
    }

    /**
     * 新建检查任务
     * 新建检查任务但是不执行。
     *
     * @param CreateTaskV2Request 请求对象
     * @return SyncInvoker<CreateTaskV2Request, CreateTaskV2Response>
     */
    public SyncInvoker<CreateTaskV2Request, CreateTaskV2Response> createTaskV2Invoker(CreateTaskV2Request request) {
        return new SyncInvoker<CreateTaskV2Request, CreateTaskV2Response>(request, CodeCheckMeta.createTaskV2, hcClient);
    }

    /**
     * 执行检查任务
     * 执行检查任务。
     *
     * @param RunTaskV2Request 请求对象
     * @return RunTaskV2Response
     */
    public RunTaskV2Response runTaskV2(RunTaskV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.runTaskV2);
    }

    /**
     * 执行检查任务
     * 执行检查任务。
     *
     * @param RunTaskV2Request 请求对象
     * @return SyncInvoker<RunTaskV2Request, RunTaskV2Response>
     */
    public SyncInvoker<RunTaskV2Request, RunTaskV2Response> runTaskV2Invoker(RunTaskV2Request request) {
        return new SyncInvoker<RunTaskV2Request, RunTaskV2Response>(request, CodeCheckMeta.runTaskV2, hcClient);
    }

    /**
     * 查询任务执行状态
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailV2Request 请求对象
     * @return ShowProgressDetailV2Response
     */
    public ShowProgressDetailV2Response showProgressDetailV2(ShowProgressDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showProgressDetailV2);
    }

    /**
     * 查询任务执行状态
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailV2Request 请求对象
     * @return SyncInvoker<ShowProgressDetailV2Request, ShowProgressDetailV2Response>
     */
    public SyncInvoker<ShowProgressDetailV2Request, ShowProgressDetailV2Response> showProgressDetailV2Invoker(ShowProgressDetailV2Request request) {
        return new SyncInvoker<ShowProgressDetailV2Request, ShowProgressDetailV2Response>(request, CodeCheckMeta.showProgressDetailV2, hcClient);
    }

    /**
     * 查询缺陷概要
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailV2Request 请求对象
     * @return ShowTaskDetailV2Response
     */
    public ShowTaskDetailV2Response showTaskDetailV2(ShowTaskDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showTaskDetailV2);
    }

    /**
     * 查询缺陷概要
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailV2Request 请求对象
     * @return SyncInvoker<ShowTaskDetailV2Request, ShowTaskDetailV2Response>
     */
    public SyncInvoker<ShowTaskDetailV2Request, ShowTaskDetailV2Response> showTaskDetailV2Invoker(ShowTaskDetailV2Request request) {
        return new SyncInvoker<ShowTaskDetailV2Request, ShowTaskDetailV2Response>(request, CodeCheckMeta.showTaskDetailV2, hcClient);
    }

    /**
     * 查询任务列表
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdV2Request 请求对象
     * @return ShowTaskListByProjectIdV2Response
     */
    public ShowTaskListByProjectIdV2Response showTaskListByProjectIdV2(ShowTaskListByProjectIdV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showTaskListByProjectIdV2);
    }

    /**
     * 查询任务列表
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdV2Request 请求对象
     * @return SyncInvoker<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response>
     */
    public SyncInvoker<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response> showTaskListByProjectIdV2Invoker(ShowTaskListByProjectIdV2Request request) {
        return new SyncInvoker<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response>(request, CodeCheckMeta.showTaskListByProjectIdV2, hcClient);
    }

    /**
     * 终止检查任务
     * 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdV2Request 请求对象
     * @return StopTaskByIdV2Response
     */
    public StopTaskByIdV2Response stopTaskByIdV2(StopTaskByIdV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.stopTaskByIdV2);
    }

    /**
     * 终止检查任务
     * 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdV2Request 请求对象
     * @return SyncInvoker<StopTaskByIdV2Request, StopTaskByIdV2Response>
     */
    public SyncInvoker<StopTaskByIdV2Request, StopTaskByIdV2Response> stopTaskByIdV2Invoker(StopTaskByIdV2Request request) {
        return new SyncInvoker<StopTaskByIdV2Request, StopTaskByIdV2Response>(request, CodeCheckMeta.stopTaskByIdV2, hcClient);
    }

}