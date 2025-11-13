package com.huaweicloud.sdk.eihealth.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eihealth.v2.model.CreateAssistantModelRequest;
import com.huaweicloud.sdk.eihealth.v2.model.CreateAssistantModelResponse;
import com.huaweicloud.sdk.eihealth.v2.model.CreateMessageFeedbackRequest;
import com.huaweicloud.sdk.eihealth.v2.model.CreateMessageFeedbackResponse;
import com.huaweicloud.sdk.eihealth.v2.model.CreateModelVendorRequest;
import com.huaweicloud.sdk.eihealth.v2.model.CreateModelVendorResponse;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteAssistantModelRequest;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteAssistantModelResponse;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteModelVendorRequest;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteModelVendorResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ListAllAssistantModelsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ListAllAssistantModelsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ListAssistantModelsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ListAssistantModelsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ListModelVendorsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ListModelVendorsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ShowDrugJobStatisticsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ShowDrugJobStatisticsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateAssistantModelRequest;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateAssistantModelResponse;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateModelVendorRequest;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateModelVendorResponse;

public class EiHealthClient {

    protected HcClient hcClient;

    public EiHealthClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthClient> newBuilder() {
        ClientBuilder<EiHealthClient> clientBuilder = new ClientBuilder<>(EiHealthClient::new);
        return clientBuilder;
    }

