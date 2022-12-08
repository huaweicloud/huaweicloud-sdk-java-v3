package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CcMeta {

    public static final HttpRequestDef<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> associateBandwidthPackage =
        genForassociateBandwidthPackage();

    private static HttpRequestDef<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> genForassociateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateBandwidthPackageRequest.class,
                    AssociateBandwidthPackageResponse.class)
                .withName("AssociateBandwidthPackage")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}/associate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<AssociateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(AssociateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> batchCreateDeleteTags =
        genForbatchCreateDeleteTags();

    private static HttpRequestDef<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> genForbatchCreateDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateDeleteTagsRequest.class, BatchCreateDeleteTagsResponse.class)
            .withName("BatchCreateDeleteTags")
            .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDeleteTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchCreateDeleteTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateDeleteTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateDeleteTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<Tags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Tags.class),
            f -> f.withMarshaller(BatchCreateDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorisationRequest, CreateAuthorisationResponse> createAuthorisation =
        genForcreateAuthorisation();

    private static HttpRequestDef<CreateAuthorisationRequest, CreateAuthorisationResponse> genForcreateAuthorisation() {
        // basic
        HttpRequestDef.Builder<CreateAuthorisationRequest, CreateAuthorisationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthorisationRequest.class, CreateAuthorisationResponse.class)
                .withName("CreateAuthorisation")
                .withUri("/v3/{domain_id}/ccaas/authorisations")
                .withContentType("application/json");

        // requests
        builder.<CreateAuthorisationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAuthorisationRequestBody.class),
            f -> f.withMarshaller(CreateAuthorisationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> createBandwidthPackage =
        genForcreateBandwidthPackage();

    private static HttpRequestDef<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> genForcreateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBandwidthPackageRequest.class, CreateBandwidthPackageResponse.class)
            .withName("CreateBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages")
            .withContentType("application/json");

        // requests
        builder.<CreateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(CreateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnection =
        genForcreateCloudConnection();

    private static HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> genForcreateCloudConnection() {
        // basic
        HttpRequestDef.Builder<CreateCloudConnectionRequest, CreateCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCloudConnectionRequest.class, CreateCloudConnectionResponse.class)
            .withName("CreateCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections")
            .withContentType("application/json");

        // requests
        builder.<CreateCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudConnectionRequestBody.class),
            f -> f.withMarshaller(CreateCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> createInterRegionBandwidth =
        genForcreateInterRegionBandwidth();

    private static HttpRequestDef<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> genForcreateInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInterRegionBandwidthRequest.class,
                    CreateInterRegionBandwidthResponse.class)
                .withName("CreateInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<CreateInterRegionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInterRegionBandwidthRequestBody.class),
            f -> f.withMarshaller(CreateInterRegionBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstance =
        genForcreateNetworkInstance();

    private static HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> genForcreateNetworkInstance() {
        // basic
        HttpRequestDef.Builder<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateNetworkInstanceRequest.class, CreateNetworkInstanceResponse.class)
            .withName("CreateNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances")
            .withContentType("application/json");

        // requests
        builder.<CreateNetworkInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNetworkInstanceRequestBody.class),
            f -> f.withMarshaller(CreateNetworkInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForcreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForcreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<CreateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagRequestBody.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthorisationRequest, DeleteAuthorisationResponse> deleteAuthorisation =
        genFordeleteAuthorisation();

    private static HttpRequestDef<DeleteAuthorisationRequest, DeleteAuthorisationResponse> genFordeleteAuthorisation() {
        // basic
        HttpRequestDef.Builder<DeleteAuthorisationRequest, DeleteAuthorisationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuthorisationRequest.class, DeleteAuthorisationResponse.class)
            .withName("DeleteAuthorisation")
            .withUri("/v3/{domain_id}/ccaas/authorisations/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuthorisationRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> deleteBandwidthPackage =
        genFordeleteBandwidthPackage();

    private static HttpRequestDef<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> genFordeleteBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBandwidthPackageRequest.class, DeleteBandwidthPackageResponse.class)
            .withName("DeleteBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnection =
        genFordeleteCloudConnection();

    private static HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> genFordeleteCloudConnection() {
        // basic
        HttpRequestDef.Builder<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCloudConnectionRequest.class, DeleteCloudConnectionResponse.class)
            .withName("DeleteCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidth =
        genFordeleteInterRegionBandwidth();

    private static HttpRequestDef<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> genFordeleteInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInterRegionBandwidthRequest.class,
                    DeleteInterRegionBandwidthResponse.class)
                .withName("DeleteInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInterRegionBandwidthRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstance =
        genFordeleteNetworkInstance();

    private static HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> genFordeleteNetworkInstance() {
        // basic
        HttpRequestDef.Builder<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNetworkInstanceRequest.class, DeleteNetworkInstanceResponse.class)
            .withName("DeleteNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags/{tag_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTagKey, (req, v) -> {
                req.setTagKey(v);
            }));
        builder.<DeleteTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> disassociateBandwidthPackage =
        genFordisassociateBandwidthPackage();

    private static HttpRequestDef<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> genFordisassociateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateBandwidthPackageRequest.class,
                    DisassociateBandwidthPackageResponse.class)
                .withName("DisassociateBandwidthPackage")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}/disassociate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<DisassociateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(DisassociateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorisationsRequest, ListAuthorisationsResponse> listAuthorisations =
        genForlistAuthorisations();

    private static HttpRequestDef<ListAuthorisationsRequest, ListAuthorisationsResponse> genForlistAuthorisations() {
        // basic
        HttpRequestDef.Builder<ListAuthorisationsRequest, ListAuthorisationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorisationsRequest.class, ListAuthorisationsResponse.class)
                .withName("ListAuthorisations")
                .withUri("/v3/{domain_id}/ccaas/authorisations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<ListAuthorisationsRequest.InstanceIdEnum>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> listBandwidthPackages =
        genForlistBandwidthPackages();

    private static HttpRequestDef<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> genForlistBandwidthPackages() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBandwidthPackagesRequest.class, ListBandwidthPackagesResponse.class)
            .withName("ListBandwidthPackages")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<ListBandwidthPackagesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("billing_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getBillingMode, (req, v) -> {
                req.setBillingMode(v);
            }));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutes =
        genForlistCloudConnectionRoutes();

    private static HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> genForlistCloudConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCloudConnectionRoutesRequest.class,
                    ListCloudConnectionRoutesResponse.class)
                .withName("ListCloudConnectionRoutes")
                .withUri("/v3/{domain_id}/ccaas/cloud-connection-routes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnections =
        genForlistCloudConnections();

    private static HttpRequestDef<ListCloudConnectionsRequest, ListCloudConnectionsResponse> genForlistCloudConnections() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionsRequest, ListCloudConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudConnectionsRequest.class, ListCloudConnectionsResponse.class)
            .withName("ListCloudConnections")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<ListCloudConnectionsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTagsRequest, ListDomainTagsResponse> listDomainTags =
        genForlistDomainTags();

    private static HttpRequestDef<ListDomainTagsRequest, ListDomainTagsResponse> genForlistDomainTags() {
        // basic
        HttpRequestDef.Builder<ListDomainTagsRequest, ListDomainTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainTagsRequest.class, ListDomainTagsResponse.class)
                .withName("ListDomainTags")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListDomainTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDomainTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListDomainTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> listInterRegionBandwidths =
        genForlistInterRegionBandwidths();

    private static HttpRequestDef<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> genForlistInterRegionBandwidths() {
        // basic
        HttpRequestDef.Builder<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInterRegionBandwidthsRequest.class,
                    ListInterRegionBandwidthsResponse.class)
                .withName("ListInterRegionBandwidths")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("bandwidth_package_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getBandwidthPackageId, (req, v) -> {
                req.setBandwidthPackageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstances =
        genForlistNetworkInstances();

    private static HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> genForlistNetworkInstances() {
        // basic
        HttpRequestDef.Builder<ListNetworkInstancesRequest, ListNetworkInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNetworkInstancesRequest.class, ListNetworkInstancesResponse.class)
            .withName("ListNetworkInstances")
            .withUri("/v3/{domain_id}/ccaas/network-instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<ListNetworkInstancesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> listPermissions =
        genForlistPermissions();

    private static HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> genForlistPermissions() {
        // basic
        HttpRequestDef.Builder<ListPermissionsRequest, ListPermissionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermissionsRequest.class, ListPermissionsResponse.class)
                .withName("ListPermissions")
                .withUri("/v3/{domain_id}/ccaas/permissions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v3/{domain_id}/ccaas/quotas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ListQuotasRequest.QuotaTypeEnum>withRequestField("quota_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListQuotasRequest.QuotaTypeEnum.class),
            f -> f.withMarshaller(ListQuotasRequest::getQuotaType, (req, v) -> {
                req.setQuotaType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> listResourceByFilterTag =
        genForlistResourceByFilterTag();

    private static HttpRequestDef<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> genForlistResourceByFilterTag() {
        // basic
        HttpRequestDef.Builder<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceByFilterTagRequest.class, ListResourceByFilterTagResponse.class)
            .withName("ListResourceByFilterTag")
            .withUri("/v3/{domain_id}/ccaas/{resource_type}/resource-instances/action")
            .withContentType("application/json");

        // requests
        builder.<ListResourceByFilterTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceByFilterTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceByFilterTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListResourceByFilterTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceByFilterTagRequestBody.class),
            f -> f.withMarshaller(ListResourceByFilterTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> showBandwidthPackage =
        genForshowBandwidthPackage();

    private static HttpRequestDef<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> genForshowBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBandwidthPackageRequest.class, ShowBandwidthPackageResponse.class)
            .withName("ShowBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnection =
        genForshowCloudConnection();

    private static HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> genForshowCloudConnection() {
        // basic
        HttpRequestDef.Builder<ShowCloudConnectionRequest, ShowCloudConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCloudConnectionRequest.class, ShowCloudConnectionResponse.class)
                .withName("ShowCloudConnection")
                .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutes =
        genForshowCloudConnectionRoutes();

    private static HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> genForshowCloudConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCloudConnectionRoutesRequest.class,
                    ShowCloudConnectionRoutesResponse.class)
                .withName("ShowCloudConnectionRoutes")
                .withUri("/v3/{domain_id}/ccaas/cloud-connection-routes/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudConnectionRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> showInterRegionBandwidth =
        genForshowInterRegionBandwidth();

    private static HttpRequestDef<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> genForshowInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowInterRegionBandwidthRequest.class, ShowInterRegionBandwidthResponse.class)
                .withName("ShowInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInterRegionBandwidthRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstance =
        genForshowNetworkInstance();

    private static HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> genForshowNetworkInstance() {
        // basic
        HttpRequestDef.Builder<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNetworkInstanceRequest.class, ShowNetworkInstanceResponse.class)
                .withName("ShowNetworkInstance")
                .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthorisationRequest, UpdateAuthorisationResponse> updateAuthorisation =
        genForupdateAuthorisation();

    private static HttpRequestDef<UpdateAuthorisationRequest, UpdateAuthorisationResponse> genForupdateAuthorisation() {
        // basic
        HttpRequestDef.Builder<UpdateAuthorisationRequest, UpdateAuthorisationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuthorisationRequest.class, UpdateAuthorisationResponse.class)
                .withName("UpdateAuthorisation")
                .withUri("/v3/{domain_id}/ccaas/authorisations/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorisationRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateAuthorisationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuthorisationRequestBody.class),
            f -> f.withMarshaller(UpdateAuthorisationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> updateBandwidthPackage =
        genForupdateBandwidthPackage();

    private static HttpRequestDef<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> genForupdateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBandwidthPackageRequest.class, UpdateBandwidthPackageResponse.class)
            .withName("UpdateBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnection =
        genForupdateCloudConnection();

    private static HttpRequestDef<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> genForupdateCloudConnection() {
        // basic
        HttpRequestDef.Builder<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCloudConnectionRequest.class, UpdateCloudConnectionResponse.class)
            .withName("UpdateCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCloudConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> updateInterRegionBandwidth =
        genForupdateInterRegionBandwidth();

    private static HttpRequestDef<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> genForupdateInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInterRegionBandwidthRequest.class,
                    UpdateInterRegionBandwidthResponse.class)
                .withName("UpdateInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInterRegionBandwidthRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateInterRegionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInterRegionBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateInterRegionBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstance =
        genForupdateNetworkInstance();

    private static HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> genForupdateNetworkInstance() {
        // basic
        HttpRequestDef.Builder<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNetworkInstanceRequest.class, UpdateNetworkInstanceResponse.class)
            .withName("UpdateNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateNetworkInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNetworkInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
