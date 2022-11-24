package com.huaweicloud.sdk.iotanalytics.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotanalytics.v1.model.*;

import java.util.Map;

@SuppressWarnings("unchecked")
public class IoTAnalyticsMeta {

    public static final HttpRequestDef<CreateAssetModelRequest, CreateAssetModelResponse> createAssetModel =
        genForcreateAssetModel();

    private static HttpRequestDef<CreateAssetModelRequest, CreateAssetModelResponse> genForcreateAssetModel() {
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
            f -> f.withMarshaller(CreateAssetModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetModelRequest, DeleteAssetModelResponse> deleteAssetModel =
        genFordeleteAssetModel();

    private static HttpRequestDef<DeleteAssetModelRequest, DeleteAssetModelResponse> genFordeleteAssetModel() {
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
            f -> f.withMarshaller(DeleteAssetModelRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetModelsRequest, ListAssetModelsResponse> listAssetModels =
        genForlistAssetModels();

    private static HttpRequestDef<ListAssetModelsRequest, ListAssetModelsResponse> genForlistAssetModels() {
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
            f -> f.withMarshaller(ListAssetModelsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetModelsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetModelsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetModelRequest, ShowAssetModelResponse> showAssetModel =
        genForshowAssetModel();

    private static HttpRequestDef<ShowAssetModelRequest, ShowAssetModelResponse> genForshowAssetModel() {
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
            f -> f.withMarshaller(ShowAssetModelRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetModelRequest, UpdateAssetModelResponse> updateAssetModel =
        genForupdateAssetModel();

    private static HttpRequestDef<UpdateAssetModelRequest, UpdateAssetModelResponse> genForupdateAssetModel() {
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
            f -> f.withMarshaller(UpdateAssetModelRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));
        builder.<AssetModelModRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetModelModRequest.class),
            f -> f.withMarshaller(UpdateAssetModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetNewRequest, CreateAssetNewResponse> createAssetNew =
        genForcreateAssetNew();

    private static HttpRequestDef<CreateAssetNewRequest, CreateAssetNewResponse> genForcreateAssetNew() {
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
            f -> f.withMarshaller(CreateAssetNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetNewRequest, DeleteAssetNewResponse> deleteAssetNew =
        genFordeleteAssetNew();

    private static HttpRequestDef<DeleteAssetNewRequest, DeleteAssetNewResponse> genFordeleteAssetNew() {
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
            f -> f.withMarshaller(DeleteAssetNewRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetsNewRequest, ListAssetsNewResponse> listAssetsNew =
        genForlistAssetsNew();

    private static HttpRequestDef<ListAssetsNewRequest, ListAssetsNewResponse> genForlistAssetsNew() {
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
            f -> f.withMarshaller(ListAssetsNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsNewRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsNewRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishRootAssetRequest, PublishRootAssetResponse> publishRootAsset =
        genForpublishRootAsset();

    private static HttpRequestDef<PublishRootAssetRequest, PublishRootAssetResponse> genForpublishRootAsset() {
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
            f -> f.withMarshaller(PublishRootAssetRequest::getRootAssetId, (req, v) -> {
                req.setRootAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetNewRequest, ShowAssetNewResponse> showAssetNew = genForshowAssetNew();

    private static HttpRequestDef<ShowAssetNewRequest, ShowAssetNewResponse> genForshowAssetNew() {
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
            f -> f.withMarshaller(ShowAssetNewRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetNewRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetNewRequest, UpdateAssetNewResponse> updateAssetNew =
        genForupdateAssetNew();

    private static HttpRequestDef<UpdateAssetNewRequest, UpdateAssetNewResponse> genForupdateAssetNew() {
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
            f -> f.withMarshaller(UpdateAssetNewRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<AssetModRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetModRequest.class),
            f -> f.withMarshaller(UpdateAssetNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse> showLastPropertyValue =
        genForshowLastPropertyValue();

    private static HttpRequestDef<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse> genForshowLastPropertyValue() {
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
            f -> f.withMarshaller(ShowLastPropertyValueRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<LastAssetPropertyValueRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LastAssetPropertyValueRequest.class),
            f -> f.withMarshaller(ShowLastPropertyValueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricValueRequest, ShowMetricValueResponse> showMetricValue =
        genForshowMetricValue();

    private static HttpRequestDef<ShowMetricValueRequest, ShowMetricValueResponse> genForshowMetricValue() {
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
            f -> f.withMarshaller(ShowMetricValueRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<GetMetricsValue>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetMetricsValue.class),
            f -> f.withMarshaller(ShowMetricValueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse> showPropertyRawValue =
        genForshowPropertyRawValue();

    private static HttpRequestDef<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse> genForshowPropertyRawValue() {
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
            f -> f.withMarshaller(ShowPropertyRawValueRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<RawRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RawRequest.class),
            f -> f.withMarshaller(ShowPropertyRawValueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResource =
        genForcreateComputingResource();

    private static HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> genForcreateComputingResource() {
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
            f -> f.withMarshaller(CreateComputingResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResource =
        genFordeleteComputingResource();

    private static HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> genFordeleteComputingResource() {
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
            f -> f.withMarshaller(DeleteComputingResourceRequest::getComputingResourceId, (req, v) -> {
                req.setComputingResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResources =
        genForlistComputingResources();

    private static HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> genForlistComputingResources() {
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
            f -> f.withMarshaller(ListComputingResourcesRequest::getComputingResourceName, (req, v) -> {
                req.setComputingResourceName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComputingResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComputingResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatasourceRequest, CreateDatasourceResponse> createDatasource =
        genForcreateDatasource();

    private static HttpRequestDef<CreateDatasourceRequest, CreateDatasourceResponse> genForcreateDatasource() {
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
            f -> f.withMarshaller(CreateDatasourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatasourceRequest, DeleteDatasourceResponse> deleteDatasource =
        genFordeleteDatasource();

    private static HttpRequestDef<DeleteDatasourceRequest, DeleteDatasourceResponse> genFordeleteDatasource() {
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
            f -> f.withMarshaller(DeleteDatasourceRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDatasourceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllDataSourceRequest, ShowAllDataSourceResponse> showAllDataSource =
        genForshowAllDataSource();

    private static HttpRequestDef<ShowAllDataSourceRequest, ShowAllDataSourceResponse> genForshowAllDataSource() {
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
            f -> f.withMarshaller(ShowAllDataSourceRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllDataSourceRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllDataSourceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllDataSourceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataSourceRequest, ShowDataSourceResponse> showDataSource =
        genForshowDataSource();

    private static HttpRequestDef<ShowDataSourceRequest, ShowDataSourceResponse> genForshowDataSource() {
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
            f -> f.withMarshaller(ShowDataSourceRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSource =
        genForupdateDataSource();

    private static HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> genForupdateDataSource() {
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
            f -> f.withMarshaller(UpdateDataSourceRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));
        builder.<UpdateDatasourceReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatasourceReqDTO.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupRequest, CreateGroupResponse> createGroup = genForcreateGroup();

    private static HttpRequestDef<CreateGroupRequest, CreateGroupResponse> genForcreateGroup() {
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
            f -> f.withMarshaller(CreateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> deleteGroup = genFordeleteGroup();

    private static HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> genFordeleteGroup() {
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
            f -> f.withMarshaller(DeleteGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsRequest, ListGroupsResponse> listGroups = genForlistGroups();

    private static HttpRequestDef<ListGroupsRequest, ListGroupsResponse> genForlistGroups() {
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
            f -> f.withMarshaller(ListGroupsRequest::getUnit, (req, v) -> {
                req.setUnit(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupRequest, UpdateGroupResponse> updateGroup = genForupdateGroup();

    private static HttpRequestDef<UpdateGroupRequest, UpdateGroupResponse> genForupdateGroup() {
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
            f -> f.withMarshaller(UpdateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<StorageGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StorageGroup.class),
            f -> f.withMarshaller(UpdateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataStoreRequest, DeleteDataStoreResponse> deleteDataStore =
        genFordeleteDataStore();

    private static HttpRequestDef<DeleteDataStoreRequest, DeleteDataStoreResponse> genFordeleteDataStore() {
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
            f -> f.withMarshaller(DeleteDataStoreRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataStoresRequest, ListDataStoresResponse> listDataStores =
        genForlistDataStores();

    private static HttpRequestDef<ListDataStoresRequest, ListDataStoresResponse> genForlistDataStores() {
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
            f -> f.withMarshaller(ListDataStoresRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("data_store_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataStoresRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataStoresRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataStoresRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataStoresRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataStoreRequest, UpdateDataStoreResponse> updateDataStore =
        genForupdateDataStore();

    private static HttpRequestDef<UpdateDataStoreRequest, UpdateDataStoreResponse> genForupdateDataStore() {
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
            f -> f.withMarshaller(UpdateDataStoreRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));
        builder.<UpdateDataStore>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDataStore.class),
            f -> f.withMarshaller(UpdateDataStoreRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryRequest, ListHistoryResponse> listHistory = genForlistHistory();

    private static HttpRequestDef<ListHistoryRequest, ListHistoryResponse> genForlistHistory() {
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
            f -> f.withMarshaller(ListHistoryRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));
        builder.<GetHistoryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetHistoryRequest.class),
            f -> f.withMarshaller(ListHistoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForlistMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForlistMetrics() {
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
            f -> f.withMarshaller(ListMetricsRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));
        builder.<GetMetricsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetMetricsRequest.class),
            f -> f.withMarshaller(ListMetricsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPropertyValuesRequest, ShowPropertyValuesResponse> showPropertyValues =
        genForshowPropertyValues();

    private static HttpRequestDef<ShowPropertyValuesRequest, ShowPropertyValuesResponse> genForshowPropertyValues() {
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
            f -> f.withMarshaller(ShowPropertyValuesRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));
        builder.<GetPropertyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetPropertyRequest.class),
            f -> f.withMarshaller(ShowPropertyValuesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagValuesRequest, ListTagValuesResponse> listTagValues =
        genForlistTagValues();

    private static HttpRequestDef<ListTagValuesRequest, ListTagValuesResponse> genForlistTagValues() {
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
            f -> f.withMarshaller(ListTagValuesRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));
        builder.<String>withRequestField("tag_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getTagName, (req, v) -> {
                req.setTagName(v);
            }));
        builder.<String>withRequestField("filters",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getFilters, (req, v) -> {
                req.setFilters(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagValuesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagValuesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDatasetRequest, ExportDatasetResponse> exportDataset =
        genForexportDataset();

    private static HttpRequestDef<ExportDatasetRequest, ExportDatasetResponse> genForexportDataset() {
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
            f -> f.withMarshaller(ExportDatasetRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDatasetRequest::getRunId, (req, v) -> {
                req.setRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDataRequest, ImportDataResponse> importData = genForimportData();

    private static HttpRequestDef<ImportDataRequest, ImportDataResponse> genForimportData() {
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
            f -> f.withMarshaller(ImportDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatasetRequest, ShowDatasetResponse> showDataset = genForshowDataset();

    private static HttpRequestDef<ShowDatasetRequest, ShowDatasetResponse> genForshowDataset() {
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
            f -> f.withMarshaller(ShowDatasetRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetRequest::getRunId, (req, v) -> {
                req.setRunId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDatasetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDatasetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateSqlRequest, ValidateSqlResponse> validateSql = genForvalidateSql();

    private static HttpRequestDef<ValidateSqlRequest, ValidateSqlResponse> genForvalidateSql() {
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
            f -> f.withMarshaller(ValidateSqlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDevDataRequest, AddDevDataResponse> addDevData = genForaddDevData();

    private static HttpRequestDef<AddDevDataRequest, AddDevDataResponse> genForaddDevData() {
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
            f -> f.withMarshaller(AddDevDataRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(AddDevDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDevDataResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJob =
        genForcreateBatchJob();

    private static HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> genForcreateBatchJob() {
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
            f -> f.withMarshaller(CreateBatchJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJob =
        genFordeleteBatchJob();

    private static HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> genFordeleteBatchJob() {
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
            f -> f.withMarshaller(DeleteBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchJobsRequest, ListBatchJobsResponse> listBatchJobs =
        genForlistBatchJobs();

    private static HttpRequestDef<ListBatchJobsRequest, ListBatchJobsResponse> genForlistBatchJobs() {
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
            f -> f.withMarshaller(ListBatchJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("has_schedule",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getHasSchedule, (req, v) -> {
                req.setHasSchedule(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getScheduleStatus, (req, v) -> {
                req.setScheduleStatus(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJob = genForshowBatchJob();

    private static HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> genForshowBatchJob() {
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
            f -> f.withMarshaller(ShowBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchJobRequest, UpdateBatchJobResponse> updateBatchJob =
        genForupdateBatchJob();

    private static HttpRequestDef<UpdateBatchJobRequest, UpdateBatchJobResponse> genForupdateBatchJob() {
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
            f -> f.withMarshaller(UpdateBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Job>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Job.class),
            f -> f.withMarshaller(UpdateBatchJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPipelineJobRequest, AddPipelineJobResponse> addPipelineJob =
        genForaddPipelineJob();

    private static HttpRequestDef<AddPipelineJobRequest, AddPipelineJobResponse> genForaddPipelineJob() {
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
            f -> f.withMarshaller(AddPipelineJobRequest::getCheck, (req, v) -> {
                req.setCheck(v);
            }));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AddPipelineJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineJobRequest, DeletePipelineJobResponse> deletePipelineJob =
        genFordeletePipelineJob();

    private static HttpRequestDef<DeletePipelineJobRequest, DeletePipelineJobResponse> genFordeletePipelineJob() {
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
            f -> f.withMarshaller(DeletePipelineJobRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePipelineJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineJobsRequest, ListPipelineJobsResponse> listPipelineJobs =
        genForlistPipelineJobs();

    private static HttpRequestDef<ListPipelineJobsRequest, ListPipelineJobsResponse> genForlistPipelineJobs() {
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
            f -> f.withMarshaller(ListPipelineJobsRequest::getDataStoreId, (req, v) -> {
                req.setDataStoreId(v);
            }));
        builder.<String>withRequestField("data_store_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getDataStoreGroupId, (req, v) -> {
                req.setDataStoreGroupId(v);
            }));
        builder.<String>withRequestField("data_source_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getDataSourceId, (req, v) -> {
                req.setDataSourceId(v);
            }));
        builder.<String>withRequestField("pipeline_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getPipelineName, (req, v) -> {
                req.setPipelineName(v);
            }));
        builder.<String>withRequestField("operator_class_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getOperatorClassName, (req, v) -> {
                req.setOperatorClassName(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getSyncStatus, (req, v) -> {
                req.setSyncStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineJobRequest, ShowPipelineJobResponse> showPipelineJob =
        genForshowPipelineJob();

    private static HttpRequestDef<ShowPipelineJobRequest, ShowPipelineJobResponse> genForshowPipelineJob() {
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
            f -> f.withMarshaller(ShowPipelineJobRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPipelineJobRequest, StartPipelineJobResponse> startPipelineJob =
        genForstartPipelineJob();

    private static HttpRequestDef<StartPipelineJobRequest, StartPipelineJobResponse> genForstartPipelineJob() {
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
            f -> f.withMarshaller(StartPipelineJobRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<Integer>withRequestField("parallel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartPipelineJobRequest::getParallel, (req, v) -> {
                req.setParallel(v);
            }));
        builder.<Integer>withRequestField("rtu",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartPipelineJobRequest::getRtu, (req, v) -> {
                req.setRtu(v);
            }));
        builder.<Boolean>withRequestField("resume_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StartPipelineJobRequest::getResumeSavepoint, (req, v) -> {
                req.setResumeSavepoint(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineJobRequest, StopPipelineJobResponse> stopPipelineJob =
        genForstopPipelineJob();

    private static HttpRequestDef<StopPipelineJobRequest, StopPipelineJobResponse> genForstopPipelineJob() {
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
            f -> f.withMarshaller(StopPipelineJobRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<Boolean>withRequestField("trigger_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StopPipelineJobRequest::getTriggerSavepoint, (req, v) -> {
                req.setTriggerSavepoint(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipelineJobRequest, UpdatePipelineJobResponse> updatePipelineJob =
        genForupdatePipelineJob();

    private static HttpRequestDef<UpdatePipelineJobRequest, UpdatePipelineJobResponse> genForupdatePipelineJob() {
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
            f -> f.withMarshaller(UpdatePipelineJobRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<Boolean>withRequestField("check",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UpdatePipelineJobRequest::getCheck, (req, v) -> {
                req.setCheck(v);
            }));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(UpdatePipelineJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamingJobRequest, CreateStreamingJobResponse> createStreamingJob =
        genForcreateStreamingJob();

    private static HttpRequestDef<CreateStreamingJobRequest, CreateStreamingJobResponse> genForcreateStreamingJob() {
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
            f -> f.withMarshaller(CreateStreamingJobRequest::getCheck, (req, v) -> {
                req.setCheck(v);
            }));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(CreateStreamingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse> deleteStreamingJobById =
        genFordeleteStreamingJobById();

    private static HttpRequestDef<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse> genFordeleteStreamingJobById() {
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
            f -> f.withMarshaller(DeleteStreamingJobByIdRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteStreamingJobByIdResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobByIdRequest, ShowJobByIdResponse> showJobById = genForshowJobById();

    private static HttpRequestDef<ShowJobByIdRequest, ShowJobByIdResponse> genForshowJobById() {
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
            f -> f.withMarshaller(ShowJobByIdRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobsRequest, ShowJobsResponse> showJobs = genForshowJobs();

    private static HttpRequestDef<ShowJobsRequest, ShowJobsResponse> genForshowJobs() {
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
            f -> f.withMarshaller(ShowJobsRequest::getJobInputType, (req, v) -> {
                req.setJobInputType(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowJobsRequest::getSyncStatus, (req, v) -> {
                req.setSyncStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamingJobRequest, UpdateStreamingJobResponse> updateStreamingJob =
        genForupdateStreamingJob();

    private static HttpRequestDef<UpdateStreamingJobRequest, UpdateStreamingJobResponse> genForupdateStreamingJob() {
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
            f -> f.withMarshaller(UpdateStreamingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Boolean>withRequestField("check",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UpdateStreamingJobRequest::getCheck, (req, v) -> {
                req.setCheck(v);
            }));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(UpdateStreamingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartJobRequest, StartJobResponse> startJob = genForstartJob();

    private static HttpRequestDef<StartJobRequest, StartJobResponse> genForstartJob() {
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
            f -> f.withMarshaller(StartJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("parallel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartJobRequest::getParallel, (req, v) -> {
                req.setParallel(v);
            }));
        builder.<Integer>withRequestField("rtu",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartJobRequest::getRtu, (req, v) -> {
                req.setRtu(v);
            }));
        builder.<Boolean>withRequestField("resume_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StartJobRequest::getResumeSavepoint, (req, v) -> {
                req.setResumeSavepoint(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForstopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForstopJob() {
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
            f -> f.withMarshaller(StopJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Boolean>withRequestField("trigger_savepoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StopJobRequest::getTriggerSavepoint, (req, v) -> {
                req.setTriggerSavepoint(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRunRequest, CreateRunResponse> createRun = genForcreateRun();

    private static HttpRequestDef<CreateRunRequest, CreateRunResponse> genForcreateRun() {
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
            f -> f.withMarshaller(CreateRunRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<CreateRunRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRunRequestBody.class),
            f -> f.withMarshaller(CreateRunRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRunRequest, DeleteRunResponse> deleteRun = genFordeleteRun();

    private static HttpRequestDef<DeleteRunRequest, DeleteRunResponse> genFordeleteRun() {
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
            f -> f.withMarshaller(DeleteRunRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRunRequest::getRunId, (req, v) -> {
                req.setRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRunsRequest, ListRunsResponse> listRuns = genForlistRuns();

    private static HttpRequestDef<ListRunsRequest, ListRunsResponse> genForlistRuns() {
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
            f -> f.withMarshaller(ListRunsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRunsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("sql_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getSqlPattern, (req, v) -> {
                req.setSqlPattern(v);
            }));
        builder.<String>withRequestField("sql_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getSqlType, (req, v) -> {
                req.setSqlType(v);
            }));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ListRunsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRunsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListRunsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRunRequest, ShowRunResponse> showRun = genForshowRun();

    private static HttpRequestDef<ShowRunRequest, ShowRunResponse> genForshowRun() {
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
            f -> f.withMarshaller(ShowRunRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRunRequest::getRunId, (req, v) -> {
                req.setRunId(v);
            }));
        builder.<Boolean>withRequestField("with_details",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRunRequest::getWithDetails, (req, v) -> {
                req.setWithDetails(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForcreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForcreateTable() {
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
            f -> f.withMarshaller(CreateTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genFordeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genFordeleteTable() {
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
            f -> f.withMarshaller(DeleteTableRequest::getTableId, (req, v) -> {
                req.setTableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesRequest, ListTablesResponse> listTables = genForlistTables();

    private static HttpRequestDef<ListTablesRequest, ListTablesResponse> genForlistTables() {
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
            f -> f.withMarshaller(ListTablesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTablePreviewRequest, ShowTablePreviewResponse> showTablePreview =
        genForshowTablePreview();

    private static HttpRequestDef<ShowTablePreviewRequest, ShowTablePreviewResponse> genForshowTablePreview() {
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
            f -> f.withMarshaller(ShowTablePreviewRequest::getTableId, (req, v) -> {
                req.setTableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableSchemaRequest, ShowTableSchemaResponse> showTableSchema =
        genForshowTableSchema();

    private static HttpRequestDef<ShowTableSchemaRequest, ShowTableSchemaResponse> genForshowTableSchema() {
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
            f -> f.withMarshaller(ShowTableSchemaRequest::getTableId, (req, v) -> {
                req.setTableId(v);
            }));

        // response

        return builder.build();
    }

}
