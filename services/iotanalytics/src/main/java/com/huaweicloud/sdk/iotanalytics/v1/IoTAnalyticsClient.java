package com.huaweicloud.sdk.iotanalytics.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddDevDataRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddDevDataResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddPipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddPipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetModelRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetModelResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetNewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetNewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateBatchJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateBatchJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateComputingResourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateComputingResourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateDatasourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateDatasourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateRunRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateRunResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateStreamingJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateStreamingJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteAssetModelRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteAssetModelResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteAssetNewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteAssetNewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteBatchJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteBatchJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteComputingResourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteComputingResourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteDataStoreRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteDataStoreResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteDatasourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteDatasourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeletePipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeletePipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteRunRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteRunResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteStreamingJobByIdRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteStreamingJobByIdResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ExportDatasetRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ExportDatasetResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ImportDataRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ImportDataResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListAssetModelsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListAssetModelsResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListAssetsNewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListAssetsNewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListBatchJobsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListBatchJobsResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListComputingResourcesRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListComputingResourcesResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListDataStoresRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListDataStoresResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListGroupsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListGroupsResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListHistoryRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListHistoryResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListMetricsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListMetricsResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListPipelineJobsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListPipelineJobsResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListRunsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListRunsResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListTablesRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListTablesResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListTagValuesRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ListTagValuesResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.PublishRootAssetRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.PublishRootAssetResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowAllDataSourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowAllDataSourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowAssetModelRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowAssetModelResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowAssetNewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowAssetNewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowBatchJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowBatchJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowDataSourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowDataSourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowDatasetRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowDatasetResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowJobByIdRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowJobByIdResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowJobsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowJobsResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowLastPropertyValueRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowLastPropertyValueResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowMetricValueRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowMetricValueResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowPipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowPipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowPropertyRawValueRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowPropertyRawValueResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowPropertyValuesRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowPropertyValuesResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowRunRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowRunResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowTablePreviewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowTablePreviewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowTableSchemaRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ShowTableSchemaResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.StartJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.StartJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.StartPipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.StartPipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.StopJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.StopJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.StopPipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.StopPipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetModelRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetModelResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetNewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetNewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateBatchJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateBatchJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataSourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataSourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataStoreRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataStoreResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateGroupRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateGroupResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdatePipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdatePipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateStreamingJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateStreamingJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ValidateSqlRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ValidateSqlResponse;

public class IoTAnalyticsClient {

    protected HcClient hcClient;

    public IoTAnalyticsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTAnalyticsClient> newBuilder() {
        ClientBuilder<IoTAnalyticsClient> clientBuilder = new ClientBuilder<>(IoTAnalyticsClient::new);
        return clientBuilder;
    }

