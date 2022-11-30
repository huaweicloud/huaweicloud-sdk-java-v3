package com.huaweicloud.sdk.aom.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.aom.v1.model.*;

public class AomClient {
    protected HcClient hcClient;

    public AomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomClient> newBuilder() {
        return new ClientBuilder<>(AomClient::new);
    }


    /**
     * 快速创建并执行脚本
     *
     * 该接口用于创建快速执行脚本的任务，可以指定脚本类型，执行用户，脚本参数，执行机器，脚本内容，在用户指定的机器上执行脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFastExecuteScriptRequest 请求对象
     * @return CreateFastExecuteScriptResponse
     */
    public CreateFastExecuteScriptResponse createFastExecuteScript(CreateFastExecuteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createFastExecuteScript);
    }

    /**
     * 快速创建并执行脚本
     *
     * 该接口用于创建快速执行脚本的任务，可以指定脚本类型，执行用户，脚本参数，执行机器，脚本内容，在用户指定的机器上执行脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFastExecuteScriptRequest 请求对象
     * @return SyncInvoker<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse>
     */
    public SyncInvoker<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> createFastExecuteScriptInvoker(CreateFastExecuteScriptRequest request) {
        return new SyncInvoker<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse>(request, AomMeta.createFastExecuteScript, hcClient);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建工作流（任务），返回工作流详情。任务类型取决于模板名称和&#39;input&#39;参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createWorkflow);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建工作流（任务），返回工作流详情。任务类型取决于模板名称和&#39;input&#39;参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(CreateWorkflowRequest request) {
        return new SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request, AomMeta.createWorkflow, hcClient);
    }

    /**
     * 执行工作流
     *
     * 该接口可下发执行指定的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteWorkflowRequest 请求对象
     * @return ExecuteWorkflowResponse
     */
    public ExecuteWorkflowResponse executeWorkflow(ExecuteWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.executeWorkflow);
    }

    /**
     * 执行工作流
     *
     * 该接口可下发执行指定的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteWorkflowRequest 请求对象
     * @return SyncInvoker<ExecuteWorkflowRequest, ExecuteWorkflowResponse>
     */
    public SyncInvoker<ExecuteWorkflowRequest, ExecuteWorkflowResponse> executeWorkflowInvoker(ExecuteWorkflowRequest request) {
        return new SyncInvoker<ExecuteWorkflowRequest, ExecuteWorkflowResponse>(request, AomMeta.executeWorkflow, hcClient);
    }

    /**
     * 作业管理主页模糊查询
     *
     * 该接口可查询已创建的作业，可指定作业名称和作业创建人去精确查询，返回作业列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllJobByNameRequest 请求对象
     * @return ListAllJobByNameResponse
     */
    public ListAllJobByNameResponse listAllJobByName(ListAllJobByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAllJobByName);
    }

    /**
     * 作业管理主页模糊查询
     *
     * 该接口可查询已创建的作业，可指定作业名称和作业创建人去精确查询，返回作业列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllJobByNameRequest 请求对象
     * @return SyncInvoker<ListAllJobByNameRequest, ListAllJobByNameResponse>
     */
    public SyncInvoker<ListAllJobByNameRequest, ListAllJobByNameResponse> listAllJobByNameInvoker(ListAllJobByNameRequest request) {
        return new SyncInvoker<ListAllJobByNameRequest, ListAllJobByNameResponse>(request, AomMeta.listAllJobByName, hcClient);
    }

    /**
     * 脚本主页查询
     *
     * 该接口是脚本主页查询，可指定脚本名称和脚本创建人进行精确查询，返回包含脚本基本信息的列表数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllScriptByNameRequest 请求对象
     * @return ListAllScriptByNameResponse
     */
    public ListAllScriptByNameResponse listAllScriptByName(ListAllScriptByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAllScriptByName);
    }

    /**
     * 脚本主页查询
     *
     * 该接口是脚本主页查询，可指定脚本名称和脚本创建人进行精确查询，返回包含脚本基本信息的列表数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllScriptByNameRequest 请求对象
     * @return SyncInvoker<ListAllScriptByNameRequest, ListAllScriptByNameResponse>
     */
    public SyncInvoker<ListAllScriptByNameRequest, ListAllScriptByNameResponse> listAllScriptByNameInvoker(ListAllScriptByNameRequest request) {
        return new SyncInvoker<ListAllScriptByNameRequest, ListAllScriptByNameResponse>(request, AomMeta.listAllScriptByName, hcClient);
    }

    /**
     * 脚本管理主页查询，版本管理查询
     *
     * 该接口可查询指定脚本ID下的所有版本，返回该名称的脚本版本列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllVersionByVersionIdRequest 请求对象
     * @return ListAllVersionByVersionIdResponse
     */
    public ListAllVersionByVersionIdResponse listAllVersionByVersionId(ListAllVersionByVersionIdRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAllVersionByVersionId);
    }

    /**
     * 脚本管理主页查询，版本管理查询
     *
     * 该接口可查询指定脚本ID下的所有版本，返回该名称的脚本版本列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllVersionByVersionIdRequest 请求对象
     * @return SyncInvoker<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse>
     */
    public SyncInvoker<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> listAllVersionByVersionIdInvoker(ListAllVersionByVersionIdRequest request) {
        return new SyncInvoker<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse>(request, AomMeta.listAllVersionByVersionId, hcClient);
    }

    /**
     * 根据作业id查询方案(自定义模板)列表
     *
     * 该接口可根据作业ID查询执行方案，分页返回执行方案列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateByJobIdRequest 请求对象
     * @return ListTemplateByJobIdResponse
     */
    public ListTemplateByJobIdResponse listTemplateByJobId(ListTemplateByJobIdRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listTemplateByJobId);
    }

    /**
     * 根据作业id查询方案(自定义模板)列表
     *
     * 该接口可根据作业ID查询执行方案，分页返回执行方案列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateByJobIdRequest 请求对象
     * @return SyncInvoker<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse>
     */
    public SyncInvoker<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse> listTemplateByJobIdInvoker(ListTemplateByJobIdRequest request) {
        return new SyncInvoker<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse>(request, AomMeta.listTemplateByJobId, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 该接口可返回已经创建的任务列表，可按任务名称，任务状态，任务类型，执行人，更新时间为查询条件分页查询任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return ListWorkflowResponse
     */
    public ListWorkflowResponse listWorkflow(ListWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listWorkflow);
    }

    /**
     * 查询任务列表
     *
     * 该接口可返回已经创建的任务列表，可按任务名称，任务状态，任务类型，执行人，更新时间为查询条件分页查询任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public SyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowInvoker(ListWorkflowRequest request) {
        return new SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>(request, AomMeta.listWorkflow, hcClient);
    }

    /**
     * 获取任务执行历史
     *
     * 该接口可获取执行任务的执行历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowExecutionsRequest 请求对象
     * @return ListWorkflowExecutionsResponse
     */
    public ListWorkflowExecutionsResponse listWorkflowExecutions(ListWorkflowExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listWorkflowExecutions);
    }

    /**
     * 获取任务执行历史
     *
     * 该接口可获取执行任务的执行历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowExecutionsRequest 请求对象
     * @return SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>
     */
    public SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutionsInvoker(ListWorkflowExecutionsRequest request) {
        return new SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>(request, AomMeta.listWorkflowExecutions, hcClient);
    }

    /**
     * 获取方案信息
     *
     * 该接口可根据执行方案id查询执行方案详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchTemplateByIdRequest 请求对象
     * @return SearchTemplateByIdResponse
     */
    public SearchTemplateByIdResponse searchTemplateById(SearchTemplateByIdRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.searchTemplateById);
    }

    /**
     * 获取方案信息
     *
     * 该接口可根据执行方案id查询执行方案详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchTemplateByIdRequest 请求对象
     * @return SyncInvoker<SearchTemplateByIdRequest, SearchTemplateByIdResponse>
     */
    public SyncInvoker<SearchTemplateByIdRequest, SearchTemplateByIdResponse> searchTemplateByIdInvoker(SearchTemplateByIdRequest request) {
        return new SyncInvoker<SearchTemplateByIdRequest, SearchTemplateByIdResponse>(request, AomMeta.searchTemplateById, hcClient);
    }

    /**
     * 获取工作流执行中的执行详情
     *
     * 该接口可获取任务的执行详情，可指定工作流ID和执行ID去查询对应的任务，返回任务执行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchWorkflowExecutionDetailRequest 请求对象
     * @return SearchWorkflowExecutionDetailResponse
     */
    public SearchWorkflowExecutionDetailResponse searchWorkflowExecutionDetail(SearchWorkflowExecutionDetailRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.searchWorkflowExecutionDetail);
    }

    /**
     * 获取工作流执行中的执行详情
     *
     * 该接口可获取任务的执行详情，可指定工作流ID和执行ID去查询对应的任务，返回任务执行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchWorkflowExecutionDetailRequest 请求对象
     * @return SyncInvoker<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse>
     */
    public SyncInvoker<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> searchWorkflowExecutionDetailInvoker(SearchWorkflowExecutionDetailRequest request) {
        return new SyncInvoker<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse>(request, AomMeta.searchWorkflowExecutionDetail, hcClient);
    }

    /**
     * 对暂停中的任务进行操作
     *
     * 该接口可对任务进行失败重试、失败跳过、暂停继续操作，返回操作结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPausingWorkflowExecutionsRequest 请求对象
     * @return StartPausingWorkflowExecutionsResponse
     */
    public StartPausingWorkflowExecutionsResponse startPausingWorkflowExecutions(StartPausingWorkflowExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.startPausingWorkflowExecutions);
    }

    /**
     * 对暂停中的任务进行操作
     *
     * 该接口可对任务进行失败重试、失败跳过、暂停继续操作，返回操作结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPausingWorkflowExecutionsRequest 请求对象
     * @return SyncInvoker<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse>
     */
    public SyncInvoker<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> startPausingWorkflowExecutionsInvoker(StartPausingWorkflowExecutionsRequest request) {
        return new SyncInvoker<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse>(request, AomMeta.startPausingWorkflowExecutions, hcClient);
    }

    /**
     * 终止任务执行
     *
     * 该接口可终止正在执行的任务，指定工作流ID和执行ID去终止对应的任务，返回终止操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopExecutionRequest 请求对象
     * @return StopExecutionResponse
     */
    public StopExecutionResponse stopExecution(StopExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.stopExecution);
    }

    /**
     * 终止任务执行
     *
     * 该接口可终止正在执行的任务，指定工作流ID和执行ID去终止对应的任务，返回终止操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopExecutionRequest 请求对象
     * @return SyncInvoker<StopExecutionRequest, StopExecutionResponse>
     */
    public SyncInvoker<StopExecutionRequest, StopExecutionResponse> stopExecutionInvoker(StopExecutionRequest request) {
        return new SyncInvoker<StopExecutionRequest, StopExecutionResponse>(request, AomMeta.stopExecution, hcClient);
    }

    /**
     * 更新任务
     *
     * 更新定时任务的启停状态，可启动定时任务或停止定时任务，返回操作任务结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkflowTriggerStatusRequest 请求对象
     * @return UpdateWorkflowTriggerStatusResponse
     */
    public UpdateWorkflowTriggerStatusResponse updateWorkflowTriggerStatus(UpdateWorkflowTriggerStatusRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateWorkflowTriggerStatus);
    }

    /**
     * 更新任务
     *
     * 更新定时任务的启停状态，可启动定时任务或停止定时任务，返回操作任务结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkflowTriggerStatusRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse>
     */
    public SyncInvoker<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> updateWorkflowTriggerStatusInvoker(UpdateWorkflowTriggerStatusRequest request) {
        return new SyncInvoker<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse>(request, AomMeta.updateWorkflowTriggerStatus, hcClient);
    }

}