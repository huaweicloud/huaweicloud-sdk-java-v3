package com.huaweicloud.sdk.iotanalytics.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddDevDataRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddDevDataResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddPipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.AddPipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.AssetAddRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.AssetModRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.AssetModelAddRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.AssetModelModRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetModelRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetModelResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetNewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateAssetNewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateBatchJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateBatchJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateComputingResourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateComputingResourceRequestBody;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateComputingResourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateDatasourceReqDTO;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateDatasourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateDatasourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateRunRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateRunRequestBody;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateRunResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateStreamingJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateStreamingJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.CreateTableRequestBody;
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
import com.huaweicloud.sdk.iotanalytics.v1.model.GetHistoryRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.GetMetricsRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.GetMetricsValue;
import com.huaweicloud.sdk.iotanalytics.v1.model.GetPropertyRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ImportDataRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ImportDataRequestBody;
import com.huaweicloud.sdk.iotanalytics.v1.model.ImportDataResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.Job;
import com.huaweicloud.sdk.iotanalytics.v1.model.LastAssetPropertyValueRequest;
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
import com.huaweicloud.sdk.iotanalytics.v1.model.RawRequest;
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
import com.huaweicloud.sdk.iotanalytics.v1.model.StorageGroup;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetModelRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetModelResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetNewRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateAssetNewResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateBatchJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateBatchJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataSourceRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataSourceResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataStore;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataStoreRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDataStoreResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateDatasourceReqDTO;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateGroupRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateGroupResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdatePipelineJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdatePipelineJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateStreamingJobRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.UpdateStreamingJobResponse;
import com.huaweicloud.sdk.iotanalytics.v1.model.ValidateSqlRequest;
import com.huaweicloud.sdk.iotanalytics.v1.model.ValidateSqlRequestBody;
import com.huaweicloud.sdk.iotanalytics.v1.model.ValidateSqlResponse;

import java.util.Map;

@SuppressWarnings("unchecked")
public class IoTAnalyticsMeta {

    public static final HttpRequestDef<CreateAssetModelRequest, CreateAssetModelResponse> createAssetModel =
        genForCreateAssetModel();

    private static HttpRequestDef<CreateAssetModelRequest, CreateAssetModelResponse> genForCreateAssetModel() {
        // basic
        HttpRequestDef.Builder<CreateAssetModelRequest, CreateAssetModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetModelRequest.class, CreateAssetModelResponse.class)
                .withName("CreateAssetModel")
                .withUri("/v1/{project_id}/asset-models")
                .withContentType("application/json");

