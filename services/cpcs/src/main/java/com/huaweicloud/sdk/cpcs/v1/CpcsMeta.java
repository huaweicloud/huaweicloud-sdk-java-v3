package com.huaweicloud.sdk.cpcs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cpcs.v1.model.AssociateAppsRequest;
import com.huaweicloud.sdk.cpcs.v1.model.AssociateAppsRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.AssociateAppsResponse;
import com.huaweicloud.sdk.cpcs.v1.model.AuthorizeAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.AuthorizeAccessKeysRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.AuthorizeAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.BatchAccessKeysRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.BatchDisableAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.BatchDisableAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.BatchEnableAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.BatchEnableAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CancelAuthorizeAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CancelAuthorizeAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppAccessKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppAccessKeyRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppAccessKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CreateClusterRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DeAuthorizeAccessKeysRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAccessKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAccessKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteCcspClusterRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteCcspClusterResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DisAssociateAppsRequestBody;
import com.huaweicloud.sdk.cpcs.v1.model.DisableCcspInstanceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DisableCcspInstanceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DisassociateAppsRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DisassociateAppsResponse;
import com.huaweicloud.sdk.cpcs.v1.model.EnableCcspInstanceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.EnableCcspInstanceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ListCcspTenantImagesRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ListCcspTenantImagesResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAccessKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAccessKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppAccessKeyListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppAccessKeyListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAssociationListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAssociationListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAvailableAzRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAvailableAzResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspInstanceInfoRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspInstanceInfoResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterAccessKeyListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterAccessKeyListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterUriRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterUriResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceInfoRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceInfoResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowVmMonitorRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowVmMonitorResponse;

@SuppressWarnings("unchecked")
public class CpcsMeta {

    public static final HttpRequestDef<AssociateAppsRequest, AssociateAppsResponse> associateApps =
        genForAssociateApps();

    private static HttpRequestDef<AssociateAppsRequest, AssociateAppsResponse> genForAssociateApps() {
        // basic
        HttpRequestDef.Builder<AssociateAppsRequest, AssociateAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateAppsRequest.class, AssociateAppsResponse.class)
                .withName("AssociateApps")
                .withUri("/v1/{project_id}/dew/cpcs/associate-apps")
                .withContentType("application/json");

