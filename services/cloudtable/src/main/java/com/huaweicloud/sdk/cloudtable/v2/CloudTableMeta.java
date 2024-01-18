package com.huaweicloud.sdk.cloudtable.v2;

import com.huaweicloud.sdk.cloudtable.v2.model.AddComponentReq;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateCloudTableClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateCloudTableClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateClusterReqBody;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateClusterRequestBody;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.EnableComponentRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.EnableComponentResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.ExpandClusterComponentRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ExpandClusterComponentResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.GrowNodeReq;
import com.huaweicloud.sdk.cloudtable.v2.model.HbaseClusterActionReq;
import com.huaweicloud.sdk.cloudtable.v2.model.HbaseModifySettingV2Req;
import com.huaweicloud.sdk.cloudtable.v2.model.ListClustersRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ListClustersResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.RebootCloudTableClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.RebootCloudTableClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.RestartInstanceRsp;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterDetailRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterDetailResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterSettingRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterSettingResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.UpdateClusterSettingRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.UpdateClusterSettingResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudTableMeta {

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForCreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForCreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v2/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterRequest::getXLanguage, CreateClusterRequest::setXLanguage));
        builder.<CreateClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterRequestBody.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genForDeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genForDeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, DeleteClusterRequest::setClusterId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getXLanguage, DeleteClusterRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableComponentRequest, EnableComponentResponse> enableComponent =
        genForEnableComponent();

    private static HttpRequestDef<EnableComponentRequest, EnableComponentResponse> genForEnableComponent() {
        // basic
        HttpRequestDef.Builder<EnableComponentRequest, EnableComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableComponentRequest.class, EnableComponentResponse.class)
                .withName("EnableComponent")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/components/{component_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableComponentRequest::getClusterId, EnableComponentRequest::setClusterId));
        builder.<String>withRequestField("component_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableComponentRequest::getComponentName, EnableComponentRequest::setComponentName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableComponentRequest::getXLanguage, EnableComponentRequest::setXLanguage));
        builder.<AddComponentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddComponentReq.class),
            f -> f.withMarshaller(EnableComponentRequest::getBody, EnableComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandClusterComponentRequest, ExpandClusterComponentResponse> expandClusterComponent =
        genForExpandClusterComponent();

    private static HttpRequestDef<ExpandClusterComponentRequest, ExpandClusterComponentResponse> genForExpandClusterComponent() {
        // basic
        HttpRequestDef.Builder<ExpandClusterComponentRequest, ExpandClusterComponentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandClusterComponentRequest.class, ExpandClusterComponentResponse.class)
            .withName("ExpandClusterComponent")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandClusterComponentRequest::getClusterId,
                ExpandClusterComponentRequest::setClusterId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandClusterComponentRequest::getXLanguage,
                ExpandClusterComponentRequest::setXLanguage));
        builder.<GrowNodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrowNodeReq.class),
            f -> f.withMarshaller(ExpandClusterComponentRequest::getBody, ExpandClusterComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForListClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForListClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/v2/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersRequest::getOffset, ListClustersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersRequest::getLimit, ListClustersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse> rebootCloudTableCluster =
        genForRebootCloudTableCluster();

    private static HttpRequestDef<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse> genForRebootCloudTableCluster() {
        // basic
        HttpRequestDef.Builder<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RebootCloudTableClusterRequest.class, RebootCloudTableClusterResponse.class)
            .withName("RebootCloudTableCluster")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/restart")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootCloudTableClusterRequest::getClusterId,
                RebootCloudTableClusterRequest::setClusterId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootCloudTableClusterRequest::getXLanguage,
                RebootCloudTableClusterRequest::setXLanguage));
        builder.<HbaseClusterActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HbaseClusterActionReq.class),
            f -> f.withMarshaller(RebootCloudTableClusterRequest::getBody, RebootCloudTableClusterRequest::setBody));

        // response
        builder.<List<RestartInstanceRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(RebootCloudTableClusterResponse::getBody, RebootCloudTableClusterResponse::setBody)
                .withInnerContainerType(RestartInstanceRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetail =
        genForShowClusterDetail();

    private static HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> genForShowClusterDetail() {
        // basic
        HttpRequestDef.Builder<ShowClusterDetailRequest, ShowClusterDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterDetailRequest.class, ShowClusterDetailResponse.class)
                .withName("ShowClusterDetail")
                .withUri("/v2/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterDetailRequest::getClusterId, ShowClusterDetailRequest::setClusterId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterDetailRequest::getXLanguage, ShowClusterDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterSettingRequest, ShowClusterSettingResponse> showClusterSetting =
        genForShowClusterSetting();

    private static HttpRequestDef<ShowClusterSettingRequest, ShowClusterSettingResponse> genForShowClusterSetting() {
        // basic
        HttpRequestDef.Builder<ShowClusterSettingRequest, ShowClusterSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterSettingRequest.class, ShowClusterSettingResponse.class)
                .withName("ShowClusterSetting")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterSettingRequest::getClusterId, ShowClusterSettingRequest::setClusterId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterSettingRequest::getXLanguage, ShowClusterSettingRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterSettingRequest, UpdateClusterSettingResponse> updateClusterSetting =
        genForUpdateClusterSetting();

    private static HttpRequestDef<UpdateClusterSettingRequest, UpdateClusterSettingResponse> genForUpdateClusterSetting() {
        // basic
        HttpRequestDef.Builder<UpdateClusterSettingRequest, UpdateClusterSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateClusterSettingRequest.class, UpdateClusterSettingResponse.class)
            .withName("UpdateClusterSetting")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/setting")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterSettingRequest::getClusterId,
                UpdateClusterSettingRequest::setClusterId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterSettingRequest::getXLanguage,
                UpdateClusterSettingRequest::setXLanguage));
        builder.<HbaseModifySettingV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HbaseModifySettingV2Req.class),
            f -> f.withMarshaller(UpdateClusterSettingRequest::getBody, UpdateClusterSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudTableClusterRequest, CreateCloudTableClusterResponse> createCloudTableCluster =
        genForCreateCloudTableCluster();

    private static HttpRequestDef<CreateCloudTableClusterRequest, CreateCloudTableClusterResponse> genForCreateCloudTableCluster() {
        // basic
        HttpRequestDef.Builder<CreateCloudTableClusterRequest, CreateCloudTableClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCloudTableClusterRequest.class, CreateCloudTableClusterResponse.class)
            .withName("CreateCloudTableCluster")
            .withUri("/v3/{project_id}/clusters")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudTableClusterRequest::getXLanguage,
                CreateCloudTableClusterRequest::setXLanguage));
        builder.<CreateClusterReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterReqBody.class),
            f -> f.withMarshaller(CreateCloudTableClusterRequest::getBody, CreateCloudTableClusterRequest::setBody));

        // response

        return builder.build();
    }

}