        // requests
        builder.<AssetModelAddRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetModelAddRequest.class),
            f -> f.withMarshaller(CreateAssetModelRequest::getBody, CreateAssetModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetModelRequest, DeleteAssetModelResponse> deleteAssetModel =
        genForDeleteAssetModel();

    private static HttpRequestDef<DeleteAssetModelRequest, DeleteAssetModelResponse> genForDeleteAssetModel() {
        // basic
        HttpRequestDef.Builder<DeleteAssetModelRequest, DeleteAssetModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetModelRequest.class, DeleteAssetModelResponse.class)
                .withName("DeleteAssetModel")
                .withUri("/v1/{project_id}/asset-models/{model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetModelRequest::getModelId, DeleteAssetModelRequest::setModelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetModelsRequest, ListAssetModelsResponse> listAssetModels =
        genForListAssetModels();

    private static HttpRequestDef<ListAssetModelsRequest, ListAssetModelsResponse> genForListAssetModels() {
        // basic
        HttpRequestDef.Builder<ListAssetModelsRequest, ListAssetModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetModelsRequest.class, ListAssetModelsResponse.class)
                .withName("ListAssetModels")
                .withUri("/v1/{project_id}/asset-models")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetModelsRequest::getFilter, ListAssetModelsRequest::setFilter));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetModelsRequest::getLimit, ListAssetModelsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetModelsRequest::getOffset, ListAssetModelsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetModelRequest, ShowAssetModelResponse> showAssetModel =
        genForShowAssetModel();

    private static HttpRequestDef<ShowAssetModelRequest, ShowAssetModelResponse> genForShowAssetModel() {
        // basic
        HttpRequestDef.Builder<ShowAssetModelRequest, ShowAssetModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetModelRequest.class, ShowAssetModelResponse.class)
                .withName("ShowAssetModel")
                .withUri("/v1/{project_id}/asset-models/{model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetModelRequest::getModelId, ShowAssetModelRequest::setModelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetModelRequest, UpdateAssetModelResponse> updateAssetModel =
        genForUpdateAssetModel();

    private static HttpRequestDef<UpdateAssetModelRequest, UpdateAssetModelResponse> genForUpdateAssetModel() {
        // basic
        HttpRequestDef.Builder<UpdateAssetModelRequest, UpdateAssetModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetModelRequest.class, UpdateAssetModelResponse.class)
                .withName("UpdateAssetModel")
                .withUri("/v1/{project_id}/asset-models/{model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetModelRequest::getModelId, UpdateAssetModelRequest::setModelId));
        builder.<AssetModelModRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetModelModRequest.class),
            f -> f.withMarshaller(UpdateAssetModelRequest::getBody, UpdateAssetModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetNewRequest, CreateAssetNewResponse> createAssetNew =
        genForCreateAssetNew();

    private static HttpRequestDef<CreateAssetNewRequest, CreateAssetNewResponse> genForCreateAssetNew() {
        // basic
        HttpRequestDef.Builder<CreateAssetNewRequest, CreateAssetNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetNewRequest.class, CreateAssetNewResponse.class)
                .withName("CreateAssetNew")
                .withUri("/v1/{project_id}/assets")
                .withContentType("application/json");

        // requests
        builder.<AssetAddRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetAddRequest.class),
            f -> f.withMarshaller(CreateAssetNewRequest::getBody, CreateAssetNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetNewRequest, DeleteAssetNewResponse> deleteAssetNew =
        genForDeleteAssetNew();

    private static HttpRequestDef<DeleteAssetNewRequest, DeleteAssetNewResponse> genForDeleteAssetNew() {
        // basic
        HttpRequestDef.Builder<DeleteAssetNewRequest, DeleteAssetNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetNewRequest.class, DeleteAssetNewResponse.class)
                .withName("DeleteAssetNew")
                .withUri("/v1/{project_id}/assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetNewRequest::getAssetId, DeleteAssetNewRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetsNewRequest, ListAssetsNewResponse> listAssetsNew =
        genForListAssetsNew();

    private static HttpRequestDef<ListAssetsNewRequest, ListAssetsNewResponse> genForListAssetsNew() {
        // basic
        HttpRequestDef.Builder<ListAssetsNewRequest, ListAssetsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetsNewRequest.class, ListAssetsNewResponse.class)
                .withName("ListAssetsNew")
                .withUri("/v1/{project_id}/assets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsNewRequest::getLimit, ListAssetsNewRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsNewRequest::getOffset, ListAssetsNewRequest::setOffset));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsNewRequest::getFilter, ListAssetsNewRequest::setFilter));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsNewRequest::getType, ListAssetsNewRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishRootAssetRequest, PublishRootAssetResponse> publishRootAsset =
        genForPublishRootAsset();

    private static HttpRequestDef<PublishRootAssetRequest, PublishRootAssetResponse> genForPublishRootAsset() {
        // basic
        HttpRequestDef.Builder<PublishRootAssetRequest, PublishRootAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishRootAssetRequest.class, PublishRootAssetResponse.class)
                .withName("PublishRootAsset")
                .withUri("/v1/{project_id}/assets/{root_asset_id}/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("root_asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishRootAssetRequest::getRootAssetId, PublishRootAssetRequest::setRootAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetNewRequest, ShowAssetNewResponse> showAssetNew = genForShowAssetNew();

    private static HttpRequestDef<ShowAssetNewRequest, ShowAssetNewResponse> genForShowAssetNew() {
        // basic
        HttpRequestDef.Builder<ShowAssetNewRequest, ShowAssetNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetNewRequest.class, ShowAssetNewResponse.class)
                .withName("ShowAssetNew")
                .withUri("/v1/{project_id}/assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetNewRequest::getAssetId, ShowAssetNewRequest::setAssetId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetNewRequest::getType, ShowAssetNewRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetNewRequest, UpdateAssetNewResponse> updateAssetNew =
        genForUpdateAssetNew();

    private static HttpRequestDef<UpdateAssetNewRequest, UpdateAssetNewResponse> genForUpdateAssetNew() {
        // basic
        HttpRequestDef.Builder<UpdateAssetNewRequest, UpdateAssetNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetNewRequest.class, UpdateAssetNewResponse.class)
                .withName("UpdateAssetNew")
                .withUri("/v1/{project_id}/assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetNewRequest::getAssetId, UpdateAssetNewRequest::setAssetId));
        builder.<AssetModRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetModRequest.class),
            f -> f.withMarshaller(UpdateAssetNewRequest::getBody, UpdateAssetNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse> showLastPropertyValue =
        genForShowLastPropertyValue();

    private static HttpRequestDef<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse> genForShowLastPropertyValue() {
        // basic
        HttpRequestDef.Builder<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowLastPropertyValueRequest.class, ShowLastPropertyValueResponse.class)
            .withName("ShowLastPropertyValue")
            .withUri("/v1/{project_id}/assets/{asset_id}/property-values/query-last")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLastPropertyValueRequest::getAssetId, ShowLastPropertyValueRequest::setAssetId));
        builder.<LastAssetPropertyValueRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LastAssetPropertyValueRequest.class),
            f -> f.withMarshaller(ShowLastPropertyValueRequest::getBody, ShowLastPropertyValueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricValueRequest, ShowMetricValueResponse> showMetricValue =
        genForShowMetricValue();

    private static HttpRequestDef<ShowMetricValueRequest, ShowMetricValueResponse> genForShowMetricValue() {
        // basic
        HttpRequestDef.Builder<ShowMetricValueRequest, ShowMetricValueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMetricValueRequest.class, ShowMetricValueResponse.class)
                .withName("ShowMetricValue")
                .withUri("/v1/{project_id}/assets/{asset_id}/metrics/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricValueRequest::getAssetId, ShowMetricValueRequest::setAssetId));
        builder.<GetMetricsValue>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetMetricsValue.class),
            f -> f.withMarshaller(ShowMetricValueRequest::getBody, ShowMetricValueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse> showPropertyRawValue =
        genForShowPropertyRawValue();

    private static HttpRequestDef<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse> genForShowPropertyRawValue() {
        // basic
        HttpRequestDef.Builder<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowPropertyRawValueRequest.class, ShowPropertyRawValueResponse.class)
            .withName("ShowPropertyRawValue")
            .withUri("/v1/{project_id}/assets/{asset_id}/property-values/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPropertyRawValueRequest::getAssetId, ShowPropertyRawValueRequest::setAssetId));
        builder.<RawRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RawRequest.class),
            f -> f.withMarshaller(ShowPropertyRawValueRequest::getBody, ShowPropertyRawValueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResource =
        genForCreateComputingResource();

    private static HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> genForCreateComputingResource() {
        // basic
        HttpRequestDef.Builder<CreateComputingResourceRequest, CreateComputingResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateComputingResourceRequest.class, CreateComputingResourceResponse.class)
            .withName("CreateComputingResource")
            .withUri("/v1/{project_id}/batch-computing-resources")
            .withContentType("application/json");

        // requests
        builder.<CreateComputingResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComputingResourceRequestBody.class),
            f -> f.withMarshaller(CreateComputingResourceRequest::getBody, CreateComputingResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResource =
        genForDeleteComputingResource();

    private static HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> genForDeleteComputingResource() {
        // basic
        HttpRequestDef.Builder<DeleteComputingResourceRequest, DeleteComputingResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteComputingResourceRequest.class, DeleteComputingResourceResponse.class)
            .withName("DeleteComputingResource")
            .withUri("/v1/{project_id}/batch-computing-resources/{computing_resource_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("computing_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComputingResourceRequest::getComputingResourceId,
                DeleteComputingResourceRequest::setComputingResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResources =
        genForListComputingResources();

    private static HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> genForListComputingResources() {
        // basic
        HttpRequestDef.Builder<ListComputingResourcesRequest, ListComputingResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComputingResourcesRequest.class, ListComputingResourcesResponse.class)
            .withName("ListComputingResources")
            .withUri("/v1/{project_id}/batch-computing-resources")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("computing_resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComputingResourcesRequest::getComputingResourceName,
                ListComputingResourcesRequest::setComputingResourceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComputingResourcesRequest::getOffset, ListComputingResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComputingResourcesRequest::getLimit, ListComputingResourcesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatasourceRequest, CreateDatasourceResponse> createDatasource =
        genForCreateDatasource();

    private static HttpRequestDef<CreateDatasourceRequest, CreateDatasourceResponse> genForCreateDatasource() {
        // basic
        HttpRequestDef.Builder<CreateDatasourceRequest, CreateDatasourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatasourceRequest.class, CreateDatasourceResponse.class)
                .withName("CreateDatasource")
                .withUri("/v1/{project_id}/datasources")
                .withContentType("application/json");

        // requests
        builder.<CreateDatasourceReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatasourceReqDTO.class),
            f -> f.withMarshaller(CreateDatasourceRequest::getBody, CreateDatasourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatasourceRequest, DeleteDatasourceResponse> deleteDatasource =
        genForDeleteDatasource();

    private static HttpRequestDef<DeleteDatasourceRequest, DeleteDatasourceResponse> genForDeleteDatasource() {
        // basic
        HttpRequestDef.Builder<DeleteDatasourceRequest, DeleteDatasourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatasourceRequest.class, DeleteDatasourceResponse.class)
                .withName("DeleteDatasource")
                .withUri("/v1/{project_id}/datasources/{datasource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatasourceRequest::getDatasourceId, DeleteDatasourceRequest::setDatasourceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDatasourceResponse::getBody, DeleteDatasourceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllDataSourceRequest, ShowAllDataSourceResponse> showAllDataSource =
        genForShowAllDataSource();

    private static HttpRequestDef<ShowAllDataSourceRequest, ShowAllDataSourceResponse> genForShowAllDataSource() {
        // basic
        HttpRequestDef.Builder<ShowAllDataSourceRequest, ShowAllDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAllDataSourceRequest.class, ShowAllDataSourceResponse.class)
                .withName("ShowAllDataSource")
                .withUri("/v1/{project_id}/datasources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllDataSourceRequest::getName, ShowAllDataSourceRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllDataSourceRequest::getType, ShowAllDataSourceRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllDataSourceRequest::getLimit, ShowAllDataSourceRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllDataSourceRequest::getOffset, ShowAllDataSourceRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataSourceRequest, ShowDataSourceResponse> showDataSource =
        genForShowDataSource();

    private static HttpRequestDef<ShowDataSourceRequest, ShowDataSourceResponse> genForShowDataSource() {
        // basic
        HttpRequestDef.Builder<ShowDataSourceRequest, ShowDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataSourceRequest.class, ShowDataSourceResponse.class)
                .withName("ShowDataSource")
                .withUri("/v1/{project_id}/datasources/{datasource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataSourceRequest::getDatasourceId, ShowDataSourceRequest::setDatasourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSource =
        genForUpdateDataSource();

    private static HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> genForUpdateDataSource() {
        // basic
        HttpRequestDef.Builder<UpdateDataSourceRequest, UpdateDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataSourceRequest.class, UpdateDataSourceResponse.class)
                .withName("UpdateDataSource")
                .withUri("/v1/{project_id}/datasources/{datasource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getDatasourceId, UpdateDataSourceRequest::setDatasourceId));
        builder.<UpdateDatasourceReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatasourceReqDTO.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getBody, UpdateDataSourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupRequest, CreateGroupResponse> createGroup = genForCreateGroup();

    private static HttpRequestDef<CreateGroupRequest, CreateGroupResponse> genForCreateGroup() {
        // basic
        HttpRequestDef.Builder<CreateGroupRequest, CreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGroupRequest.class, CreateGroupResponse.class)
                .withName("CreateGroup")
                .withUri("/v1/{project_id}/data-store-groups")
                .withContentType("application/json");

        // requests
        builder.<StorageGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StorageGroup.class),
            f -> f.withMarshaller(CreateGroupRequest::getBody, CreateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> deleteGroup = genForDeleteGroup();

    private static HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> genForDeleteGroup() {
        // basic
        HttpRequestDef.Builder<DeleteGroupRequest, DeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGroupRequest.class, DeleteGroupResponse.class)
                .withName("DeleteGroup")
                .withUri("/v1/{project_id}/data-store-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getGroupId, DeleteGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsRequest, ListGroupsResponse> listGroups = genForListGroups();

    private static HttpRequestDef<ListGroupsRequest, ListGroupsResponse> genForListGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupsRequest, ListGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupsRequest.class, ListGroupsResponse.class)
                .withName("ListGroups")
                .withUri("/v1/{project_id}/data-store-groups")
                .withContentType("application/json");

        // requests
        builder.<ListGroupsRequest.UnitEnum>withRequestField("unit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupsRequest.UnitEnum.class),
            f -> f.withMarshaller(ListGroupsRequest::getUnit, ListGroupsRequest::setUnit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getType, ListGroupsRequest::setType));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getGroupId, ListGroupsRequest::setGroupId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getName, ListGroupsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getOffset, ListGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getLimit, ListGroupsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupRequest, UpdateGroupResponse> updateGroup = genForUpdateGroup();

    private static HttpRequestDef<UpdateGroupRequest, UpdateGroupResponse> genForUpdateGroup() {
        // basic
        HttpRequestDef.Builder<UpdateGroupRequest, UpdateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGroupRequest.class, UpdateGroupResponse.class)
                .withName("UpdateGroup")
                .withUri("/v1/{project_id}/data-store-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGroupRequest::getGroupId, UpdateGroupRequest::setGroupId));
        builder.<StorageGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StorageGroup.class),
            f -> f.withMarshaller(UpdateGroupRequest::getBody, UpdateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataStoreRequest, DeleteDataStoreResponse> deleteDataStore =
        genForDeleteDataStore();

    private static HttpRequestDef<DeleteDataStoreRequest, DeleteDataStoreResponse> genForDeleteDataStore() {
        // basic
        HttpRequestDef.Builder<DeleteDataStoreRequest, DeleteDataStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataStoreRequest.class, DeleteDataStoreResponse.class)
                .withName("DeleteDataStore")
                .withUri("/v1/{project_id}/data-stores/{data_store_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataStoreRequest::getDataStoreId, DeleteDataStoreRequest::setDataStoreId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataStoresRequest, ListDataStoresResponse> listDataStores =
        genForListDataStores();

    private static HttpRequestDef<ListDataStoresRequest, ListDataStoresResponse> genForListDataStores() {
        // basic
        HttpRequestDef.Builder<ListDataStoresRequest, ListDataStoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataStoresRequest.class, ListDataStoresResponse.class)
                .withName("ListDataStores")
                .withUri("/v1/{project_id}/data-stores")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataStoresRequest::getGroupId, ListDataStoresRequest::setGroupId));
        builder.<String>withRequestField("data_store_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataStoresRequest::getDataStoreId, ListDataStoresRequest::setDataStoreId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataStoresRequest::getName, ListDataStoresRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataStoresRequest::getOffset, ListDataStoresRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataStoresRequest::getLimit, ListDataStoresRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataStoreRequest, UpdateDataStoreResponse> updateDataStore =
        genForUpdateDataStore();

    private static HttpRequestDef<UpdateDataStoreRequest, UpdateDataStoreResponse> genForUpdateDataStore() {
        // basic
        HttpRequestDef.Builder<UpdateDataStoreRequest, UpdateDataStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataStoreRequest.class, UpdateDataStoreResponse.class)
                .withName("UpdateDataStore")
                .withUri("/v1/{project_id}/data-stores/{data_store_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataStoreRequest::getDataStoreId, UpdateDataStoreRequest::setDataStoreId));
        builder.<UpdateDataStore>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDataStore.class),
            f -> f.withMarshaller(UpdateDataStoreRequest::getBody, UpdateDataStoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryRequest, ListHistoryResponse> listHistory = genForListHistory();

    private static HttpRequestDef<ListHistoryRequest, ListHistoryResponse> genForListHistory() {
        // basic
        HttpRequestDef.Builder<ListHistoryRequest, ListHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListHistoryRequest.class, ListHistoryResponse.class)
                .withName("ListHistory")
                .withUri("/v1/{project_id}/data-stores/{data_store_id}/property-values/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryRequest::getDataStoreId, ListHistoryRequest::setDataStoreId));
        builder.<GetHistoryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetHistoryRequest.class),
            f -> f.withMarshaller(ListHistoryRequest::getBody, ListHistoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForListMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForListMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListMetricsRequest.class, ListMetricsResponse.class)
                .withName("ListMetrics")
                .withUri("/v1/{project_id}/data-stores/{data_store_id}/metrics/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getDataStoreId, ListMetricsRequest::setDataStoreId));
        builder.<GetMetricsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetMetricsRequest.class),
            f -> f.withMarshaller(ListMetricsRequest::getBody, ListMetricsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPropertyValuesRequest, ShowPropertyValuesResponse> showPropertyValues =
        genForShowPropertyValues();

    private static HttpRequestDef<ShowPropertyValuesRequest, ShowPropertyValuesResponse> genForShowPropertyValues() {
        // basic
        HttpRequestDef.Builder<ShowPropertyValuesRequest, ShowPropertyValuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPropertyValuesRequest.class, ShowPropertyValuesResponse.class)
                .withName("ShowPropertyValues")
                .withUri("/v1/{project_id}/data-stores/{data_store_id}/property-values/query-last")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPropertyValuesRequest::getDataStoreId,
                ShowPropertyValuesRequest::setDataStoreId));
        builder.<GetPropertyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetPropertyRequest.class),
            f -> f.withMarshaller(ShowPropertyValuesRequest::getBody, ShowPropertyValuesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagValuesRequest, ListTagValuesResponse> listTagValues =
        genForListTagValues();

    private static HttpRequestDef<ListTagValuesRequest, ListTagValuesResponse> genForListTagValues() {
        // basic
        HttpRequestDef.Builder<ListTagValuesRequest, ListTagValuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagValuesRequest.class, ListTagValuesResponse.class)
                .withName("ListTagValues")
                .withUri("/v1/{project_id}/data-stores/{data_store_id}/tags/{tag_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getDataStoreId, ListTagValuesRequest::setDataStoreId));
        builder.<String>withRequestField("tag_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getTagName, ListTagValuesRequest::setTagName));
        builder.<String>withRequestField("filters",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getFilters, ListTagValuesRequest::setFilters));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagValuesRequest::getOffset, ListTagValuesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagValuesRequest::getLimit, ListTagValuesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDatasetRequest, ExportDatasetResponse> exportDataset =
        genForExportDataset();

    private static HttpRequestDef<ExportDatasetRequest, ExportDatasetResponse> genForExportDataset() {
        // basic
        HttpRequestDef.Builder<ExportDatasetRequest, ExportDatasetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportDatasetRequest.class, ExportDatasetResponse.class)
                .withName("ExportDataset")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}/runs/{run_id}/export-dataset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDatasetRequest::getJobId, ExportDatasetRequest::setJobId));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDatasetRequest::getRunId, ExportDatasetRequest::setRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDataRequest, ImportDataResponse> importData = genForImportData();

    private static HttpRequestDef<ImportDataRequest, ImportDataResponse> genForImportData() {
        // basic
        HttpRequestDef.Builder<ImportDataRequest, ImportDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportDataRequest.class, ImportDataResponse.class)
                .withName("ImportData")
                .withUri("/v1/{project_id}/batch/jobs/import/runs")
                .withContentType("application/json");

        // requests
        builder.<ImportDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportDataRequestBody.class),
            f -> f.withMarshaller(ImportDataRequest::getBody, ImportDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatasetRequest, ShowDatasetResponse> showDataset = genForShowDataset();

    private static HttpRequestDef<ShowDatasetRequest, ShowDatasetResponse> genForShowDataset() {
        // basic
        HttpRequestDef.Builder<ShowDatasetRequest, ShowDatasetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDatasetRequest.class, ShowDatasetResponse.class)
                .withName("ShowDataset")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}/runs/{run_id}/query-dataset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetRequest::getJobId, ShowDatasetRequest::setJobId));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetRequest::getRunId, ShowDatasetRequest::setRunId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDatasetRequest::getOffset, ShowDatasetRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDatasetRequest::getLimit, ShowDatasetRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateSqlRequest, ValidateSqlResponse> validateSql = genForValidateSql();

    private static HttpRequestDef<ValidateSqlRequest, ValidateSqlResponse> genForValidateSql() {
        // basic
        HttpRequestDef.Builder<ValidateSqlRequest, ValidateSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateSqlRequest.class, ValidateSqlResponse.class)
                .withName("ValidateSql")
                .withUri("/v1/{project_id}/batch/validate-sql")
                .withContentType("application/json");

        // requests
        builder.<ValidateSqlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateSqlRequestBody.class),
            f -> f.withMarshaller(ValidateSqlRequest::getBody, ValidateSqlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDevDataRequest, AddDevDataResponse> addDevData = genForAddDevData();

    private static HttpRequestDef<AddDevDataRequest, AddDevDataResponse> genForAddDevData() {
        // basic
        HttpRequestDef.Builder<AddDevDataRequest, AddDevDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDevDataRequest.class, AddDevDataResponse.class)
                .withName("AddDevData")
                .withUri("/v1/{project_id}/datasources/{datasource_id}/dev-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDevDataRequest::getDatasourceId, AddDevDataRequest::setDatasourceId));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(AddDevDataRequest::getBody, AddDevDataRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDevDataResponse::getBody, AddDevDataResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJob =
        genForCreateBatchJob();

    private static HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> genForCreateBatchJob() {
        // basic
        HttpRequestDef.Builder<CreateBatchJobRequest, CreateBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBatchJobRequest.class, CreateBatchJobResponse.class)
                .withName("CreateBatchJob")
                .withUri("/v1/{project_id}/batch/jobs")
                .withContentType("application/json");

        // requests
        builder.<Job>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Job.class),
            f -> f.withMarshaller(CreateBatchJobRequest::getBody, CreateBatchJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJob =
        genForDeleteBatchJob();

    private static HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> genForDeleteBatchJob() {
        // basic
        HttpRequestDef.Builder<DeleteBatchJobRequest, DeleteBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBatchJobRequest.class, DeleteBatchJobResponse.class)
                .withName("DeleteBatchJob")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchJobRequest::getJobId, DeleteBatchJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchJobsRequest, ListBatchJobsResponse> listBatchJobs =
        genForListBatchJobs();

    private static HttpRequestDef<ListBatchJobsRequest, ListBatchJobsResponse> genForListBatchJobs() {
        // basic
        HttpRequestDef.Builder<ListBatchJobsRequest, ListBatchJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchJobsRequest.class, ListBatchJobsResponse.class)
                .withName("ListBatchJobs")
                .withUri("/v1/{project_id}/batch/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getOffset, ListBatchJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getLimit, ListBatchJobsRequest::setLimit));
        builder.<Boolean>withRequestField("has_schedule",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getHasSchedule, ListBatchJobsRequest::setHasSchedule));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getJobName, ListBatchJobsRequest::setJobName));
        builder.<String>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getScheduleStatus, ListBatchJobsRequest::setScheduleStatus));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getOrderBy, ListBatchJobsRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getOrder, ListBatchJobsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJob = genForShowBatchJob();

    private static HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> genForShowBatchJob() {
        // basic
        HttpRequestDef.Builder<ShowBatchJobRequest, ShowBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchJobRequest.class, ShowBatchJobResponse.class)
                .withName("ShowBatchJob")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchJobRequest::getJobId, ShowBatchJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchJobRequest, UpdateBatchJobResponse> updateBatchJob =
        genForUpdateBatchJob();

    private static HttpRequestDef<UpdateBatchJobRequest, UpdateBatchJobResponse> genForUpdateBatchJob() {
        // basic
        HttpRequestDef.Builder<UpdateBatchJobRequest, UpdateBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBatchJobRequest.class, UpdateBatchJobResponse.class)
                .withName("UpdateBatchJob")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchJobRequest::getJobId, UpdateBatchJobRequest::setJobId));
        builder.<Job>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Job.class),
            f -> f.withMarshaller(UpdateBatchJobRequest::getBody, UpdateBatchJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPipelineJobRequest, AddPipelineJobResponse> addPipelineJob =
        genForAddPipelineJob();

    private static HttpRequestDef<AddPipelineJobRequest, AddPipelineJobResponse> genForAddPipelineJob() {
        // basic
        HttpRequestDef.Builder<AddPipelineJobRequest, AddPipelineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddPipelineJobRequest.class, AddPipelineJobResponse.class)
                .withName("AddPipelineJob")
                .withUri("/v1/{project_id}/pipelines")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("check",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(AddPipelineJobRequest::getCheck, AddPipelineJobRequest::setCheck));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AddPipelineJobRequest::getBody, AddPipelineJobRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineJobRequest, DeletePipelineJobResponse> deletePipelineJob =
        genForDeletePipelineJob();

    private static HttpRequestDef<DeletePipelineJobRequest, DeletePipelineJobResponse> genForDeletePipelineJob() {
        // basic
        HttpRequestDef.Builder<DeletePipelineJobRequest, DeletePipelineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePipelineJobRequest.class, DeletePipelineJobResponse.class)
                .withName("DeletePipelineJob")
                .withUri("/v1/{project_id}/pipelines/{pipeline_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineJobRequest::getPipelineId, DeletePipelineJobRequest::setPipelineId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePipelineJobResponse::getBody, DeletePipelineJobResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineJobsRequest, ListPipelineJobsResponse> listPipelineJobs =
        genForListPipelineJobs();

    private static HttpRequestDef<ListPipelineJobsRequest, ListPipelineJobsResponse> genForListPipelineJobs() {
        // basic
        HttpRequestDef.Builder<ListPipelineJobsRequest, ListPipelineJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPipelineJobsRequest.class, ListPipelineJobsResponse.class)
                .withName("ListPipelineJobs")
                .withUri("/v1/{project_id}/pipelines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_store_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getDataStoreId, ListPipelineJobsRequest::setDataStoreId));
        builder.<String>withRequestField("data_store_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getDataStoreGroupId,
                ListPipelineJobsRequest::setDataStoreGroupId));
        builder.<String>withRequestField("data_source_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getDataSourceId, ListPipelineJobsRequest::setDataSourceId));
        builder.<String>withRequestField("pipeline_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getPipelineName, ListPipelineJobsRequest::setPipelineName));
        builder.<String>withRequestField("operator_class_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getOperatorClassName,
                ListPipelineJobsRequest::setOperatorClassName));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getOffset, ListPipelineJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getLimit, ListPipelineJobsRequest::setLimit));
        builder.<Boolean>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getSyncStatus, ListPipelineJobsRequest::setSyncStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineJobRequest, ShowPipelineJobResponse> showPipelineJob =
        genForShowPipelineJob();

    private static HttpRequestDef<ShowPipelineJobRequest, ShowPipelineJobResponse> genForShowPipelineJob() {
        // basic
        HttpRequestDef.Builder<ShowPipelineJobRequest, ShowPipelineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipelineJobRequest.class, ShowPipelineJobResponse.class)
                .withName("ShowPipelineJob")
                .withUri("/v1/{project_id}/pipelines/{pipeline_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineJobRequest::getPipelineId, ShowPipelineJobRequest::setPipelineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPipelineJobRequest, StartPipelineJobResponse> startPipelineJob =
        genForStartPipelineJob();

    private static HttpRequestDef<StartPipelineJobRequest, StartPipelineJobResponse> genForStartPipelineJob() {
        // basic
        HttpRequestDef.Builder<StartPipelineJobRequest, StartPipelineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartPipelineJobRequest.class, StartPipelineJobResponse.class)
                .withName("StartPipelineJob")
                .withUri("/v1/{project_id}/pipelines/{pipeline_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPipelineJobRequest::getPipelineId, StartPipelineJobRequest::setPipelineId));
        builder.<Integer>withRequestField("parallel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartPipelineJobRequest::getParallel, StartPipelineJobRequest::setParallel));
        builder.<Integer>withRequestField("rtu",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartPipelineJobRequest::getRtu, StartPipelineJobRequest::setRtu));
        builder.<Boolean>withRequestField("resume_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StartPipelineJobRequest::getResumeSavepoint,
                StartPipelineJobRequest::setResumeSavepoint));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineJobRequest, StopPipelineJobResponse> stopPipelineJob =
        genForStopPipelineJob();

    private static HttpRequestDef<StopPipelineJobRequest, StopPipelineJobResponse> genForStopPipelineJob() {
        // basic
        HttpRequestDef.Builder<StopPipelineJobRequest, StopPipelineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopPipelineJobRequest.class, StopPipelineJobResponse.class)
                .withName("StopPipelineJob")
                .withUri("/v1/{project_id}/pipelines/{pipeline_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineJobRequest::getPipelineId, StopPipelineJobRequest::setPipelineId));
        builder.<Boolean>withRequestField("trigger_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StopPipelineJobRequest::getTriggerSavepoint,
                StopPipelineJobRequest::setTriggerSavepoint));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipelineJobRequest, UpdatePipelineJobResponse> updatePipelineJob =
        genForUpdatePipelineJob();

    private static HttpRequestDef<UpdatePipelineJobRequest, UpdatePipelineJobResponse> genForUpdatePipelineJob() {
        // basic
        HttpRequestDef.Builder<UpdatePipelineJobRequest, UpdatePipelineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePipelineJobRequest.class, UpdatePipelineJobResponse.class)
                .withName("UpdatePipelineJob")
                .withUri("/v1/{project_id}/pipelines/{pipeline_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineJobRequest::getPipelineId, UpdatePipelineJobRequest::setPipelineId));
        builder.<Boolean>withRequestField("check",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UpdatePipelineJobRequest::getCheck, UpdatePipelineJobRequest::setCheck));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(UpdatePipelineJobRequest::getBody, UpdatePipelineJobRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamingJobRequest, CreateStreamingJobResponse> createStreamingJob =
        genForCreateStreamingJob();

    private static HttpRequestDef<CreateStreamingJobRequest, CreateStreamingJobResponse> genForCreateStreamingJob() {
        // basic
        HttpRequestDef.Builder<CreateStreamingJobRequest, CreateStreamingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStreamingJobRequest.class, CreateStreamingJobResponse.class)
                .withName("CreateStreamingJob")
                .withUri("/v1/{project_id}/streaming/jobs")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("check",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CreateStreamingJobRequest::getCheck, CreateStreamingJobRequest::setCheck));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(CreateStreamingJobRequest::getBody, CreateStreamingJobRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse> deleteStreamingJobById =
        genForDeleteStreamingJobById();

    private static HttpRequestDef<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse> genForDeleteStreamingJobById() {
        // basic
        HttpRequestDef.Builder<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStreamingJobByIdRequest.class, DeleteStreamingJobByIdResponse.class)
            .withName("DeleteStreamingJobById")
            .withUri("/v1/{project_id}/streaming/jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamingJobByIdRequest::getJobId, DeleteStreamingJobByIdRequest::setJobId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteStreamingJobByIdResponse::getBody, DeleteStreamingJobByIdResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobByIdRequest, ShowJobByIdResponse> showJobById = genForShowJobById();

    private static HttpRequestDef<ShowJobByIdRequest, ShowJobByIdResponse> genForShowJobById() {
        // basic
        HttpRequestDef.Builder<ShowJobByIdRequest, ShowJobByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobByIdRequest.class, ShowJobByIdResponse.class)
                .withName("ShowJobById")
                .withUri("/v1/{project_id}/streaming/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobByIdRequest::getJobId, ShowJobByIdRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobsRequest, ShowJobsResponse> showJobs = genForShowJobs();

    private static HttpRequestDef<ShowJobsRequest, ShowJobsResponse> genForShowJobs() {
        // basic
        HttpRequestDef.Builder<ShowJobsRequest, ShowJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobsRequest.class, ShowJobsResponse.class)
                .withName("ShowJobs")
                .withUri("/v1/{project_id}/streaming/jobs")
                .withContentType("application/json");

        // requests
        builder.<ShowJobsRequest.JobInputTypeEnum>withRequestField("job_input_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobsRequest.JobInputTypeEnum.class),
            f -> f.withMarshaller(ShowJobsRequest::getJobInputType, ShowJobsRequest::setJobInputType));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobsRequest::getOffset, ShowJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobsRequest::getLimit, ShowJobsRequest::setLimit));
        builder.<Boolean>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowJobsRequest::getSyncStatus, ShowJobsRequest::setSyncStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamingJobRequest, UpdateStreamingJobResponse> updateStreamingJob =
        genForUpdateStreamingJob();

    private static HttpRequestDef<UpdateStreamingJobRequest, UpdateStreamingJobResponse> genForUpdateStreamingJob() {
        // basic
        HttpRequestDef.Builder<UpdateStreamingJobRequest, UpdateStreamingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStreamingJobRequest.class, UpdateStreamingJobResponse.class)
                .withName("UpdateStreamingJob")
                .withUri("/v1/{project_id}/streaming/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStreamingJobRequest::getJobId, UpdateStreamingJobRequest::setJobId));
        builder.<Boolean>withRequestField("check",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UpdateStreamingJobRequest::getCheck, UpdateStreamingJobRequest::setCheck));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(UpdateStreamingJobRequest::getBody, UpdateStreamingJobRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartJobRequest, StartJobResponse> startJob = genForStartJob();

    private static HttpRequestDef<StartJobRequest, StartJobResponse> genForStartJob() {
        // basic
        HttpRequestDef.Builder<StartJobRequest, StartJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartJobRequest.class, StartJobResponse.class)
                .withName("StartJob")
                .withUri("/v1/{project_id}/streaming/jobs/{job_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getJobId, StartJobRequest::setJobId));
        builder.<Integer>withRequestField("parallel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartJobRequest::getParallel, StartJobRequest::setParallel));
        builder.<Integer>withRequestField("rtu",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartJobRequest::getRtu, StartJobRequest::setRtu));
        builder.<Boolean>withRequestField("resume_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StartJobRequest::getResumeSavepoint, StartJobRequest::setResumeSavepoint));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForStopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForStopJob() {
        // basic
        HttpRequestDef.Builder<StopJobRequest, StopJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopJobRequest.class, StopJobResponse.class)
                .withName("StopJob")
                .withUri("/v1/{project_id}/streaming/jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getJobId, StopJobRequest::setJobId));
        builder.<Boolean>withRequestField("trigger_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StopJobRequest::getTriggerSavepoint, StopJobRequest::setTriggerSavepoint));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRunRequest, CreateRunResponse> createRun = genForCreateRun();

    private static HttpRequestDef<CreateRunRequest, CreateRunResponse> genForCreateRun() {
        // basic
        HttpRequestDef.Builder<CreateRunRequest, CreateRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRunRequest.class, CreateRunResponse.class)
                .withName("CreateRun")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}/runs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRunRequest::getJobId, CreateRunRequest::setJobId));
        builder.<CreateRunRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRunRequestBody.class),
            f -> f.withMarshaller(CreateRunRequest::getBody, CreateRunRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRunRequest, DeleteRunResponse> deleteRun = genForDeleteRun();

    private static HttpRequestDef<DeleteRunRequest, DeleteRunResponse> genForDeleteRun() {
        // basic
        HttpRequestDef.Builder<DeleteRunRequest, DeleteRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRunRequest.class, DeleteRunResponse.class)
                .withName("DeleteRun")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}/runs/{run_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRunRequest::getJobId, DeleteRunRequest::setJobId));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRunRequest::getRunId, DeleteRunRequest::setRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRunsRequest, ListRunsResponse> listRuns = genForListRuns();

    private static HttpRequestDef<ListRunsRequest, ListRunsResponse> genForListRuns() {
        // basic
        HttpRequestDef.Builder<ListRunsRequest, ListRunsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRunsRequest.class, ListRunsResponse.class)
                .withName("ListRuns")
                .withUri("/v1/{project_id}/batch/jobs/runs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRunsRequest::getOffset, ListRunsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRunsRequest::getLimit, ListRunsRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getStartTime, ListRunsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getEndTime, ListRunsRequest::setEndTime));
        builder.<String>withRequestField("sql_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getSqlPattern, ListRunsRequest::setSqlPattern));
        builder.<String>withRequestField("sql_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getSqlType, ListRunsRequest::setSqlType));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getJobType, ListRunsRequest::setJobType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getStatus, ListRunsRequest::setStatus));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getOrderBy, ListRunsRequest::setOrderBy));
        builder.<ListRunsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRunsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListRunsRequest::getOrder, ListRunsRequest::setOrder));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getJobName, ListRunsRequest::setJobName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRunRequest, ShowRunResponse> showRun = genForShowRun();

    private static HttpRequestDef<ShowRunRequest, ShowRunResponse> genForShowRun() {
        // basic
        HttpRequestDef.Builder<ShowRunRequest, ShowRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRunRequest.class, ShowRunResponse.class)
                .withName("ShowRun")
                .withUri("/v1/{project_id}/batch/jobs/{job_id}/runs/{run_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRunRequest::getJobId, ShowRunRequest::setJobId));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRunRequest::getRunId, ShowRunRequest::setRunId));
        builder.<Boolean>withRequestField("with_details",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRunRequest::getWithDetails, ShowRunRequest::setWithDetails));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForCreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForCreateTable() {
        // basic
        HttpRequestDef.Builder<CreateTableRequest, CreateTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTableRequest.class, CreateTableResponse.class)
                .withName("CreateTable")
                .withUri("/v1/{project_id}/tables")
                .withContentType("application/json");

        // requests
        builder.<CreateTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTableRequestBody.class),
            f -> f.withMarshaller(CreateTableRequest::getBody, CreateTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genForDeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genForDeleteTable() {
        // basic
        HttpRequestDef.Builder<DeleteTableRequest, DeleteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTableRequest.class, DeleteTableResponse.class)
                .withName("DeleteTable")
                .withUri("/v1/{project_id}/tables/{table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getTableId, DeleteTableRequest::setTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesRequest, ListTablesResponse> listTables = genForListTables();

    private static HttpRequestDef<ListTablesRequest, ListTablesResponse> genForListTables() {
        // basic
        HttpRequestDef.Builder<ListTablesRequest, ListTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablesRequest.class, ListTablesResponse.class)
                .withName("ListTables")
                .withUri("/v1/{project_id}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getKeyword, ListTablesRequest::setKeyword));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTag, ListTablesRequest::setTag));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getOffset, ListTablesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getLimit, ListTablesRequest::setLimit));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getOrderBy, ListTablesRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getOrder, ListTablesRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTablePreviewRequest, ShowTablePreviewResponse> showTablePreview =
        genForShowTablePreview();

    private static HttpRequestDef<ShowTablePreviewRequest, ShowTablePreviewResponse> genForShowTablePreview() {
        // basic
        HttpRequestDef.Builder<ShowTablePreviewRequest, ShowTablePreviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTablePreviewRequest.class, ShowTablePreviewResponse.class)
                .withName("ShowTablePreview")
                .withUri("/v1/{project_id}/tables/{table_id}/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTablePreviewRequest::getTableId, ShowTablePreviewRequest::setTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableSchemaRequest, ShowTableSchemaResponse> showTableSchema =
        genForShowTableSchema();

    private static HttpRequestDef<ShowTableSchemaRequest, ShowTableSchemaResponse> genForShowTableSchema() {
        // basic
        HttpRequestDef.Builder<ShowTableSchemaRequest, ShowTableSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTableSchemaRequest.class, ShowTableSchemaResponse.class)
                .withName("ShowTableSchema")
                .withUri("/v1/{project_id}/tables/{table_id}/schema")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableSchemaRequest::getTableId, ShowTableSchemaRequest::setTableId));

        // response

        return builder.build();
    }

}