        // requests
        builder.<AssociateAppsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateAppsRequestBody.class),
            f -> f.withMarshaller(AssociateAppsRequest::getBody, AssociateAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeAccessKeysRequest, AuthorizeAccessKeysResponse> authorizeAccessKeys =
        genForAuthorizeAccessKeys();

    private static HttpRequestDef<AuthorizeAccessKeysRequest, AuthorizeAccessKeysResponse> genForAuthorizeAccessKeys() {
        // basic
        HttpRequestDef.Builder<AuthorizeAccessKeysRequest, AuthorizeAccessKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AuthorizeAccessKeysRequest.class, AuthorizeAccessKeysResponse.class)
                .withName("AuthorizeAccessKeys")
                .withUri("/v1/{project_id}/dew/cpcs/cluster/{cluster_id}/authorize-access-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeAccessKeysRequest::getClusterId, AuthorizeAccessKeysRequest::setClusterId));
        builder.<AuthorizeAccessKeysRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeAccessKeysRequestBody.class),
            f -> f.withMarshaller(AuthorizeAccessKeysRequest::getBody, AuthorizeAccessKeysRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisableAccessKeysRequest, BatchDisableAccessKeysResponse> batchDisableAccessKeys =
        genForBatchDisableAccessKeys();

    private static HttpRequestDef<BatchDisableAccessKeysRequest, BatchDisableAccessKeysResponse> genForBatchDisableAccessKeys() {
        // basic
        HttpRequestDef.Builder<BatchDisableAccessKeysRequest, BatchDisableAccessKeysResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDisableAccessKeysRequest.class, BatchDisableAccessKeysResponse.class)
            .withName("BatchDisableAccessKeys")
            .withUri("/v1/{project_id}/dew/cpcs/apps/{app_id}/access-keys/disable")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisableAccessKeysRequest::getAppId, BatchDisableAccessKeysRequest::setAppId));
        builder.<BatchAccessKeysRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAccessKeysRequestBody.class),
            f -> f.withMarshaller(BatchDisableAccessKeysRequest::getBody, BatchDisableAccessKeysRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchEnableAccessKeysRequest, BatchEnableAccessKeysResponse> batchEnableAccessKeys =
        genForBatchEnableAccessKeys();

    private static HttpRequestDef<BatchEnableAccessKeysRequest, BatchEnableAccessKeysResponse> genForBatchEnableAccessKeys() {
        // basic
        HttpRequestDef.Builder<BatchEnableAccessKeysRequest, BatchEnableAccessKeysResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchEnableAccessKeysRequest.class, BatchEnableAccessKeysResponse.class)
            .withName("BatchEnableAccessKeys")
            .withUri("/v1/{project_id}/dew/cpcs/apps/{app_id}/access-keys/enable")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchEnableAccessKeysRequest::getAppId, BatchEnableAccessKeysRequest::setAppId));
        builder.<BatchAccessKeysRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAccessKeysRequestBody.class),
            f -> f.withMarshaller(BatchEnableAccessKeysRequest::getBody, BatchEnableAccessKeysRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelAuthorizeAccessKeysRequest, CancelAuthorizeAccessKeysResponse> cancelAuthorizeAccessKeys =
        genForCancelAuthorizeAccessKeys();

    private static HttpRequestDef<CancelAuthorizeAccessKeysRequest, CancelAuthorizeAccessKeysResponse> genForCancelAuthorizeAccessKeys() {
        // basic
        HttpRequestDef.Builder<CancelAuthorizeAccessKeysRequest, CancelAuthorizeAccessKeysResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CancelAuthorizeAccessKeysRequest.class,
                    CancelAuthorizeAccessKeysResponse.class)
                .withName("CancelAuthorizeAccessKeys")
                .withUri("/v1/{project_id}/dew/cpcs/cluster/{cluster_id}/de-authorize-access-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuthorizeAccessKeysRequest::getClusterId,
                CancelAuthorizeAccessKeysRequest::setClusterId));
        builder.<DeAuthorizeAccessKeysRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeAuthorizeAccessKeysRequestBody.class),
            f -> f.withMarshaller(CancelAuthorizeAccessKeysRequest::getBody,
                CancelAuthorizeAccessKeysRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v1/{project_id}/dew/cpcs/apps")
                .withContentType("application/json");

        // requests
        builder.<CreateAppRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppRequestBody.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppAccessKeyRequest, CreateAppAccessKeyResponse> createAppAccessKey =
        genForCreateAppAccessKey();

    private static HttpRequestDef<CreateAppAccessKeyRequest, CreateAppAccessKeyResponse> genForCreateAppAccessKey() {
        // basic
        HttpRequestDef.Builder<CreateAppAccessKeyRequest, CreateAppAccessKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppAccessKeyRequest.class, CreateAppAccessKeyResponse.class)
                .withName("CreateAppAccessKey")
                .withUri("/v1/{project_id}/dew/cpcs/apps/{app_id}/access-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppAccessKeyRequest::getAppId, CreateAppAccessKeyRequest::setAppId));
        builder.<CreateAppAccessKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppAccessKeyRequestBody.class),
            f -> f.withMarshaller(CreateAppAccessKeyRequest::getBody, CreateAppAccessKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForCreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForCreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v1/{project_id}/dew/cpcs/cluster")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterRequestBody.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessKeyRequest, DeleteAccessKeyResponse> deleteAccessKey =
        genForDeleteAccessKey();

    private static HttpRequestDef<DeleteAccessKeyRequest, DeleteAccessKeyResponse> genForDeleteAccessKey() {
        // basic
        HttpRequestDef.Builder<DeleteAccessKeyRequest, DeleteAccessKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccessKeyRequest.class, DeleteAccessKeyResponse.class)
                .withName("DeleteAccessKey")
                .withUri("/v1/{project_id}/dew/cpcs/apps/{app_id}/access-keys/{access_key_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessKeyRequest::getAccessKeyId, DeleteAccessKeyRequest::setAccessKeyId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessKeyRequest::getAppId, DeleteAccessKeyRequest::setAppId));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(DeleteAccessKeyResponse::getBody, DeleteAccessKeyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v1/{project_id}/dew/cpcs/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, DeleteAppRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCcspClusterRequest, DeleteCcspClusterResponse> deleteCcspCluster =
        genForDeleteCcspCluster();

    private static HttpRequestDef<DeleteCcspClusterRequest, DeleteCcspClusterResponse> genForDeleteCcspCluster() {
        // basic
        HttpRequestDef.Builder<DeleteCcspClusterRequest, DeleteCcspClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCcspClusterRequest.class, DeleteCcspClusterResponse.class)
                .withName("DeleteCcspCluster")
                .withUri("/v1/{project_id}/dew/cpcs/cluster/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcspClusterRequest::getClusterId, DeleteCcspClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableCcspInstanceRequest, DisableCcspInstanceResponse> disableCcspInstance =
        genForDisableCcspInstance();

    private static HttpRequestDef<DisableCcspInstanceRequest, DisableCcspInstanceResponse> genForDisableCcspInstance() {
        // basic
        HttpRequestDef.Builder<DisableCcspInstanceRequest, DisableCcspInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableCcspInstanceRequest.class, DisableCcspInstanceResponse.class)
                .withName("DisableCcspInstance")
                .withUri("/v1/{project_id}/dew/cpcs/instances/{instance_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableCcspInstanceRequest::getInstanceId,
                DisableCcspInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateAppsRequest, DisassociateAppsResponse> disassociateApps =
        genForDisassociateApps();

    private static HttpRequestDef<DisassociateAppsRequest, DisassociateAppsResponse> genForDisassociateApps() {
        // basic
        HttpRequestDef.Builder<DisassociateAppsRequest, DisassociateAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateAppsRequest.class, DisassociateAppsResponse.class)
                .withName("DisassociateApps")
                .withUri("/v1/{project_id}/dew/cpcs/disassociate-apps")
                .withContentType("application/json");

        // requests
        builder.<DisAssociateAppsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisAssociateAppsRequestBody.class),
            f -> f.withMarshaller(DisassociateAppsRequest::getBody, DisassociateAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableCcspInstanceRequest, EnableCcspInstanceResponse> enableCcspInstance =
        genForEnableCcspInstance();

    private static HttpRequestDef<EnableCcspInstanceRequest, EnableCcspInstanceResponse> genForEnableCcspInstance() {
        // basic
        HttpRequestDef.Builder<EnableCcspInstanceRequest, EnableCcspInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableCcspInstanceRequest.class, EnableCcspInstanceResponse.class)
                .withName("EnableCcspInstance")
                .withUri("/v1/{project_id}/dew/cpcs/instances/{instance_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableCcspInstanceRequest::getInstanceId, EnableCcspInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCcspTenantImagesRequest, ListCcspTenantImagesResponse> listCcspTenantImages =
        genForListCcspTenantImages();

    private static HttpRequestDef<ListCcspTenantImagesRequest, ListCcspTenantImagesResponse> genForListCcspTenantImages() {
        // basic
        HttpRequestDef.Builder<ListCcspTenantImagesRequest, ListCcspTenantImagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCcspTenantImagesRequest.class, ListCcspTenantImagesResponse.class)
            .withName("ListCcspTenantImages")
            .withUri("/v1/{project_id}/dew/cpcs/images")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcspTenantImagesRequest::getPageSize, ListCcspTenantImagesRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcspTenantImagesRequest::getPageNum, ListCcspTenantImagesRequest::setPageNum));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcspTenantImagesRequest::getImageName,
                ListCcspTenantImagesRequest::setImageName));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcspTenantImagesRequest::getServiceType,
                ListCcspTenantImagesRequest::setServiceType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcspTenantImagesRequest::getSortKey, ListCcspTenantImagesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcspTenantImagesRequest::getSortDir, ListCcspTenantImagesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessKeyRequest, ShowAccessKeyResponse> showAccessKey =
        genForShowAccessKey();

    private static HttpRequestDef<ShowAccessKeyRequest, ShowAccessKeyResponse> genForShowAccessKey() {
        // basic
        HttpRequestDef.Builder<ShowAccessKeyRequest, ShowAccessKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessKeyRequest.class, ShowAccessKeyResponse.class)
                .withName("ShowAccessKey")
                .withUri("/v1/{project_id}/dew/cpcs/apps/{app_id}/access-keys/{access_key_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessKeyRequest::getAccessKeyId, ShowAccessKeyRequest::setAccessKeyId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessKeyRequest::getAppId, ShowAccessKeyRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppAccessKeyListRequest, ShowAppAccessKeyListResponse> showAppAccessKeyList =
        genForShowAppAccessKeyList();

    private static HttpRequestDef<ShowAppAccessKeyListRequest, ShowAppAccessKeyListResponse> genForShowAppAccessKeyList() {
        // basic
        HttpRequestDef.Builder<ShowAppAccessKeyListRequest, ShowAppAccessKeyListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppAccessKeyListRequest.class, ShowAppAccessKeyListResponse.class)
            .withName("ShowAppAccessKeyList")
            .withUri("/v1/{project_id}/dew/cpcs/apps/{app_id}/access-keys")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppAccessKeyListRequest::getAppId, ShowAppAccessKeyListRequest::setAppId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppAccessKeyListRequest::getPageSize, ShowAppAccessKeyListRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppAccessKeyListRequest::getPageNum, ShowAppAccessKeyListRequest::setPageNum));
        builder.<String>withRequestField("key_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppAccessKeyListRequest::getKeyName, ShowAppAccessKeyListRequest::setKeyName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppAccessKeyListRequest::getSortKey, ShowAppAccessKeyListRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppAccessKeyListRequest::getSortDir, ShowAppAccessKeyListRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppListRequest, ShowAppListResponse> showAppList = genForShowAppList();

    private static HttpRequestDef<ShowAppListRequest, ShowAppListResponse> genForShowAppList() {
        // basic
        HttpRequestDef.Builder<ShowAppListRequest, ShowAppListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppListRequest.class, ShowAppListResponse.class)
                .withName("ShowAppList")
                .withUri("/v1/{project_id}/dew/cpcs/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppListRequest::getPageSize, ShowAppListRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppListRequest::getPageNum, ShowAppListRequest::setPageNum));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppListRequest::getAppName, ShowAppListRequest::setAppName));
        builder.<String>withRequestField("vpc_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppListRequest::getVpcName, ShowAppListRequest::setVpcName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppListRequest::getSortKey, ShowAppListRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppListRequest::getSortDir, ShowAppListRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssociationListRequest, ShowAssociationListResponse> showAssociationList =
        genForShowAssociationList();

    private static HttpRequestDef<ShowAssociationListRequest, ShowAssociationListResponse> genForShowAssociationList() {
        // basic
        HttpRequestDef.Builder<ShowAssociationListRequest, ShowAssociationListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssociationListRequest.class, ShowAssociationListResponse.class)
                .withName("ShowAssociationList")
                .withUri("/v1/{project_id}/dew/cpcs/associations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociationListRequest::getClusterId, ShowAssociationListRequest::setClusterId));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociationListRequest::getAppId, ShowAssociationListRequest::setAppId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssociationListRequest::getPageSize, ShowAssociationListRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssociationListRequest::getPageNum, ShowAssociationListRequest::setPageNum));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociationListRequest::getSortKey, ShowAssociationListRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociationListRequest::getSortDir, ShowAssociationListRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableAzRequest, ShowAvailableAzResponse> showAvailableAz =
        genForShowAvailableAz();

    private static HttpRequestDef<ShowAvailableAzRequest, ShowAvailableAzResponse> genForShowAvailableAz() {
        // basic
        HttpRequestDef.Builder<ShowAvailableAzRequest, ShowAvailableAzResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAvailableAzRequest.class, ShowAvailableAzResponse.class)
                .withName("ShowAvailableAz")
                .withUri("/v1/{project_id}/dew/cpcs/az")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCcspClusterRequest, ShowCcspClusterResponse> showCcspCluster =
        genForShowCcspCluster();

    private static HttpRequestDef<ShowCcspClusterRequest, ShowCcspClusterResponse> genForShowCcspCluster() {
        // basic
        HttpRequestDef.Builder<ShowCcspClusterRequest, ShowCcspClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCcspClusterRequest.class, ShowCcspClusterResponse.class)
                .withName("ShowCcspCluster")
                .withUri("/v1/{project_id}/dew/cpcs/cluster/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspClusterRequest::getClusterId, ShowCcspClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCcspClusterListRequest, ShowCcspClusterListResponse> showCcspClusterList =
        genForShowCcspClusterList();

    private static HttpRequestDef<ShowCcspClusterListRequest, ShowCcspClusterListResponse> genForShowCcspClusterList() {
        // basic
        HttpRequestDef.Builder<ShowCcspClusterListRequest, ShowCcspClusterListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCcspClusterListRequest.class, ShowCcspClusterListResponse.class)
                .withName("ShowCcspClusterList")
                .withUri("/v1/{project_id}/dew/cpcs/cluster")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCcspClusterListRequest::getPageSize, ShowCcspClusterListRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCcspClusterListRequest::getPageNum, ShowCcspClusterListRequest::setPageNum));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspClusterListRequest::getName, ShowCcspClusterListRequest::setName));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspClusterListRequest::getServiceType,
                ShowCcspClusterListRequest::setServiceType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspClusterListRequest::getSortKey, ShowCcspClusterListRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspClusterListRequest::getSortDir, ShowCcspClusterListRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCcspInstanceInfoRequest, ShowCcspInstanceInfoResponse> showCcspInstanceInfo =
        genForShowCcspInstanceInfo();

    private static HttpRequestDef<ShowCcspInstanceInfoRequest, ShowCcspInstanceInfoResponse> genForShowCcspInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowCcspInstanceInfoRequest, ShowCcspInstanceInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCcspInstanceInfoRequest.class, ShowCcspInstanceInfoResponse.class)
            .withName("ShowCcspInstanceInfo")
            .withUri("/v1/{project_id}/dew/cpcs/instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getPageSize, ShowCcspInstanceInfoRequest::setPageSize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getName, ShowCcspInstanceInfoRequest::setName));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getPageNum, ShowCcspInstanceInfoRequest::setPageNum));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getSortKey, ShowCcspInstanceInfoRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getSortDir, ShowCcspInstanceInfoRequest::setSortDir));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getClusterId,
                ShowCcspInstanceInfoRequest::setClusterId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getStatus, ShowCcspInstanceInfoRequest::setStatus));
        builder.<Boolean>withRequestField("is_normal",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowCcspInstanceInfoRequest::getIsNormal, ShowCcspInstanceInfoRequest::setIsNormal));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterAccessKeyListRequest, ShowClusterAccessKeyListResponse> showClusterAccessKeyList =
        genForShowClusterAccessKeyList();

    private static HttpRequestDef<ShowClusterAccessKeyListRequest, ShowClusterAccessKeyListResponse> genForShowClusterAccessKeyList() {
        // basic
        HttpRequestDef.Builder<ShowClusterAccessKeyListRequest, ShowClusterAccessKeyListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowClusterAccessKeyListRequest.class, ShowClusterAccessKeyListResponse.class)
                .withName("ShowClusterAccessKeyList")
                .withUri("/v1/{project_id}/dew/cpcs/cluster/{cluster_id}/access-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAccessKeyListRequest::getClusterId,
                ShowClusterAccessKeyListRequest::setClusterId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterAccessKeyListRequest::getPageSize,
                ShowClusterAccessKeyListRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterAccessKeyListRequest::getPageNum,
                ShowClusterAccessKeyListRequest::setPageNum));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAccessKeyListRequest::getAppName,
                ShowClusterAccessKeyListRequest::setAppName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAccessKeyListRequest::getSortKey,
                ShowClusterAccessKeyListRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAccessKeyListRequest::getSortDir,
                ShowClusterAccessKeyListRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterUriRequest, ShowClusterUriResponse> showClusterUri =
        genForShowClusterUri();

    private static HttpRequestDef<ShowClusterUriRequest, ShowClusterUriResponse> genForShowClusterUri() {
        // basic
        HttpRequestDef.Builder<ShowClusterUriRequest, ShowClusterUriResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterUriRequest.class, ShowClusterUriResponse.class)
                .withName("ShowClusterUri")
                .withUri("/v1/{project_id}/dew/cpcs/cluster/{cluster_id}/uri")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterUriRequest::getClusterId, ShowClusterUriRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfo =
        genForShowResourceInfo();

    private static HttpRequestDef<ShowResourceInfoRequest, ShowResourceInfoResponse> genForShowResourceInfo() {
        // basic
        HttpRequestDef.Builder<ShowResourceInfoRequest, ShowResourceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceInfoRequest.class, ShowResourceInfoResponse.class)
                .withName("ShowResourceInfo")
                .withUri("/v1/{project_id}/dew/cpcs/resource-info")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVmMonitorRequest, ShowVmMonitorResponse> showVmMonitor =
        genForShowVmMonitor();

    private static HttpRequestDef<ShowVmMonitorRequest, ShowVmMonitorResponse> genForShowVmMonitor() {
        // basic
        HttpRequestDef.Builder<ShowVmMonitorRequest, ShowVmMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVmMonitorRequest.class, ShowVmMonitorResponse.class)
                .withName("ShowVmMonitor")
                .withUri("/v1/{project_id}/dew/cpcs/vm-monitor")
                .withContentType("application/json");

        // requests
        builder.<ShowVmMonitorRequest.NamespaceEnum>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowVmMonitorRequest.NamespaceEnum.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getNamespace, ShowVmMonitorRequest::setNamespace));
        builder.<ShowVmMonitorRequest.MetricNameEnum>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowVmMonitorRequest.MetricNameEnum.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getMetricName, ShowVmMonitorRequest::setMetricName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getInstanceId, ShowVmMonitorRequest::setInstanceId));
        builder.<String>withRequestField("vsm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getVsmId, ShowVmMonitorRequest::setVsmId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getFrom, ShowVmMonitorRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getTo, ShowVmMonitorRequest::setTo));
        builder.<Integer>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getPeriod, ShowVmMonitorRequest::setPeriod));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVmMonitorRequest::getFilter, ShowVmMonitorRequest::setFilter));

        // response

        return builder.build();
    }

}