    /**
     * 创建资产模型
     *
     * 创建资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetModelRequest 请求对象
     * @return CreateAssetModelResponse
     */
    public CreateAssetModelResponse createAssetModel(CreateAssetModelRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createAssetModel);
    }

    /**
     * 创建资产模型
     *
     * 创建资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetModelRequest 请求对象
     * @return SyncInvoker<CreateAssetModelRequest, CreateAssetModelResponse>
     */
    public SyncInvoker<CreateAssetModelRequest, CreateAssetModelResponse> createAssetModelInvoker(
        CreateAssetModelRequest request) {
        return new SyncInvoker<CreateAssetModelRequest, CreateAssetModelResponse>(request,
            IoTAnalyticsMeta.createAssetModel, hcClient);
    }

    /**
     * 删除资产模型
     *
     * 删除资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetModelRequest 请求对象
     * @return DeleteAssetModelResponse
     */
    public DeleteAssetModelResponse deleteAssetModel(DeleteAssetModelRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteAssetModel);
    }

    /**
     * 删除资产模型
     *
     * 删除资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetModelRequest 请求对象
     * @return SyncInvoker<DeleteAssetModelRequest, DeleteAssetModelResponse>
     */
    public SyncInvoker<DeleteAssetModelRequest, DeleteAssetModelResponse> deleteAssetModelInvoker(
        DeleteAssetModelRequest request) {
        return new SyncInvoker<DeleteAssetModelRequest, DeleteAssetModelResponse>(request,
            IoTAnalyticsMeta.deleteAssetModel, hcClient);
    }

    /**
     * 获取资产模型列表
     *
     * 获取资产模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetModelsRequest 请求对象
     * @return ListAssetModelsResponse
     */
    public ListAssetModelsResponse listAssetModels(ListAssetModelsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listAssetModels);
    }

    /**
     * 获取资产模型列表
     *
     * 获取资产模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetModelsRequest 请求对象
     * @return SyncInvoker<ListAssetModelsRequest, ListAssetModelsResponse>
     */
    public SyncInvoker<ListAssetModelsRequest, ListAssetModelsResponse> listAssetModelsInvoker(
        ListAssetModelsRequest request) {
        return new SyncInvoker<ListAssetModelsRequest, ListAssetModelsResponse>(request,
            IoTAnalyticsMeta.listAssetModels, hcClient);
    }

    /**
     * 获取资产模型详情
     *
     * 获取资产模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetModelRequest 请求对象
     * @return ShowAssetModelResponse
     */
    public ShowAssetModelResponse showAssetModel(ShowAssetModelRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showAssetModel);
    }

    /**
     * 获取资产模型详情
     *
     * 获取资产模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetModelRequest 请求对象
     * @return SyncInvoker<ShowAssetModelRequest, ShowAssetModelResponse>
     */
    public SyncInvoker<ShowAssetModelRequest, ShowAssetModelResponse> showAssetModelInvoker(
        ShowAssetModelRequest request) {
        return new SyncInvoker<ShowAssetModelRequest, ShowAssetModelResponse>(request, IoTAnalyticsMeta.showAssetModel,
            hcClient);
    }

    /**
     * 修改资产模型
     *
     * 修改资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetModelRequest 请求对象
     * @return UpdateAssetModelResponse
     */
    public UpdateAssetModelResponse updateAssetModel(UpdateAssetModelRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updateAssetModel);
    }

    /**
     * 修改资产模型
     *
     * 修改资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetModelRequest 请求对象
     * @return SyncInvoker<UpdateAssetModelRequest, UpdateAssetModelResponse>
     */
    public SyncInvoker<UpdateAssetModelRequest, UpdateAssetModelResponse> updateAssetModelInvoker(
        UpdateAssetModelRequest request) {
        return new SyncInvoker<UpdateAssetModelRequest, UpdateAssetModelResponse>(request,
            IoTAnalyticsMeta.updateAssetModel, hcClient);
    }

    /**
     * 创建资产
     *
     * 创建资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetNewRequest 请求对象
     * @return CreateAssetNewResponse
     */
    public CreateAssetNewResponse createAssetNew(CreateAssetNewRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createAssetNew);
    }

    /**
     * 创建资产
     *
     * 创建资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetNewRequest 请求对象
     * @return SyncInvoker<CreateAssetNewRequest, CreateAssetNewResponse>
     */
    public SyncInvoker<CreateAssetNewRequest, CreateAssetNewResponse> createAssetNewInvoker(
        CreateAssetNewRequest request) {
        return new SyncInvoker<CreateAssetNewRequest, CreateAssetNewResponse>(request, IoTAnalyticsMeta.createAssetNew,
            hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetNewRequest 请求对象
     * @return DeleteAssetNewResponse
     */
    public DeleteAssetNewResponse deleteAssetNew(DeleteAssetNewRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteAssetNew);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetNewRequest 请求对象
     * @return SyncInvoker<DeleteAssetNewRequest, DeleteAssetNewResponse>
     */
    public SyncInvoker<DeleteAssetNewRequest, DeleteAssetNewResponse> deleteAssetNewInvoker(
        DeleteAssetNewRequest request) {
        return new SyncInvoker<DeleteAssetNewRequest, DeleteAssetNewResponse>(request, IoTAnalyticsMeta.deleteAssetNew,
            hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetsNewRequest 请求对象
     * @return ListAssetsNewResponse
     */
    public ListAssetsNewResponse listAssetsNew(ListAssetsNewRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listAssetsNew);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetsNewRequest 请求对象
     * @return SyncInvoker<ListAssetsNewRequest, ListAssetsNewResponse>
     */
    public SyncInvoker<ListAssetsNewRequest, ListAssetsNewResponse> listAssetsNewInvoker(ListAssetsNewRequest request) {
        return new SyncInvoker<ListAssetsNewRequest, ListAssetsNewResponse>(request, IoTAnalyticsMeta.listAssetsNew,
            hcClient);
    }

    /**
     * 发布资产
     *
     * 发布资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishRootAssetRequest 请求对象
     * @return PublishRootAssetResponse
     */
    public PublishRootAssetResponse publishRootAsset(PublishRootAssetRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.publishRootAsset);
    }

    /**
     * 发布资产
     *
     * 发布资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishRootAssetRequest 请求对象
     * @return SyncInvoker<PublishRootAssetRequest, PublishRootAssetResponse>
     */
    public SyncInvoker<PublishRootAssetRequest, PublishRootAssetResponse> publishRootAssetInvoker(
        PublishRootAssetRequest request) {
        return new SyncInvoker<PublishRootAssetRequest, PublishRootAssetResponse>(request,
            IoTAnalyticsMeta.publishRootAsset, hcClient);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetNewRequest 请求对象
     * @return ShowAssetNewResponse
     */
    public ShowAssetNewResponse showAssetNew(ShowAssetNewRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showAssetNew);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetNewRequest 请求对象
     * @return SyncInvoker<ShowAssetNewRequest, ShowAssetNewResponse>
     */
    public SyncInvoker<ShowAssetNewRequest, ShowAssetNewResponse> showAssetNewInvoker(ShowAssetNewRequest request) {
        return new SyncInvoker<ShowAssetNewRequest, ShowAssetNewResponse>(request, IoTAnalyticsMeta.showAssetNew,
            hcClient);
    }

    /**
     * 修改资产
     *
     * 修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetNewRequest 请求对象
     * @return UpdateAssetNewResponse
     */
    public UpdateAssetNewResponse updateAssetNew(UpdateAssetNewRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updateAssetNew);
    }

    /**
     * 修改资产
     *
     * 修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetNewRequest 请求对象
     * @return SyncInvoker<UpdateAssetNewRequest, UpdateAssetNewResponse>
     */
    public SyncInvoker<UpdateAssetNewRequest, UpdateAssetNewResponse> updateAssetNewInvoker(
        UpdateAssetNewRequest request) {
        return new SyncInvoker<UpdateAssetNewRequest, UpdateAssetNewResponse>(request, IoTAnalyticsMeta.updateAssetNew,
            hcClient);
    }

    /**
     * 获取资产属性最新值
     *
     * 获取资产属性最新值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLastPropertyValueRequest 请求对象
     * @return ShowLastPropertyValueResponse
     */
    public ShowLastPropertyValueResponse showLastPropertyValue(ShowLastPropertyValueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showLastPropertyValue);
    }

    /**
     * 获取资产属性最新值
     *
     * 获取资产属性最新值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLastPropertyValueRequest 请求对象
     * @return SyncInvoker<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse>
     */
    public SyncInvoker<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse> showLastPropertyValueInvoker(
        ShowLastPropertyValueRequest request) {
        return new SyncInvoker<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse>(request,
            IoTAnalyticsMeta.showLastPropertyValue, hcClient);
    }

    /**
     * 获取资产属性聚合值
     *
     * 获取资产属性聚合值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricValueRequest 请求对象
     * @return ShowMetricValueResponse
     */
    public ShowMetricValueResponse showMetricValue(ShowMetricValueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showMetricValue);
    }

    /**
     * 获取资产属性聚合值
     *
     * 获取资产属性聚合值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricValueRequest 请求对象
     * @return SyncInvoker<ShowMetricValueRequest, ShowMetricValueResponse>
     */
    public SyncInvoker<ShowMetricValueRequest, ShowMetricValueResponse> showMetricValueInvoker(
        ShowMetricValueRequest request) {
        return new SyncInvoker<ShowMetricValueRequest, ShowMetricValueResponse>(request,
            IoTAnalyticsMeta.showMetricValue, hcClient);
    }

    /**
     * 获取资产属性历史值
     *
     * 获取资产属性历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyRawValueRequest 请求对象
     * @return ShowPropertyRawValueResponse
     */
    public ShowPropertyRawValueResponse showPropertyRawValue(ShowPropertyRawValueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showPropertyRawValue);
    }

    /**
     * 获取资产属性历史值
     *
     * 获取资产属性历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyRawValueRequest 请求对象
     * @return SyncInvoker<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse>
     */
    public SyncInvoker<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse> showPropertyRawValueInvoker(
        ShowPropertyRawValueRequest request) {
        return new SyncInvoker<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse>(request,
            IoTAnalyticsMeta.showPropertyRawValue, hcClient);
    }

    /**
     * 创建批计算资源
     *
     * 创建批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComputingResourceRequest 请求对象
     * @return CreateComputingResourceResponse
     */
    public CreateComputingResourceResponse createComputingResource(CreateComputingResourceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createComputingResource);
    }

    /**
     * 创建批计算资源
     *
     * 创建批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComputingResourceRequest 请求对象
     * @return SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>
     */
    public SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResourceInvoker(
        CreateComputingResourceRequest request) {
        return new SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>(request,
            IoTAnalyticsMeta.createComputingResource, hcClient);
    }

    /**
     * 删除批计算资源
     *
     * 删除批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComputingResourceRequest 请求对象
     * @return DeleteComputingResourceResponse
     */
    public DeleteComputingResourceResponse deleteComputingResource(DeleteComputingResourceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteComputingResource);
    }

    /**
     * 删除批计算资源
     *
     * 删除批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComputingResourceRequest 请求对象
     * @return SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>
     */
    public SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResourceInvoker(
        DeleteComputingResourceRequest request) {
        return new SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>(request,
            IoTAnalyticsMeta.deleteComputingResource, hcClient);
    }

    /**
     * 查询批计算资源列表
     *
     * 查询批计算资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourcesRequest 请求对象
     * @return ListComputingResourcesResponse
     */
    public ListComputingResourcesResponse listComputingResources(ListComputingResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listComputingResources);
    }

    /**
     * 查询批计算资源列表
     *
     * 查询批计算资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourcesRequest 请求对象
     * @return SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>
     */
    public SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResourcesInvoker(
        ListComputingResourcesRequest request) {
        return new SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>(request,
            IoTAnalyticsMeta.listComputingResources, hcClient);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceRequest 请求对象
     * @return CreateDatasourceResponse
     */
    public CreateDatasourceResponse createDatasource(CreateDatasourceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createDatasource);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceRequest 请求对象
     * @return SyncInvoker<CreateDatasourceRequest, CreateDatasourceResponse>
     */
    public SyncInvoker<CreateDatasourceRequest, CreateDatasourceResponse> createDatasourceInvoker(
        CreateDatasourceRequest request) {
        return new SyncInvoker<CreateDatasourceRequest, CreateDatasourceResponse>(request,
            IoTAnalyticsMeta.createDatasource, hcClient);
    }

    /**
     * 删除数据源
     *
     * 删除数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceRequest 请求对象
     * @return DeleteDatasourceResponse
     */
    public DeleteDatasourceResponse deleteDatasource(DeleteDatasourceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteDatasource);
    }

    /**
     * 删除数据源
     *
     * 删除数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceRequest 请求对象
     * @return SyncInvoker<DeleteDatasourceRequest, DeleteDatasourceResponse>
     */
    public SyncInvoker<DeleteDatasourceRequest, DeleteDatasourceResponse> deleteDatasourceInvoker(
        DeleteDatasourceRequest request) {
        return new SyncInvoker<DeleteDatasourceRequest, DeleteDatasourceResponse>(request,
            IoTAnalyticsMeta.deleteDatasource, hcClient);
    }

    /**
     * 查询数据源列表
     *
     * 查询数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllDataSourceRequest 请求对象
     * @return ShowAllDataSourceResponse
     */
    public ShowAllDataSourceResponse showAllDataSource(ShowAllDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showAllDataSource);
    }

    /**
     * 查询数据源列表
     *
     * 查询数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllDataSourceRequest 请求对象
     * @return SyncInvoker<ShowAllDataSourceRequest, ShowAllDataSourceResponse>
     */
    public SyncInvoker<ShowAllDataSourceRequest, ShowAllDataSourceResponse> showAllDataSourceInvoker(
        ShowAllDataSourceRequest request) {
        return new SyncInvoker<ShowAllDataSourceRequest, ShowAllDataSourceResponse>(request,
            IoTAnalyticsMeta.showAllDataSource, hcClient);
    }

    /**
     * 查询数据源详情
     *
     * 查询数据源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataSourceRequest 请求对象
     * @return ShowDataSourceResponse
     */
    public ShowDataSourceResponse showDataSource(ShowDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showDataSource);
    }

    /**
     * 查询数据源详情
     *
     * 查询数据源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataSourceRequest 请求对象
     * @return SyncInvoker<ShowDataSourceRequest, ShowDataSourceResponse>
     */
    public SyncInvoker<ShowDataSourceRequest, ShowDataSourceResponse> showDataSourceInvoker(
        ShowDataSourceRequest request) {
        return new SyncInvoker<ShowDataSourceRequest, ShowDataSourceResponse>(request, IoTAnalyticsMeta.showDataSource,
            hcClient);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataSourceRequest 请求对象
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updateDataSource);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataSourceRequest 请求对象
     * @return SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>
     */
    public SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSourceInvoker(
        UpdateDataSourceRequest request) {
        return new SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>(request,
            IoTAnalyticsMeta.updateDataSource, hcClient);
    }

    /**
     * 创建存储组
     *
     * 创建存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGroupRequest 请求对象
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createGroup);
    }

    /**
     * 创建存储组
     *
     * 创建存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGroupRequest 请求对象
     * @return SyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public SyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupInvoker(CreateGroupRequest request) {
        return new SyncInvoker<CreateGroupRequest, CreateGroupResponse>(request, IoTAnalyticsMeta.createGroup,
            hcClient);
    }

    /**
     * 删除存储组
     *
     * 删除存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteGroup);
    }

    /**
     * 删除存储组
     *
     * 删除存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>(request, IoTAnalyticsMeta.deleteGroup,
            hcClient);
    }

    /**
     * 查询存储组列表
     *
     * 查询存储组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsRequest 请求对象
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listGroups);
    }

    /**
     * 查询存储组列表
     *
     * 查询存储组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsRequest 请求对象
     * @return SyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public SyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsInvoker(ListGroupsRequest request) {
        return new SyncInvoker<ListGroupsRequest, ListGroupsResponse>(request, IoTAnalyticsMeta.listGroups, hcClient);
    }

    /**
     * 更新存储组
     *
     * 更新存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupRequest 请求对象
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updateGroup);
    }

    /**
     * 更新存储组
     *
     * 更新存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupRequest 请求对象
     * @return SyncInvoker<UpdateGroupRequest, UpdateGroupResponse>
     */
    public SyncInvoker<UpdateGroupRequest, UpdateGroupResponse> updateGroupInvoker(UpdateGroupRequest request) {
        return new SyncInvoker<UpdateGroupRequest, UpdateGroupResponse>(request, IoTAnalyticsMeta.updateGroup,
            hcClient);
    }

    /**
     * 删除存储
     *
     * 删除存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataStoreRequest 请求对象
     * @return DeleteDataStoreResponse
     */
    public DeleteDataStoreResponse deleteDataStore(DeleteDataStoreRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteDataStore);
    }

    /**
     * 删除存储
     *
     * 删除存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataStoreRequest 请求对象
     * @return SyncInvoker<DeleteDataStoreRequest, DeleteDataStoreResponse>
     */
    public SyncInvoker<DeleteDataStoreRequest, DeleteDataStoreResponse> deleteDataStoreInvoker(
        DeleteDataStoreRequest request) {
        return new SyncInvoker<DeleteDataStoreRequest, DeleteDataStoreResponse>(request,
            IoTAnalyticsMeta.deleteDataStore, hcClient);
    }

    /**
     * 查询存储列表
     *
     * 查询存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataStoresRequest 请求对象
     * @return ListDataStoresResponse
     */
    public ListDataStoresResponse listDataStores(ListDataStoresRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listDataStores);
    }

    /**
     * 查询存储列表
     *
     * 查询存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataStoresRequest 请求对象
     * @return SyncInvoker<ListDataStoresRequest, ListDataStoresResponse>
     */
    public SyncInvoker<ListDataStoresRequest, ListDataStoresResponse> listDataStoresInvoker(
        ListDataStoresRequest request) {
        return new SyncInvoker<ListDataStoresRequest, ListDataStoresResponse>(request, IoTAnalyticsMeta.listDataStores,
            hcClient);
    }

    /**
     * 更新存储
     *
     * 更新存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataStoreRequest 请求对象
     * @return UpdateDataStoreResponse
     */
    public UpdateDataStoreResponse updateDataStore(UpdateDataStoreRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updateDataStore);
    }

    /**
     * 更新存储
     *
     * 更新存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataStoreRequest 请求对象
     * @return SyncInvoker<UpdateDataStoreRequest, UpdateDataStoreResponse>
     */
    public SyncInvoker<UpdateDataStoreRequest, UpdateDataStoreResponse> updateDataStoreInvoker(
        UpdateDataStoreRequest request) {
        return new SyncInvoker<UpdateDataStoreRequest, UpdateDataStoreResponse>(request,
            IoTAnalyticsMeta.updateDataStore, hcClient);
    }

    /**
     * 根据标签查询设备历史值
     *
     * 根据标签查询设备历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryRequest 请求对象
     * @return ListHistoryResponse
     */
    public ListHistoryResponse listHistory(ListHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listHistory);
    }

    /**
     * 根据标签查询设备历史值
     *
     * 根据标签查询设备历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryRequest 请求对象
     * @return SyncInvoker<ListHistoryRequest, ListHistoryResponse>
     */
    public SyncInvoker<ListHistoryRequest, ListHistoryResponse> listHistoryInvoker(ListHistoryRequest request) {
        return new SyncInvoker<ListHistoryRequest, ListHistoryResponse>(request, IoTAnalyticsMeta.listHistory,
            hcClient);
    }

    /**
     * 根据标签聚合、查询指标数据
     *
     * 根据标签聚合、查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricsRequest 请求对象
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listMetrics);
    }

    /**
     * 根据标签聚合、查询指标数据
     *
     * 根据标签聚合、查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricsRequest 请求对象
     * @return SyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public SyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsInvoker(ListMetricsRequest request) {
        return new SyncInvoker<ListMetricsRequest, ListMetricsResponse>(request, IoTAnalyticsMeta.listMetrics,
            hcClient);
    }

    /**
     * 查询设备属性最新状态值
     *
     * 查询设备属性最新状态值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyValuesRequest 请求对象
     * @return ShowPropertyValuesResponse
     */
    public ShowPropertyValuesResponse showPropertyValues(ShowPropertyValuesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showPropertyValues);
    }

    /**
     * 查询设备属性最新状态值
     *
     * 查询设备属性最新状态值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyValuesRequest 请求对象
     * @return SyncInvoker<ShowPropertyValuesRequest, ShowPropertyValuesResponse>
     */
    public SyncInvoker<ShowPropertyValuesRequest, ShowPropertyValuesResponse> showPropertyValuesInvoker(
        ShowPropertyValuesRequest request) {
        return new SyncInvoker<ShowPropertyValuesRequest, ShowPropertyValuesResponse>(request,
            IoTAnalyticsMeta.showPropertyValues, hcClient);
    }

    /**
     * 查询标签的值列表
     *
     * 查询标签的值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listTagValues);
    }

    /**
     * 查询标签的值列表
     *
     * 查询标签的值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return SyncInvoker<ListTagValuesRequest, ListTagValuesResponse>
     */
    public SyncInvoker<ListTagValuesRequest, ListTagValuesResponse> listTagValuesInvoker(ListTagValuesRequest request) {
        return new SyncInvoker<ListTagValuesRequest, ListTagValuesResponse>(request, IoTAnalyticsMeta.listTagValues,
            hcClient);
    }

    /**
     * 下载离线作业结果
     *
     * 将SQL语句的查询结果下载到本地，只支持下载“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportDatasetRequest 请求对象
     * @return ExportDatasetResponse
     */
    public ExportDatasetResponse exportDataset(ExportDatasetRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.exportDataset);
    }

    /**
     * 下载离线作业结果
     *
     * 将SQL语句的查询结果下载到本地，只支持下载“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportDatasetRequest 请求对象
     * @return SyncInvoker<ExportDatasetRequest, ExportDatasetResponse>
     */
    public SyncInvoker<ExportDatasetRequest, ExportDatasetResponse> exportDatasetInvoker(ExportDatasetRequest request) {
        return new SyncInvoker<ExportDatasetRequest, ExportDatasetResponse>(request, IoTAnalyticsMeta.exportDataset,
            hcClient);
    }

    /**
     * 执行导入数据离线作业
     *
     * 将数据从文件导入OBS表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return ImportDataResponse
     */
    public ImportDataResponse importData(ImportDataRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.importData);
    }

    /**
     * 执行导入数据离线作业
     *
     * 将数据从文件导入OBS表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return SyncInvoker<ImportDataRequest, ImportDataResponse>
     */
    public SyncInvoker<ImportDataRequest, ImportDataResponse> importDataInvoker(ImportDataRequest request) {
        return new SyncInvoker<ImportDataRequest, ImportDataResponse>(request, IoTAnalyticsMeta.importData, hcClient);
    }

    /**
     * 查询离线作业结果
     *
     * 在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasetRequest 请求对象
     * @return ShowDatasetResponse
     */
    public ShowDatasetResponse showDataset(ShowDatasetRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showDataset);
    }

    /**
     * 查询离线作业结果
     *
     * 在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasetRequest 请求对象
     * @return SyncInvoker<ShowDatasetRequest, ShowDatasetResponse>
     */
    public SyncInvoker<ShowDatasetRequest, ShowDatasetResponse> showDatasetInvoker(ShowDatasetRequest request) {
        return new SyncInvoker<ShowDatasetRequest, ShowDatasetResponse>(request, IoTAnalyticsMeta.showDataset,
            hcClient);
    }

    /**
     * 检查离线作业SQL语法
     *
     * 检查离线作业SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateSqlRequest 请求对象
     * @return ValidateSqlResponse
     */
    public ValidateSqlResponse validateSql(ValidateSqlRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.validateSql);
    }

    /**
     * 检查离线作业SQL语法
     *
     * 检查离线作业SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateSqlRequest 请求对象
     * @return SyncInvoker<ValidateSqlRequest, ValidateSqlResponse>
     */
    public SyncInvoker<ValidateSqlRequest, ValidateSqlResponse> validateSqlInvoker(ValidateSqlRequest request) {
        return new SyncInvoker<ValidateSqlRequest, ValidateSqlResponse>(request, IoTAnalyticsMeta.validateSql,
            hcClient);
    }

    /**
     * 通过API数据源上报设备数据
     *
     * 通过API数据源上报设备数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDevDataRequest 请求对象
     * @return AddDevDataResponse
     */
    public AddDevDataResponse addDevData(AddDevDataRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.addDevData);
    }

    /**
     * 通过API数据源上报设备数据
     *
     * 通过API数据源上报设备数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDevDataRequest 请求对象
     * @return SyncInvoker<AddDevDataRequest, AddDevDataResponse>
     */
    public SyncInvoker<AddDevDataRequest, AddDevDataResponse> addDevDataInvoker(AddDevDataRequest request) {
        return new SyncInvoker<AddDevDataRequest, AddDevDataResponse>(request, IoTAnalyticsMeta.addDevData, hcClient);
    }

    /**
     * 创建离线作业
     *
     * 创建离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return CreateBatchJobResponse
     */
    public CreateBatchJobResponse createBatchJob(CreateBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createBatchJob);
    }

    /**
     * 创建离线作业
     *
     * 创建离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>
     */
    public SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJobInvoker(
        CreateBatchJobRequest request) {
        return new SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>(request, IoTAnalyticsMeta.createBatchJob,
            hcClient);
    }

    /**
     * 删除离线作业
     *
     * 删除离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchJobRequest 请求对象
     * @return DeleteBatchJobResponse
     */
    public DeleteBatchJobResponse deleteBatchJob(DeleteBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteBatchJob);
    }

    /**
     * 删除离线作业
     *
     * 删除离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchJobRequest 请求对象
     * @return SyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse>
     */
    public SyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJobInvoker(
        DeleteBatchJobRequest request) {
        return new SyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse>(request, IoTAnalyticsMeta.deleteBatchJob,
            hcClient);
    }

    /**
     * 查询离线作业列表
     *
     * 查询离线作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchJobsRequest 请求对象
     * @return ListBatchJobsResponse
     */
    public ListBatchJobsResponse listBatchJobs(ListBatchJobsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listBatchJobs);
    }

    /**
     * 查询离线作业列表
     *
     * 查询离线作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchJobsRequest 请求对象
     * @return SyncInvoker<ListBatchJobsRequest, ListBatchJobsResponse>
     */
    public SyncInvoker<ListBatchJobsRequest, ListBatchJobsResponse> listBatchJobsInvoker(ListBatchJobsRequest request) {
        return new SyncInvoker<ListBatchJobsRequest, ListBatchJobsResponse>(request, IoTAnalyticsMeta.listBatchJobs,
            hcClient);
    }

    /**
     * 查询离线作业详情
     *
     * 查询离线作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchJobRequest 请求对象
     * @return ShowBatchJobResponse
     */
    public ShowBatchJobResponse showBatchJob(ShowBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showBatchJob);
    }

    /**
     * 查询离线作业详情
     *
     * 查询离线作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchJobRequest 请求对象
     * @return SyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse>
     */
    public SyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJobInvoker(ShowBatchJobRequest request) {
        return new SyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse>(request, IoTAnalyticsMeta.showBatchJob,
            hcClient);
    }

    /**
     * 修改离线作业
     *
     * 修改离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchJobRequest 请求对象
     * @return UpdateBatchJobResponse
     */
    public UpdateBatchJobResponse updateBatchJob(UpdateBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updateBatchJob);
    }

    /**
     * 修改离线作业
     *
     * 修改离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchJobRequest 请求对象
     * @return SyncInvoker<UpdateBatchJobRequest, UpdateBatchJobResponse>
     */
    public SyncInvoker<UpdateBatchJobRequest, UpdateBatchJobResponse> updateBatchJobInvoker(
        UpdateBatchJobRequest request) {
        return new SyncInvoker<UpdateBatchJobRequest, UpdateBatchJobResponse>(request, IoTAnalyticsMeta.updateBatchJob,
            hcClient);
    }

    /**
     * 新建管道作业
     *
     * 新建管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（作业中各算子的详细配置请参考算子配置章节。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPipelineJobRequest 请求对象
     * @return AddPipelineJobResponse
     */
    public AddPipelineJobResponse addPipelineJob(AddPipelineJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.addPipelineJob);
    }

    /**
     * 新建管道作业
     *
     * 新建管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（作业中各算子的详细配置请参考算子配置章节。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPipelineJobRequest 请求对象
     * @return SyncInvoker<AddPipelineJobRequest, AddPipelineJobResponse>
     */
    public SyncInvoker<AddPipelineJobRequest, AddPipelineJobResponse> addPipelineJobInvoker(
        AddPipelineJobRequest request) {
        return new SyncInvoker<AddPipelineJobRequest, AddPipelineJobResponse>(request, IoTAnalyticsMeta.addPipelineJob,
            hcClient);
    }

    /**
     * 删除管道作业
     *
     * 删除用户指定的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineJobRequest 请求对象
     * @return DeletePipelineJobResponse
     */
    public DeletePipelineJobResponse deletePipelineJob(DeletePipelineJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deletePipelineJob);
    }

    /**
     * 删除管道作业
     *
     * 删除用户指定的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineJobRequest 请求对象
     * @return SyncInvoker<DeletePipelineJobRequest, DeletePipelineJobResponse>
     */
    public SyncInvoker<DeletePipelineJobRequest, DeletePipelineJobResponse> deletePipelineJobInvoker(
        DeletePipelineJobRequest request) {
        return new SyncInvoker<DeletePipelineJobRequest, DeletePipelineJobResponse>(request,
            IoTAnalyticsMeta.deletePipelineJob, hcClient);
    }

    /**
     * 获取管道作业列表
     *
     * 获取用户下的所有管道作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineJobsRequest 请求对象
     * @return ListPipelineJobsResponse
     */
    public ListPipelineJobsResponse listPipelineJobs(ListPipelineJobsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listPipelineJobs);
    }

    /**
     * 获取管道作业列表
     *
     * 获取用户下的所有管道作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineJobsRequest 请求对象
     * @return SyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse>
     */
    public SyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse> listPipelineJobsInvoker(
        ListPipelineJobsRequest request) {
        return new SyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse>(request,
            IoTAnalyticsMeta.listPipelineJobs, hcClient);
    }

    /**
     * 获取管道作业详情
     *
     * 获取指定管道作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineJobRequest 请求对象
     * @return ShowPipelineJobResponse
     */
    public ShowPipelineJobResponse showPipelineJob(ShowPipelineJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showPipelineJob);
    }

    /**
     * 获取管道作业详情
     *
     * 获取指定管道作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineJobRequest 请求对象
     * @return SyncInvoker<ShowPipelineJobRequest, ShowPipelineJobResponse>
     */
    public SyncInvoker<ShowPipelineJobRequest, ShowPipelineJobResponse> showPipelineJobInvoker(
        ShowPipelineJobRequest request) {
        return new SyncInvoker<ShowPipelineJobRequest, ShowPipelineJobResponse>(request,
            IoTAnalyticsMeta.showPipelineJob, hcClient);
    }

    /**
     * 启动管道作业
     *
     * 提交管道作业到运行环境，实时接收数据源的数据并按用户定义的数据清洗逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPipelineJobRequest 请求对象
     * @return StartPipelineJobResponse
     */
    public StartPipelineJobResponse startPipelineJob(StartPipelineJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.startPipelineJob);
    }

    /**
     * 启动管道作业
     *
     * 提交管道作业到运行环境，实时接收数据源的数据并按用户定义的数据清洗逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPipelineJobRequest 请求对象
     * @return SyncInvoker<StartPipelineJobRequest, StartPipelineJobResponse>
     */
    public SyncInvoker<StartPipelineJobRequest, StartPipelineJobResponse> startPipelineJobInvoker(
        StartPipelineJobRequest request) {
        return new SyncInvoker<StartPipelineJobRequest, StartPipelineJobResponse>(request,
            IoTAnalyticsMeta.startPipelineJob, hcClient);
    }

    /**
     * 停止管道作业
     *
     * 停止一个正在运行中的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineJobRequest 请求对象
     * @return StopPipelineJobResponse
     */
    public StopPipelineJobResponse stopPipelineJob(StopPipelineJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.stopPipelineJob);
    }

    /**
     * 停止管道作业
     *
     * 停止一个正在运行中的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineJobRequest 请求对象
     * @return SyncInvoker<StopPipelineJobRequest, StopPipelineJobResponse>
     */
    public SyncInvoker<StopPipelineJobRequest, StopPipelineJobResponse> stopPipelineJobInvoker(
        StopPipelineJobRequest request) {
        return new SyncInvoker<StopPipelineJobRequest, StopPipelineJobResponse>(request,
            IoTAnalyticsMeta.stopPipelineJob, hcClient);
    }

    /**
     * 更新管道作业
     *
     * 更新管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（管道作业详细配置，每个作业可选择不同的算子进行组合，各算子的使用方法详见：数据管道算子配置指南。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineJobRequest 请求对象
     * @return UpdatePipelineJobResponse
     */
    public UpdatePipelineJobResponse updatePipelineJob(UpdatePipelineJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updatePipelineJob);
    }

    /**
     * 更新管道作业
     *
     * 更新管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（管道作业详细配置，每个作业可选择不同的算子进行组合，各算子的使用方法详见：数据管道算子配置指南。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineJobRequest 请求对象
     * @return SyncInvoker<UpdatePipelineJobRequest, UpdatePipelineJobResponse>
     */
    public SyncInvoker<UpdatePipelineJobRequest, UpdatePipelineJobResponse> updatePipelineJobInvoker(
        UpdatePipelineJobRequest request) {
        return new SyncInvoker<UpdatePipelineJobRequest, UpdatePipelineJobResponse>(request,
            IoTAnalyticsMeta.updatePipelineJob, hcClient);
    }

    /**
     * 新建实时作业
     *
     * 除名称和描述外，可先不提供作业的详细配置信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamingJobRequest 请求对象
     * @return CreateStreamingJobResponse
     */
    public CreateStreamingJobResponse createStreamingJob(CreateStreamingJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createStreamingJob);
    }

    /**
     * 新建实时作业
     *
     * 除名称和描述外，可先不提供作业的详细配置信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamingJobRequest 请求对象
     * @return SyncInvoker<CreateStreamingJobRequest, CreateStreamingJobResponse>
     */
    public SyncInvoker<CreateStreamingJobRequest, CreateStreamingJobResponse> createStreamingJobInvoker(
        CreateStreamingJobRequest request) {
        return new SyncInvoker<CreateStreamingJobRequest, CreateStreamingJobResponse>(request,
            IoTAnalyticsMeta.createStreamingJob, hcClient);
    }

    /**
     * 删除实时作业
     *
     * 删除用户指定的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamingJobByIdRequest 请求对象
     * @return DeleteStreamingJobByIdResponse
     */
    public DeleteStreamingJobByIdResponse deleteStreamingJobById(DeleteStreamingJobByIdRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteStreamingJobById);
    }

    /**
     * 删除实时作业
     *
     * 删除用户指定的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamingJobByIdRequest 请求对象
     * @return SyncInvoker<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse>
     */
    public SyncInvoker<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse> deleteStreamingJobByIdInvoker(
        DeleteStreamingJobByIdRequest request) {
        return new SyncInvoker<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse>(request,
            IoTAnalyticsMeta.deleteStreamingJobById, hcClient);
    }

    /**
     * 获取实时作业详情
     *
     * 获取指定作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobByIdRequest 请求对象
     * @return ShowJobByIdResponse
     */
    public ShowJobByIdResponse showJobById(ShowJobByIdRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showJobById);
    }

    /**
     * 获取实时作业详情
     *
     * 获取指定作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobByIdRequest 请求对象
     * @return SyncInvoker<ShowJobByIdRequest, ShowJobByIdResponse>
     */
    public SyncInvoker<ShowJobByIdRequest, ShowJobByIdResponse> showJobByIdInvoker(ShowJobByIdRequest request) {
        return new SyncInvoker<ShowJobByIdRequest, ShowJobByIdResponse>(request, IoTAnalyticsMeta.showJobById,
            hcClient);
    }

    /**
     * 获取实时作业列表
     *
     * 获取用户下的所有实时分析作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return ShowJobsResponse
     */
    public ShowJobsResponse showJobs(ShowJobsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showJobs);
    }

    /**
     * 获取实时作业列表
     *
     * 获取用户下的所有实时分析作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return SyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public SyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsInvoker(ShowJobsRequest request) {
        return new SyncInvoker<ShowJobsRequest, ShowJobsResponse>(request, IoTAnalyticsMeta.showJobs, hcClient);
    }

    /**
     * 更新实时作业
     *
     * 更新作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamingJobRequest 请求对象
     * @return UpdateStreamingJobResponse
     */
    public UpdateStreamingJobResponse updateStreamingJob(UpdateStreamingJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.updateStreamingJob);
    }

    /**
     * 更新实时作业
     *
     * 更新作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamingJobRequest 请求对象
     * @return SyncInvoker<UpdateStreamingJobRequest, UpdateStreamingJobResponse>
     */
    public SyncInvoker<UpdateStreamingJobRequest, UpdateStreamingJobResponse> updateStreamingJobInvoker(
        UpdateStreamingJobRequest request) {
        return new SyncInvoker<UpdateStreamingJobRequest, UpdateStreamingJobResponse>(request,
            IoTAnalyticsMeta.updateStreamingJob, hcClient);
    }

    /**
     * 启动实时作业
     *
     * 提交作业到运行环境，实时接收数据并按用户定义的业务逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return StartJobResponse
     */
    public StartJobResponse startJob(StartJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.startJob);
    }

    /**
     * 启动实时作业
     *
     * 提交作业到运行环境，实时接收数据并按用户定义的业务逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return SyncInvoker<StartJobRequest, StartJobResponse>
     */
    public SyncInvoker<StartJobRequest, StartJobResponse> startJobInvoker(StartJobRequest request) {
        return new SyncInvoker<StartJobRequest, StartJobResponse>(request, IoTAnalyticsMeta.startJob, hcClient);
    }

    /**
     * 停止实时作业
     *
     * 停止一个正在运行中的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.stopJob);
    }

    /**
     * 停止实时作业
     *
     * 停止一个正在运行中的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<StopJobRequest, StopJobResponse>(request, IoTAnalyticsMeta.stopJob, hcClient);
    }

    /**
     * 执行离线作业
     *
     * 执行离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRunRequest 请求对象
     * @return CreateRunResponse
     */
    public CreateRunResponse createRun(CreateRunRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createRun);
    }

    /**
     * 执行离线作业
     *
     * 执行离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRunRequest 请求对象
     * @return SyncInvoker<CreateRunRequest, CreateRunResponse>
     */
    public SyncInvoker<CreateRunRequest, CreateRunResponse> createRunInvoker(CreateRunRequest request) {
        return new SyncInvoker<CreateRunRequest, CreateRunResponse>(request, IoTAnalyticsMeta.createRun, hcClient);
    }

    /**
     * 停止离线作业
     *
     * 停止提交中或运行中的离线作业，若作业已经执行结束或失败则无法停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRunRequest 请求对象
     * @return DeleteRunResponse
     */
    public DeleteRunResponse deleteRun(DeleteRunRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteRun);
    }

    /**
     * 停止离线作业
     *
     * 停止提交中或运行中的离线作业，若作业已经执行结束或失败则无法停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRunRequest 请求对象
     * @return SyncInvoker<DeleteRunRequest, DeleteRunResponse>
     */
    public SyncInvoker<DeleteRunRequest, DeleteRunResponse> deleteRunInvoker(DeleteRunRequest request) {
        return new SyncInvoker<DeleteRunRequest, DeleteRunResponse>(request, IoTAnalyticsMeta.deleteRun, hcClient);
    }

    /**
     * 查询离线作业运行列表
     *
     * 查询离线作业运行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRunsRequest 请求对象
     * @return ListRunsResponse
     */
    public ListRunsResponse listRuns(ListRunsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listRuns);
    }

    /**
     * 查询离线作业运行列表
     *
     * 查询离线作业运行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRunsRequest 请求对象
     * @return SyncInvoker<ListRunsRequest, ListRunsResponse>
     */
    public SyncInvoker<ListRunsRequest, ListRunsResponse> listRunsInvoker(ListRunsRequest request) {
        return new SyncInvoker<ListRunsRequest, ListRunsResponse>(request, IoTAnalyticsMeta.listRuns, hcClient);
    }

    /**
     * 查询离线作业运行详情
     *
     * 查询离线作业运行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRunRequest 请求对象
     * @return ShowRunResponse
     */
    public ShowRunResponse showRun(ShowRunRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showRun);
    }

    /**
     * 查询离线作业运行详情
     *
     * 查询离线作业运行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRunRequest 请求对象
     * @return SyncInvoker<ShowRunRequest, ShowRunResponse>
     */
    public SyncInvoker<ShowRunRequest, ShowRunResponse> showRunInvoker(ShowRunRequest request) {
        return new SyncInvoker<ShowRunRequest, ShowRunResponse>(request, IoTAnalyticsMeta.showRun, hcClient);
    }

    /**
     * 创建离线数据表
     *
     * 创建离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.createTable);
    }

    /**
     * 创建离线数据表
     *
     * 创建离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public SyncInvoker<CreateTableRequest, CreateTableResponse> createTableInvoker(CreateTableRequest request) {
        return new SyncInvoker<CreateTableRequest, CreateTableResponse>(request, IoTAnalyticsMeta.createTable,
            hcClient);
    }

    /**
     * 删除离线数据表
     *
     * 删除离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.deleteTable);
    }

    /**
     * 删除离线数据表
     *
     * 删除离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return SyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public SyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableInvoker(DeleteTableRequest request) {
        return new SyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, IoTAnalyticsMeta.deleteTable,
            hcClient);
    }

    /**
     * 查询离线数据表列表
     *
     * 查询离线数据表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.listTables);
    }

    /**
     * 查询离线数据表列表
     *
     * 查询离线数据表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return SyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public SyncInvoker<ListTablesRequest, ListTablesResponse> listTablesInvoker(ListTablesRequest request) {
        return new SyncInvoker<ListTablesRequest, ListTablesResponse>(request, IoTAnalyticsMeta.listTables, hcClient);
    }

    /**
     * 预览离线数据表内容
     *
     * 预览离线数据表内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTablePreviewRequest 请求对象
     * @return ShowTablePreviewResponse
     */
    public ShowTablePreviewResponse showTablePreview(ShowTablePreviewRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showTablePreview);
    }

    /**
     * 预览离线数据表内容
     *
     * 预览离线数据表内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTablePreviewRequest 请求对象
     * @return SyncInvoker<ShowTablePreviewRequest, ShowTablePreviewResponse>
     */
    public SyncInvoker<ShowTablePreviewRequest, ShowTablePreviewResponse> showTablePreviewInvoker(
        ShowTablePreviewRequest request) {
        return new SyncInvoker<ShowTablePreviewRequest, ShowTablePreviewResponse>(request,
            IoTAnalyticsMeta.showTablePreview, hcClient);
    }

    /**
     * 查询离线数据表结构
     *
     * 查询离线数据表结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableSchemaRequest 请求对象
     * @return ShowTableSchemaResponse
     */
    public ShowTableSchemaResponse showTableSchema(ShowTableSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, IoTAnalyticsMeta.showTableSchema);
    }

    /**
     * 查询离线数据表结构
     *
     * 查询离线数据表结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableSchemaRequest 请求对象
     * @return SyncInvoker<ShowTableSchemaRequest, ShowTableSchemaResponse>
     */
    public SyncInvoker<ShowTableSchemaRequest, ShowTableSchemaResponse> showTableSchemaInvoker(
        ShowTableSchemaRequest request) {
        return new SyncInvoker<ShowTableSchemaRequest, ShowTableSchemaResponse>(request,
            IoTAnalyticsMeta.showTableSchema, hcClient);
    }

}
