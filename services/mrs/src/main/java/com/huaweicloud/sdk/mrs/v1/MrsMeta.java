package com.huaweicloud.sdk.mrs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mrs.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class MrsMeta {

    public static final HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTags = genForbatchCreateClusterTags();

    private static HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> genForbatchCreateClusterTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateClusterTagsRequest.class, BatchCreateClusterTagsResponse.class)
                .withName("BatchCreateClusterTags")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateClusterTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.<BatchCreateClusterTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateClusterTagsReq.class),
            f -> f.withMarshaller(BatchCreateClusterTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTags = genForbatchDeleteClusterTags();

    private static HttpRequestDef<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> genForbatchDeleteClusterTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteClusterTagsRequest.class, BatchDeleteClusterTagsResponse.class)
                .withName("BatchDeleteClusterTags")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.<BatchDeleteClusterTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteClusterTagsReq.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster = genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v1.1/{project_id}/run-job-flow")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterTagRequest, CreateClusterTagResponse> createClusterTag = genForcreateClusterTag();

    private static HttpRequestDef<CreateClusterTagRequest, CreateClusterTagResponse> genForcreateClusterTag() {
        // basic
        HttpRequestDef.Builder<CreateClusterTagRequest, CreateClusterTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterTagRequest.class, CreateClusterTagResponse.class)
                .withName("CreateClusterTag")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterTagRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateClusterTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster = genFordeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genFordeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteClusterResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterTagRequest, DeleteClusterTagResponse> deleteClusterTag = genFordeleteClusterTag();

    private static HttpRequestDef<DeleteClusterTagRequest, DeleteClusterTagResponse> genFordeleteClusterTag() {
        // basic
        HttpRequestDef.Builder<DeleteClusterTagRequest, DeleteClusterTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterTagRequest.class, DeleteClusterTagResponse.class)
                .withName("DeleteClusterTag")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterTagRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> listAllTags = genForlistAllTags();

    private static HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> genForlistAllTags() {
        // basic
        HttpRequestDef.Builder<ListAllTagsRequest, ListAllTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllTagsRequest.class, ListAllTagsResponse.class)
                .withName("ListAllTags")
                .withUri("/v1.1/{project_id}/clusters/tags")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTags = genForlistClusterTags();

    private static HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> genForlistClusterTags() {
        // basic
        HttpRequestDef.Builder<ListClusterTagsRequest, ListClusterTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterTagsRequest.class, ListClusterTagsResponse.class)
                .withName("ListClusterTags")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForlistClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForlistClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/v1.1/{project_id}/cluster_infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.<String>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.<String>withRequestField("currentPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            })
        );
        builder.<String>withRequestField("clusterName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getClusterName, (req, v) -> {
                req.setClusterName(v);
            })
        );
        builder.<String>withRequestField("clusterState",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getClusterState, (req, v) -> {
                req.setClusterState(v);
            })
        );
        builder.<String>withRequestField("enterpriseProjectId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListClustersByTagsRequest, ListClustersByTagsResponse> listClustersByTags = genForlistClustersByTags();

    private static HttpRequestDef<ListClustersByTagsRequest, ListClustersByTagsResponse> genForlistClustersByTags() {
        // basic
        HttpRequestDef.Builder<ListClustersByTagsRequest, ListClustersByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListClustersByTagsRequest.class, ListClustersByTagsResponse.class)
                .withName("ListClustersByTags")
                .withUri("/v1.1/{project_id}/clusters/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceReq.class),
            f -> f.withMarshaller(ListClustersByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