    /**
     * 统计药物作业数量和调用次数
     *
     * 统计药物作业数量和调用次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugJobStatisticsRequest 请求对象
     * @return ShowDrugJobStatisticsResponse
     */
    public ShowDrugJobStatisticsResponse showDrugJobStatistics(ShowDrugJobStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDrugJobStatistics);
    }

    /**
     * 统计药物作业数量和调用次数
     *
     * 统计药物作业数量和调用次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugJobStatisticsRequest 请求对象
     * @return SyncInvoker<ShowDrugJobStatisticsRequest, ShowDrugJobStatisticsResponse>
     */
    public SyncInvoker<ShowDrugJobStatisticsRequest, ShowDrugJobStatisticsResponse> showDrugJobStatisticsInvoker(
        ShowDrugJobStatisticsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showDrugJobStatistics, hcClient);
    }

    /**
     * 创建问答内容反馈
     *
     * 创建问答内容反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageFeedbackRequest 请求对象
     * @return CreateMessageFeedbackResponse
     */
    public CreateMessageFeedbackResponse createMessageFeedback(CreateMessageFeedbackRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createMessageFeedback);
    }

    /**
     * 创建问答内容反馈
     *
     * 创建问答内容反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageFeedbackRequest 请求对象
     * @return SyncInvoker<CreateMessageFeedbackRequest, CreateMessageFeedbackResponse>
     */
    public SyncInvoker<CreateMessageFeedbackRequest, CreateMessageFeedbackResponse> createMessageFeedbackInvoker(
        CreateMessageFeedbackRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createMessageFeedback, hcClient);
    }

    /**
     * 创建助手模型
     *
     * 创建助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssistantModelRequest 请求对象
     * @return CreateAssistantModelResponse
     */
    public CreateAssistantModelResponse createAssistantModel(CreateAssistantModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createAssistantModel);
    }

    /**
     * 创建助手模型
     *
     * 创建助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssistantModelRequest 请求对象
     * @return SyncInvoker<CreateAssistantModelRequest, CreateAssistantModelResponse>
     */
    public SyncInvoker<CreateAssistantModelRequest, CreateAssistantModelResponse> createAssistantModelInvoker(
        CreateAssistantModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createAssistantModel, hcClient);
    }

    /**
     * 删除助手模型
     *
     * 删除助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssistantModelRequest 请求对象
     * @return DeleteAssistantModelResponse
     */
    public DeleteAssistantModelResponse deleteAssistantModel(DeleteAssistantModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteAssistantModel);
    }

    /**
     * 删除助手模型
     *
     * 删除助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssistantModelRequest 请求对象
     * @return SyncInvoker<DeleteAssistantModelRequest, DeleteAssistantModelResponse>
     */
    public SyncInvoker<DeleteAssistantModelRequest, DeleteAssistantModelResponse> deleteAssistantModelInvoker(
        DeleteAssistantModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteAssistantModel, hcClient);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAssistantModelsRequest 请求对象
     * @return ListAllAssistantModelsResponse
     */
    public ListAllAssistantModelsResponse listAllAssistantModels(ListAllAssistantModelsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listAllAssistantModels);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAssistantModelsRequest 请求对象
     * @return SyncInvoker<ListAllAssistantModelsRequest, ListAllAssistantModelsResponse>
     */
    public SyncInvoker<ListAllAssistantModelsRequest, ListAllAssistantModelsResponse> listAllAssistantModelsInvoker(
        ListAllAssistantModelsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listAllAssistantModels, hcClient);
    }

    /**
     * 获取供应商模型列表
     *
     * 获取供应商模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssistantModelsRequest 请求对象
     * @return ListAssistantModelsResponse
     */
    public ListAssistantModelsResponse listAssistantModels(ListAssistantModelsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listAssistantModels);
    }

    /**
     * 获取供应商模型列表
     *
     * 获取供应商模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssistantModelsRequest 请求对象
     * @return SyncInvoker<ListAssistantModelsRequest, ListAssistantModelsResponse>
     */
    public SyncInvoker<ListAssistantModelsRequest, ListAssistantModelsResponse> listAssistantModelsInvoker(
        ListAssistantModelsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listAssistantModels, hcClient);
    }

    /**
     * 更新助手模型
     *
     * 更新助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistantModelRequest 请求对象
     * @return UpdateAssistantModelResponse
     */
    public UpdateAssistantModelResponse updateAssistantModel(UpdateAssistantModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateAssistantModel);
    }

    /**
     * 更新助手模型
     *
     * 更新助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistantModelRequest 请求对象
     * @return SyncInvoker<UpdateAssistantModelRequest, UpdateAssistantModelResponse>
     */
    public SyncInvoker<UpdateAssistantModelRequest, UpdateAssistantModelResponse> updateAssistantModelInvoker(
        UpdateAssistantModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateAssistantModel, hcClient);
    }

    /**
     * 创建模型供应商
     *
     * 创建模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelVendorRequest 请求对象
     * @return CreateModelVendorResponse
     */
    public CreateModelVendorResponse createModelVendor(CreateModelVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createModelVendor);
    }

    /**
     * 创建模型供应商
     *
     * 创建模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelVendorRequest 请求对象
     * @return SyncInvoker<CreateModelVendorRequest, CreateModelVendorResponse>
     */
    public SyncInvoker<CreateModelVendorRequest, CreateModelVendorResponse> createModelVendorInvoker(
        CreateModelVendorRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createModelVendor, hcClient);
    }

    /**
     * 删除模型供应商
     *
     * 删除模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVendorRequest 请求对象
     * @return DeleteModelVendorResponse
     */
    public DeleteModelVendorResponse deleteModelVendor(DeleteModelVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteModelVendor);
    }

    /**
     * 删除模型供应商
     *
     * 删除模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVendorRequest 请求对象
     * @return SyncInvoker<DeleteModelVendorRequest, DeleteModelVendorResponse>
     */
    public SyncInvoker<DeleteModelVendorRequest, DeleteModelVendorResponse> deleteModelVendorInvoker(
        DeleteModelVendorRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteModelVendor, hcClient);
    }

    /**
     * 获取模型供应商列表
     *
     * 获取模型供应商列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVendorsRequest 请求对象
     * @return ListModelVendorsResponse
     */
    public ListModelVendorsResponse listModelVendors(ListModelVendorsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listModelVendors);
    }

    /**
     * 获取模型供应商列表
     *
     * 获取模型供应商列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVendorsRequest 请求对象
     * @return SyncInvoker<ListModelVendorsRequest, ListModelVendorsResponse>
     */
    public SyncInvoker<ListModelVendorsRequest, ListModelVendorsResponse> listModelVendorsInvoker(
        ListModelVendorsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listModelVendors, hcClient);
    }

    /**
     * 更新模型供应商
     *
     * 更新模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelVendorRequest 请求对象
     * @return UpdateModelVendorResponse
     */
    public UpdateModelVendorResponse updateModelVendor(UpdateModelVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateModelVendor);
    }

    /**
     * 更新模型供应商
     *
     * 更新模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelVendorRequest 请求对象
     * @return SyncInvoker<UpdateModelVendorRequest, UpdateModelVendorResponse>
     */
    public SyncInvoker<UpdateModelVendorRequest, UpdateModelVendorResponse> updateModelVendorInvoker(
        UpdateModelVendorRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateModelVendor, hcClient);
    }

}
