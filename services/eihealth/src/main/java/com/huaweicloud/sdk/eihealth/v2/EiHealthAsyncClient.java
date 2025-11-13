package com.huaweicloud.sdk.eihealth.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class EiHealthAsyncClient {

    protected HcClient hcClient;

    public EiHealthAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthAsyncClient> newBuilder() {
        ClientBuilder<EiHealthAsyncClient> clientBuilder = new ClientBuilder<>(EiHealthAsyncClient::new);
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
     * @return CompletableFuture<ShowDrugJobStatisticsResponse>
     */
    public CompletableFuture<ShowDrugJobStatisticsResponse> showDrugJobStatisticsAsync(
        ShowDrugJobStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDrugJobStatistics);
    }

    /**
     * 统计药物作业数量和调用次数
     *
     * 统计药物作业数量和调用次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugJobStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowDrugJobStatisticsRequest, ShowDrugJobStatisticsResponse>
     */
    public AsyncInvoker<ShowDrugJobStatisticsRequest, ShowDrugJobStatisticsResponse> showDrugJobStatisticsAsyncInvoker(
        ShowDrugJobStatisticsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showDrugJobStatistics, hcClient);
    }

    /**
     * 创建问答内容反馈
     *
     * 创建问答内容反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageFeedbackRequest 请求对象
     * @return CompletableFuture<CreateMessageFeedbackResponse>
     */
    public CompletableFuture<CreateMessageFeedbackResponse> createMessageFeedbackAsync(
        CreateMessageFeedbackRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createMessageFeedback);
    }

    /**
     * 创建问答内容反馈
     *
     * 创建问答内容反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageFeedbackRequest 请求对象
     * @return AsyncInvoker<CreateMessageFeedbackRequest, CreateMessageFeedbackResponse>
     */
    public AsyncInvoker<CreateMessageFeedbackRequest, CreateMessageFeedbackResponse> createMessageFeedbackAsyncInvoker(
        CreateMessageFeedbackRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createMessageFeedback, hcClient);
    }

    /**
     * 创建助手模型
     *
     * 创建助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssistantModelRequest 请求对象
     * @return CompletableFuture<CreateAssistantModelResponse>
     */
    public CompletableFuture<CreateAssistantModelResponse> createAssistantModelAsync(
        CreateAssistantModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createAssistantModel);
    }

    /**
     * 创建助手模型
     *
     * 创建助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssistantModelRequest 请求对象
     * @return AsyncInvoker<CreateAssistantModelRequest, CreateAssistantModelResponse>
     */
    public AsyncInvoker<CreateAssistantModelRequest, CreateAssistantModelResponse> createAssistantModelAsyncInvoker(
        CreateAssistantModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createAssistantModel, hcClient);
    }

    /**
     * 删除助手模型
     *
     * 删除助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssistantModelRequest 请求对象
     * @return CompletableFuture<DeleteAssistantModelResponse>
     */
    public CompletableFuture<DeleteAssistantModelResponse> deleteAssistantModelAsync(
        DeleteAssistantModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteAssistantModel);
    }

    /**
     * 删除助手模型
     *
     * 删除助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssistantModelRequest 请求对象
     * @return AsyncInvoker<DeleteAssistantModelRequest, DeleteAssistantModelResponse>
     */
    public AsyncInvoker<DeleteAssistantModelRequest, DeleteAssistantModelResponse> deleteAssistantModelAsyncInvoker(
        DeleteAssistantModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteAssistantModel, hcClient);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAssistantModelsRequest 请求对象
     * @return CompletableFuture<ListAllAssistantModelsResponse>
     */
    public CompletableFuture<ListAllAssistantModelsResponse> listAllAssistantModelsAsync(
        ListAllAssistantModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listAllAssistantModels);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAssistantModelsRequest 请求对象
     * @return AsyncInvoker<ListAllAssistantModelsRequest, ListAllAssistantModelsResponse>
     */
    public AsyncInvoker<ListAllAssistantModelsRequest, ListAllAssistantModelsResponse> listAllAssistantModelsAsyncInvoker(
        ListAllAssistantModelsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listAllAssistantModels, hcClient);
    }

    /**
     * 获取供应商模型列表
     *
     * 获取供应商模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssistantModelsRequest 请求对象
     * @return CompletableFuture<ListAssistantModelsResponse>
     */
    public CompletableFuture<ListAssistantModelsResponse> listAssistantModelsAsync(ListAssistantModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listAssistantModels);
    }

    /**
     * 获取供应商模型列表
     *
     * 获取供应商模型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssistantModelsRequest 请求对象
     * @return AsyncInvoker<ListAssistantModelsRequest, ListAssistantModelsResponse>
     */
    public AsyncInvoker<ListAssistantModelsRequest, ListAssistantModelsResponse> listAssistantModelsAsyncInvoker(
        ListAssistantModelsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listAssistantModels, hcClient);
    }

    /**
     * 更新助手模型
     *
     * 更新助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistantModelRequest 请求对象
     * @return CompletableFuture<UpdateAssistantModelResponse>
     */
    public CompletableFuture<UpdateAssistantModelResponse> updateAssistantModelAsync(
        UpdateAssistantModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateAssistantModel);
    }

    /**
     * 更新助手模型
     *
     * 更新助手模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistantModelRequest 请求对象
     * @return AsyncInvoker<UpdateAssistantModelRequest, UpdateAssistantModelResponse>
     */
    public AsyncInvoker<UpdateAssistantModelRequest, UpdateAssistantModelResponse> updateAssistantModelAsyncInvoker(
        UpdateAssistantModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateAssistantModel, hcClient);
    }

    /**
     * 创建模型供应商
     *
     * 创建模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelVendorRequest 请求对象
     * @return CompletableFuture<CreateModelVendorResponse>
     */
    public CompletableFuture<CreateModelVendorResponse> createModelVendorAsync(CreateModelVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createModelVendor);
    }

    /**
     * 创建模型供应商
     *
     * 创建模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelVendorRequest 请求对象
     * @return AsyncInvoker<CreateModelVendorRequest, CreateModelVendorResponse>
     */
    public AsyncInvoker<CreateModelVendorRequest, CreateModelVendorResponse> createModelVendorAsyncInvoker(
        CreateModelVendorRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createModelVendor, hcClient);
    }

    /**
     * 删除模型供应商
     *
     * 删除模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVendorRequest 请求对象
     * @return CompletableFuture<DeleteModelVendorResponse>
     */
    public CompletableFuture<DeleteModelVendorResponse> deleteModelVendorAsync(DeleteModelVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteModelVendor);
    }

    /**
     * 删除模型供应商
     *
     * 删除模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVendorRequest 请求对象
     * @return AsyncInvoker<DeleteModelVendorRequest, DeleteModelVendorResponse>
     */
    public AsyncInvoker<DeleteModelVendorRequest, DeleteModelVendorResponse> deleteModelVendorAsyncInvoker(
        DeleteModelVendorRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteModelVendor, hcClient);
    }

    /**
     * 获取模型供应商列表
     *
     * 获取模型供应商列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVendorsRequest 请求对象
     * @return CompletableFuture<ListModelVendorsResponse>
     */
    public CompletableFuture<ListModelVendorsResponse> listModelVendorsAsync(ListModelVendorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listModelVendors);
    }

    /**
     * 获取模型供应商列表
     *
     * 获取模型供应商列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVendorsRequest 请求对象
     * @return AsyncInvoker<ListModelVendorsRequest, ListModelVendorsResponse>
     */
    public AsyncInvoker<ListModelVendorsRequest, ListModelVendorsResponse> listModelVendorsAsyncInvoker(
        ListModelVendorsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listModelVendors, hcClient);
    }

    /**
     * 更新模型供应商
     *
     * 更新模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelVendorRequest 请求对象
     * @return CompletableFuture<UpdateModelVendorResponse>
     */
    public CompletableFuture<UpdateModelVendorResponse> updateModelVendorAsync(UpdateModelVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateModelVendor);
    }

    /**
     * 更新模型供应商
     *
     * 更新模型供应商。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelVendorRequest 请求对象
     * @return AsyncInvoker<UpdateModelVendorRequest, UpdateModelVendorResponse>
     */
    public AsyncInvoker<UpdateModelVendorRequest, UpdateModelVendorResponse> updateModelVendorAsyncInvoker(
        UpdateModelVendorRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateModelVendor, hcClient);
    }

}
