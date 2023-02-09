package com.huaweicloud.sdk.lakeformation.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.lakeformation.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class LakeFormationMeta {

    public static final HttpRequestDef<ApplyForAccessRequest, ApplyForAccessResponse> applyForAccess =
        genForapplyForAccess();

    private static HttpRequestDef<ApplyForAccessRequest, ApplyForAccessResponse> genForapplyForAccess() {
        // basic
        HttpRequestDef.Builder<ApplyForAccessRequest, ApplyForAccessResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyForAccessRequest.class, ApplyForAccessResponse.class)
                .withName("ApplyForAccess")
                .withUri("/v1/{project_id}/instances/{instance_id}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyForAccessRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<List<AccessRequestInfo>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ApplyForAccessRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(AccessRequestInfo.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> batchAuthorizeInterface =
        genForbatchAuthorizeInterface();

    private static HttpRequestDef<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> genForbatchAuthorizeInterface() {
        // basic
        HttpRequestDef.Builder<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAuthorizeInterfaceRequest.class, BatchAuthorizeInterfaceResponse.class)
            .withName("BatchAuthorizeInterface")
            .withUri("/v1/{project_id}/instances/{instance_id}/policies/grant")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAuthorizeInterfaceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AccessPolicyInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessPolicyInput.class),
            f -> f.withMarshaller(BatchAuthorizeInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterface =
        genForbatchCancelAuthorizationInterface();

    private static HttpRequestDef<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> genForbatchCancelAuthorizationInterface() {
        // basic
        HttpRequestDef.Builder<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCancelAuthorizationInterfaceRequest.class,
                    BatchCancelAuthorizationInterfaceResponse.class)
                .withName("BatchCancelAuthorizationInterface")
                .withUri("/v1/{project_id}/instances/{instance_id}/policies/revoke")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCancelAuthorizationInterfaceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AccessPolicyInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessPolicyInput.class),
            f -> f.withMarshaller(BatchCancelAuthorizationInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessInfosRequest, ListAccessInfosResponse> listAccessInfos =
        genForlistAccessInfos();

    private static HttpRequestDef<ListAccessInfosRequest, ListAccessInfosResponse> genForlistAccessInfos() {
        // basic
        HttpRequestDef.Builder<ListAccessInfosRequest, ListAccessInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessInfosRequest.class, ListAccessInfosResponse.class)
                .withName("ListAccessInfos")
                .withUri("/v1/{project_id}/instances/{instance_id}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessInfosRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInterfacesRequest, ListInterfacesResponse> listInterfaces =
        genForlistInterfaces();

    private static HttpRequestDef<ListInterfacesRequest, ListInterfacesResponse> genForlistInterfaces() {
        // basic
        HttpRequestDef.Builder<ListInterfacesRequest, ListInterfacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInterfacesRequest.class, ListInterfacesResponse.class)
                .withName("ListInterfaces")
                .withUri("/v1/{project_id}/instances/{instance_id}/policies/show")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<ListInterfacesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInterfacesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListInterfacesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListInterfacesRequest.PrincipalSourceEnum>withRequestField("principal_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInterfacesRequest.PrincipalSourceEnum.class),
            f -> f.withMarshaller(ListInterfacesRequest::getPrincipalSource, (req, v) -> {
                req.setPrincipalSource(v);
            }));
        builder.<ListInterfacesRequest.PrincipalTypeEnum>withRequestField("principal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInterfacesRequest.PrincipalTypeEnum.class),
            f -> f.withMarshaller(ListInterfacesRequest::getPrincipalType, (req, v) -> {
                req.setPrincipalType(v);
            }));
        builder.<String>withRequestField("principal_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getPrincipalName, (req, v) -> {
                req.setPrincipalName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInterfacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncPolicyRequest, ShowSyncPolicyResponse> showSyncPolicy =
        genForshowSyncPolicy();

    private static HttpRequestDef<ShowSyncPolicyRequest, ShowSyncPolicyResponse> genForshowSyncPolicy() {
        // basic
        HttpRequestDef.Builder<ShowSyncPolicyRequest, ShowSyncPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSyncPolicyRequest.class, ShowSyncPolicyResponse.class)
                .withName("ShowSyncPolicy")
                .withUri("/v1/{project_id}/instances/{instance_id}/policies/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("last_known_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSyncPolicyRequest::getLastKnownVersion, (req, v) -> {
                req.setLastKnownVersion(v);
            }));
        builder.<Boolean>withRequestField("supports_policy_deltas",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowSyncPolicyRequest::getSupportsPolicyDeltas, (req, v) -> {
                req.setSupportsPolicyDeltas(v);
            }));
        builder.<Boolean>withRequestField("is_return_policy_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowSyncPolicyRequest::getIsReturnPolicyData, (req, v) -> {
                req.setIsReturnPolicyData(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> createCatalog =
        genForcreateCatalog();

    private static HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> genForcreateCatalog() {
        // basic
        HttpRequestDef.Builder<CreateCatalogRequest, CreateCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCatalogRequest.class, CreateCatalogResponse.class)
                .withName("CreateCatalog")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCatalogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CatalogInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogInput.class),
            f -> f.withMarshaller(CreateCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalog =
        genFordeleteCatalog();

    private static HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> genFordeleteCatalog() {
        // basic
        HttpRequestDef.Builder<DeleteCatalogRequest, DeleteCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCatalogRequest.class, DeleteCatalogResponse.class)
                .withName("DeleteCatalog")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCatalogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCatalogRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogsRequest, ListCatalogsResponse> listCatalogs = genForlistCatalogs();

    private static HttpRequestDef<ListCatalogsRequest, ListCatalogsResponse> genForlistCatalogs() {
        // basic
        HttpRequestDef.Builder<ListCatalogsRequest, ListCatalogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCatalogsRequest.class, ListCatalogsResponse.class)
                .withName("ListCatalogs")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<List<Catalog>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCatalogsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Catalog.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCatalogRequest, ShowCatalogResponse> showCatalog = genForshowCatalog();

    private static HttpRequestDef<ShowCatalogRequest, ShowCatalogResponse> genForshowCatalog() {
        // basic
        HttpRequestDef.Builder<ShowCatalogRequest, ShowCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCatalogRequest.class, ShowCatalogResponse.class)
                .withName("ShowCatalog")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCatalogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCatalogRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalog =
        genForupdateCatalog();

    private static HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> genForupdateCatalog() {
        // basic
        HttpRequestDef.Builder<UpdateCatalogRequest, UpdateCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCatalogRequest.class, UpdateCatalogResponse.class)
                .withName("UpdateCatalog")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<CatalogInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogInput.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForcreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForcreateDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRequest, CreateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRequest.class, CreateDatabaseResponse.class)
                .withName("CreateDatabase")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<DatabaseInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseInput.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genFordeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genFordeleteDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRequest, DeleteDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRequest.class, DeleteDatabaseResponse.class)
                .withName("DeleteDatabase")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<Boolean>withRequestField("delete_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDeleteData, (req, v) -> {
                req.setDeleteData(v);
            }));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getCascade, (req, v) -> {
                req.setCascade(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseNamesRequest, ListDatabaseNamesResponse> listDatabaseNames =
        genForlistDatabaseNames();

    private static HttpRequestDef<ListDatabaseNamesRequest, ListDatabaseNamesResponse> genForlistDatabaseNames() {
        // basic
        HttpRequestDef.Builder<ListDatabaseNamesRequest, ListDatabaseNamesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseNamesRequest.class, ListDatabaseNamesResponse.class)
                .withName("ListDatabaseNames")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/names")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseNamesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseNamesRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseNamesRequest::getDatabasePattern, (req, v) -> {
                req.setDatabasePattern(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDatabaseNamesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForlistDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForlistDatabases() {
        // basic
        HttpRequestDef.Builder<ListDatabasesRequest, ListDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabasesRequest.class, ListDatabasesResponse.class)
                .withName("ListDatabases")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getDatabaseNamePattern, (req, v) -> {
                req.setDatabaseNamePattern(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDatabasesRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseRequest, ShowDatabaseResponse> showDatabase = genForshowDatabase();

    private static HttpRequestDef<ShowDatabaseRequest, ShowDatabaseResponse> genForshowDatabase() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseRequest, ShowDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDatabaseRequest.class, ShowDatabaseResponse.class)
                .withName("ShowDatabase")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabase =
        genForupdateDatabase();

    private static HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> genForupdateDatabase() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseRequest, UpdateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDatabaseRequest.class, UpdateDatabaseResponse.class)
                .withName("UpdateDatabase")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<DatabaseInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseInput.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> createFunction =
        genForcreateFunction();

    private static HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> genForcreateFunction() {
        // basic
        HttpRequestDef.Builder<CreateFunctionRequest, CreateFunctionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFunctionRequest.class, CreateFunctionResponse.class)
            .withName("CreateFunction")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/functions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFunctionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFunctionRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFunctionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<FunctionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FunctionInput.class),
            f -> f.withMarshaller(CreateFunctionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunction =
        genFordeleteFunction();

    private static HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> genFordeleteFunction() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionRequest, DeleteFunctionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteFunctionRequest.class, DeleteFunctionResponse.class)
            .withName("DeleteFunction")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/functions/{function_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("function_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getFunctionName, (req, v) -> {
                req.setFunctionName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllFunctionsRequest, ListAllFunctionsResponse> listAllFunctions =
        genForlistAllFunctions();

    private static HttpRequestDef<ListAllFunctionsRequest, ListAllFunctionsResponse> genForlistAllFunctions() {
        // basic
        HttpRequestDef.Builder<ListAllFunctionsRequest, ListAllFunctionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllFunctionsRequest.class, ListAllFunctionsResponse.class)
                .withName("ListAllFunctions")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/functions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> listFunctions =
        genForlistFunctions();

    private static HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> genForlistFunctions() {
        // basic
        HttpRequestDef.Builder<ListFunctionsRequest, ListFunctionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFunctionsRequest.class, ListFunctionsResponse.class)
            .withName("ListFunctions")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/functions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("function_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getFunctionNamePattern, (req, v) -> {
                req.setFunctionNamePattern(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFunctionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFunctionsRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionRequest, ShowFunctionResponse> showFunction = genForshowFunction();

    private static HttpRequestDef<ShowFunctionRequest, ShowFunctionResponse> genForshowFunction() {
        // basic
        HttpRequestDef.Builder<ShowFunctionRequest, ShowFunctionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFunctionRequest.class, ShowFunctionResponse.class)
            .withName("ShowFunction")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/functions/{function_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("function_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionRequest::getFunctionName, (req, v) -> {
                req.setFunctionName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionRequest, UpdateFunctionResponse> updateFunction =
        genForupdateFunction();

    private static HttpRequestDef<UpdateFunctionRequest, UpdateFunctionResponse> genForupdateFunction() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionRequest, UpdateFunctionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateFunctionRequest.class, UpdateFunctionResponse.class)
            .withName("UpdateFunction")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/functions/{function_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("function_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getFunctionName, (req, v) -> {
                req.setFunctionName(v);
            }));
        builder.<FunctionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FunctionInput.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgreementRequest, CreateAgreementResponse> createAgreement =
        genForcreateAgreement();

    private static HttpRequestDef<CreateAgreementRequest, CreateAgreementResponse> genForcreateAgreement() {
        // basic
        HttpRequestDef.Builder<CreateAgreementRequest, CreateAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgreementRequest.class, CreateAgreementResponse.class)
                .withName("CreateAgreement")
                .withUri("/v1/{project_id}/agreement")
                .withContentType("application/json");

        // requests
        builder.<TenantAgreementBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TenantAgreementBody.class),
            f -> f.withMarshaller(CreateAgreementRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAgreementResponse::getXRequestId, CreateAgreementResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAgreementRequest, ShowAgreementResponse> showAgreement =
        genForshowAgreement();

    private static HttpRequestDef<ShowAgreementRequest, ShowAgreementResponse> genForshowAgreement() {
        // basic
        HttpRequestDef.Builder<ShowAgreementRequest, ShowAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgreementRequest.class, ShowAgreementResponse.class)
                .withName("ShowAgreement")
                .withUri("/v1/{project_id}/agreement")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAgreementResponse::getXRequestId, ShowAgreementResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRule =
        genForshowAgreementRule();

    private static HttpRequestDef<ShowAgreementRuleRequest, ShowAgreementRuleResponse> genForshowAgreementRule() {
        // basic
        HttpRequestDef.Builder<ShowAgreementRuleRequest, ShowAgreementRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgreementRuleRequest.class, ShowAgreementRuleResponse.class)
                .withName("ShowAgreementRule")
                .withUri("/v1/{project_id}/agreement-rule")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAgreementRuleResponse::getXRequestId, ShowAgreementRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CountMetaObjRequest, CountMetaObjResponse> countMetaObj = genForcountMetaObj();

    private static HttpRequestDef<CountMetaObjRequest, CountMetaObjResponse> genForcountMetaObj() {
        // basic
        HttpRequestDef.Builder<CountMetaObjRequest, CountMetaObjResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountMetaObjRequest.class, CountMetaObjResponse.class)
                .withName("CountMetaObj")
                .withUri("/v1/{project_id}/instances/{instance_id}/metaobj/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountMetaObjRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> deleteLakeFormationInstance =
        genFordeleteLakeFormationInstance();

    private static HttpRequestDef<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> genFordeleteLakeFormationInstance() {
        // basic
        HttpRequestDef.Builder<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteLakeFormationInstanceRequest.class,
                    DeleteLakeFormationInstanceResponse.class)
                .withName("DeleteLakeFormationInstance")
                .withUri("/v1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLakeFormationInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Boolean>withRequestField("to_recycle_bin",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteLakeFormationInstanceRequest::getToRecycleBin, (req, v) -> {
                req.setToRecycleBin(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLakeFormationInstanceResponse::getXRequestId,
                DeleteLakeFormationInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> listLakeFormationInstances =
        genForlistLakeFormationInstances();

    private static HttpRequestDef<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> genForlistLakeFormationInstances() {
        // basic
        HttpRequestDef.Builder<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLakeFormationInstancesRequest.class,
                    ListLakeFormationInstancesResponse.class)
                .withName("ListLakeFormationInstances")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("in_recycle_bin",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getInRecycleBin, (req, v) -> {
                req.setInRecycleBin(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLakeFormationInstancesResponse::getXRequestId,
                ListLakeFormationInstancesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> moveLakeFormationInstanceOutRecycleBin =
        genFormoveLakeFormationInstanceOutRecycleBin();

    private static HttpRequestDef<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> genFormoveLakeFormationInstanceOutRecycleBin() {
        // basic
        HttpRequestDef.Builder<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    MoveLakeFormationInstanceOutRecycleBinRequest.class,
                    MoveLakeFormationInstanceOutRecycleBinResponse.class)
                .withName("MoveLakeFormationInstanceOutRecycleBin")
                .withUri("/v1/{project_id}/instances/{instance_id}/recover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveLakeFormationInstanceOutRecycleBinRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(MoveLakeFormationInstanceOutRecycleBinResponse::getXRequestId,
                MoveLakeFormationInstanceOutRecycleBinResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> showLakeFormationInstance =
        genForshowLakeFormationInstance();

    private static HttpRequestDef<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> genForshowLakeFormationInstance() {
        // basic
        HttpRequestDef.Builder<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLakeFormationInstanceRequest.class,
                    ShowLakeFormationInstanceResponse.class)
                .withName("ShowLakeFormationInstance")
                .withUri("/v1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLakeFormationInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLakeFormationInstanceResponse::getXRequestId,
                ShowLakeFormationInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> updateLakeFormationInstance =
        genForupdateLakeFormationInstance();

    private static HttpRequestDef<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> genForupdateLakeFormationInstance() {
        // basic
        HttpRequestDef.Builder<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateLakeFormationInstanceRequest.class,
                    UpdateLakeFormationInstanceResponse.class)
                .withName("UpdateLakeFormationInstance")
                .withUri("/v1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLakeFormationInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateLakeFormationInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLakeFormationInstance.class),
            f -> f.withMarshaller(UpdateLakeFormationInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> listObsBuckets =
        genForlistObsBuckets();

    private static HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> genForlistObsBuckets() {
        // basic
        HttpRequestDef.Builder<ListObsBucketsRequest, ListObsBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsBucketsRequest.class, ListObsBucketsResponse.class)
                .withName("ListObsBuckets")
                .withUri("/v1/{project_id}/obs/buckets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObsBucketsResponse::getXRequestId, ListObsBucketsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListObsObjectRequest, ListObsObjectResponse> listObsObject =
        genForlistObsObject();

    private static HttpRequestDef<ListObsObjectRequest, ListObsObjectResponse> genForlistObsObject() {
        // basic
        HttpRequestDef.Builder<ListObsObjectRequest, ListObsObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsObjectRequest.class, ListObsObjectResponse.class)
                .withName("ListObsObject")
                .withUri("/v1/{project_id}/obs/buckets/{bucket_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsObjectRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsObjectRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsObjectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsObjectRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPartitionsRequest, AddPartitionsResponse> addPartitions =
        genForaddPartitions();

    private static HttpRequestDef<AddPartitionsRequest, AddPartitionsResponse> genForaddPartitions() {
        // basic
        HttpRequestDef.Builder<AddPartitionsRequest, AddPartitionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddPartitionsRequest.class, AddPartitionsResponse.class)
            .withName("AddPartitions")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/batch-create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPartitionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPartitionsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPartitionsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPartitionsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<AddPartitionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddPartitionInput.class),
            f -> f.withMarshaller(AddPartitionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddPartitionsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePartitionRequest, BatchDeletePartitionResponse> batchDeletePartition =
        genForbatchDeletePartition();

    private static HttpRequestDef<BatchDeletePartitionRequest, BatchDeletePartitionResponse> genForbatchDeletePartition() {
        // basic
        HttpRequestDef.Builder<BatchDeletePartitionRequest, BatchDeletePartitionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeletePartitionRequest.class, BatchDeletePartitionResponse.class)
            .withName("BatchDeletePartition")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/batch-drop")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<DropPartitionsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DropPartitionsInput.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeletePartitionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatistics =
        genForbatchDeletePartitionedStatistics();

    private static HttpRequestDef<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> genForbatchDeletePartitionedStatistics() {
        // basic
        HttpRequestDef.Builder<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeletePartitionedStatisticsRequest.class,
                    BatchDeletePartitionedStatisticsResponse.class)
                .withName("BatchDeletePartitionedStatistics")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/batch-truncate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<TruncatePartitionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TruncatePartitionInput.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> batchListPartitionByValues =
        genForbatchListPartitionByValues();

    private static HttpRequestDef<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> genForbatchListPartitionByValues() {
        // basic
        HttpRequestDef.Builder<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchListPartitionByValuesRequest.class,
                    BatchListPartitionByValuesResponse.class)
                .withName("BatchListPartitionByValues")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/batch-get")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<GetPartitionsByValuesInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetPartitionsByValuesInput.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchListPartitionByValuesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> batchUpdatePartition =
        genForbatchUpdatePartition();

    private static HttpRequestDef<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> genForbatchUpdatePartition() {
        // basic
        HttpRequestDef.Builder<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdatePartitionRequest.class, BatchUpdatePartitionResponse.class)
            .withName("BatchUpdatePartition")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/batch-alter")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<AlterPartitionsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterPartitionsInput.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdatePartitionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionNamesRequest, ListPartitionNamesResponse> listPartitionNames =
        genForlistPartitionNames();

    private static HttpRequestDef<ListPartitionNamesRequest, ListPartitionNamesResponse> genForlistPartitionNames() {
        // basic
        HttpRequestDef.Builder<ListPartitionNamesRequest, ListPartitionNamesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPartitionNamesRequest.class, ListPartitionNamesResponse.class)
            .withName("ListPartitionNames")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/partition-names")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> listPartitions =
        genForlistPartitions();

    private static HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> genForlistPartitions() {
        // basic
        HttpRequestDef.Builder<ListPartitionsRequest, ListPartitionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPartitionsRequest.class, ListPartitionsResponse.class)
            .withName("ListPartitions")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<List<String>>withRequestField("partition_values",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPartitionsRequest::getPartitionValues, (req, v) -> {
                req.setPartitionValues(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartitionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPartitionsRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatistics =
        genForbatchShowPartitionColumnStatistics();

    private static HttpRequestDef<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> genForbatchShowPartitionColumnStatistics() {
        // basic
        HttpRequestDef.Builder<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchShowPartitionColumnStatisticsRequest.class,
                    BatchShowPartitionColumnStatisticsResponse.class)
                .withName("BatchShowPartitionColumnStatistics")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/column-statistics/batch-get")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<GetPartitionColumnStatisticsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetPartitionColumnStatisticsInput.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatistics =
        genFordeletePartitionColumnStatistics();

    private static HttpRequestDef<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> genFordeletePartitionColumnStatistics() {
        // basic
        HttpRequestDef.Builder<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeletePartitionColumnStatisticsRequest.class,
                    DeletePartitionColumnStatisticsResponse.class)
                .withName("DeletePartitionColumnStatistics")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/column-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<List<String>>withRequestField("partition_values",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getPartitionValues, (req, v) -> {
                req.setPartitionValues(v);
            }));
        builder.<String>withRequestField("column_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getColumnName, (req, v) -> {
                req.setColumnName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> setPartitionColumnStatistics =
        genForsetPartitionColumnStatistics();

    private static HttpRequestDef<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> genForsetPartitionColumnStatistics() {
        // basic
        HttpRequestDef.Builder<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetPartitionColumnStatisticsRequest.class,
                    SetPartitionColumnStatisticsResponse.class)
                .withName("SetPartitionColumnStatistics")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/column-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<SetPartitionColumnStatisticsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetPartitionColumnStatisticsInput.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<PartitionColumnStatistics>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PartitionColumnStatistics.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoleRequest, CreateRoleResponse> createRole = genForcreateRole();

    private static HttpRequestDef<CreateRoleRequest, CreateRoleResponse> genForcreateRole() {
        // basic
        HttpRequestDef.Builder<CreateRoleRequest, CreateRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoleRequest.class, CreateRoleResponse.class)
                .withName("CreateRole")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RoleInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoleInput.class),
            f -> f.withMarshaller(CreateRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoleRequest, DeleteRoleResponse> deleteRole = genFordeleteRole();

    private static HttpRequestDef<DeleteRoleRequest, DeleteRoleResponse> genFordeleteRole() {
        // basic
        HttpRequestDef.Builder<DeleteRoleRequest, DeleteRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRoleRequest.class, DeleteRoleResponse.class)
                .withName("DeleteRole")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/{role_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoleRequest::getRoleName, (req, v) -> {
                req.setRoleName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRoleNamesRequest, ListRoleNamesResponse> listRoleNames =
        genForlistRoleNames();

    private static HttpRequestDef<ListRoleNamesRequest, ListRoleNamesResponse> genForlistRoleNames() {
        // basic
        HttpRequestDef.Builder<ListRoleNamesRequest, ListRoleNamesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoleNamesRequest.class, ListRoleNamesResponse.class)
                .withName("ListRoleNames")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/names")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoleNamesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRoleNamesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRolesRequest, ListRolesResponse> listRoles = genForlistRoles();

    private static HttpRequestDef<ListRolesRequest, ListRolesResponse> genForlistRoles() {
        // basic
        HttpRequestDef.Builder<ListRolesRequest, ListRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRolesRequest.class, ListRolesResponse.class)
                .withName("ListRoles")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("role_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesRequest::getRolePattern, (req, v) -> {
                req.setRolePattern(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRolesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRolesRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoleRequest, ShowRoleResponse> showRole = genForshowRole();

    private static HttpRequestDef<ShowRoleRequest, ShowRoleResponse> genForshowRole() {
        // basic
        HttpRequestDef.Builder<ShowRoleRequest, ShowRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRoleRequest.class, ShowRoleResponse.class)
                .withName("ShowRole")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/{role_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoleRequest::getRoleName, (req, v) -> {
                req.setRoleName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoleRequest, UpdateRoleResponse> updateRole = genForupdateRole();

    private static HttpRequestDef<UpdateRoleRequest, UpdateRoleResponse> genForupdateRole() {
        // basic
        HttpRequestDef.Builder<UpdateRoleRequest, UpdateRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRoleRequest.class, UpdateRoleResponse.class)
                .withName("UpdateRole")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/{role_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoleRequest::getRoleName, (req, v) -> {
                req.setRoleName(v);
            }));
        builder.<AlterRoleInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterRoleInput.class),
            f -> f.withMarshaller(UpdateRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecsRequest, ListSpecsResponse> listSpecs = genForlistSpecs();

    private static HttpRequestDef<ListSpecsRequest, ListSpecsResponse> genForlistSpecs() {
        // basic
        HttpRequestDef.Builder<ListSpecsRequest, ListSpecsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSpecsRequest.class, ListSpecsResponse.class)
                .withName("ListSpecs")
                .withUri("/v1/{project_id}/specs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
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
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<TableInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableInput.class),
            f -> f.withMarshaller(CreateTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAllTablesRequest, DeleteAllTablesResponse> deleteAllTables =
        genFordeleteAllTables();

    private static HttpRequestDef<DeleteAllTablesRequest, DeleteAllTablesResponse> genFordeleteAllTables() {
        // basic
        HttpRequestDef.Builder<DeleteAllTablesRequest, DeleteAllTablesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteAllTablesRequest.class, DeleteAllTablesResponse.class)
            .withName("DeleteAllTables")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/truncate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAllTablesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAllTablesRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAllTablesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAllTablesRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genFordeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genFordeleteTable() {
        // basic
        HttpRequestDef.Builder<DeleteTableRequest, DeleteTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTableRequest.class, DeleteTableResponse.class)
            .withName("DeleteTable")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<Boolean>withRequestField("delete_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteTableRequest::getDeleteData, (req, v) -> {
                req.setDeleteData(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableMetaRequest, ListTableMetaResponse> listTableMeta =
        genForlistTableMeta();

    private static HttpRequestDef<ListTableMetaRequest, ListTableMetaResponse> genForlistTableMeta() {
        // basic
        HttpRequestDef.Builder<ListTableMetaRequest, ListTableMetaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTableMetaRequest.class, ListTableMetaResponse.class)
                .withName("ListTableMeta")
                .withUri("/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getDatabaseNamePattern, (req, v) -> {
                req.setDatabaseNamePattern(v);
            }));
        builder.<String>withRequestField("table_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getTableNamePattern, (req, v) -> {
                req.setTableNamePattern(v);
            }));
        builder.<List<ListTableMetaRequest.TableTypesEnum>>withRequestField("table_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTableMetaRequest::getTableTypes, (req, v) -> {
                req.setTableTypes(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableMetaRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTableMetaRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableNamesRequest, ListTableNamesResponse> listTableNames =
        genForlistTableNames();

    private static HttpRequestDef<ListTableNamesRequest, ListTableNamesResponse> genForlistTableNames() {
        // basic
        HttpRequestDef.Builder<ListTableNamesRequest, ListTableNamesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTableNamesRequest.class, ListTableNamesResponse.class)
            .withName("ListTableNames")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/names")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getTablePattern, (req, v) -> {
                req.setTablePattern(v);
            }));
        builder.<String>withRequestField("table_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getTableType, (req, v) -> {
                req.setTableType(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTableNamesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesRequest, ListTablesResponse> listTables = genForlistTables();

    private static HttpRequestDef<ListTablesRequest, ListTablesResponse> genForlistTables() {
        // basic
        HttpRequestDef.Builder<ListTablesRequest, ListTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablesRequest.class, ListTablesResponse.class)
                .withName("ListTables")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTableNamePattern, (req, v) -> {
                req.setTableNamePattern(v);
            }));
        builder.<ListTablesRequest.TableTypeEnum>withRequestField("table_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTablesRequest.TableTypeEnum.class),
            f -> f.withMarshaller(ListTablesRequest::getTableType, (req, v) -> {
                req.setTableType(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTablesRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesByNameRequest, ListTablesByNameResponse> listTablesByName =
        genForlistTablesByName();

    private static HttpRequestDef<ListTablesByNameRequest, ListTablesByNameResponse> genForlistTablesByName() {
        // basic
        HttpRequestDef.Builder<ListTablesByNameRequest, ListTablesByNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListTablesByNameRequest.class, ListTablesByNameResponse.class)
            .withName("ListTablesByName")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/list-by-names")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesByNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesByNameRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesByNameRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<ListTableByNameInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTableByNameInput.class),
            f -> f.withMarshaller(ListTablesByNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<Table>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTablesByNameResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Table.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableRequest, ShowTableResponse> showTable = genForshowTable();

    private static HttpRequestDef<ShowTableRequest, ShowTableResponse> genForshowTable() {
        // basic
        HttpRequestDef.Builder<ShowTableRequest, ShowTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTableRequest.class, ShowTableResponse.class)
            .withName("ShowTable")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableRequest, UpdateTableResponse> updateTable = genForupdateTable();

    private static HttpRequestDef<UpdateTableRequest, UpdateTableResponse> genForupdateTable() {
        // basic
        HttpRequestDef.Builder<UpdateTableRequest, UpdateTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTableRequest.class, UpdateTableResponse.class)
            .withName("UpdateTable")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<AlterTableInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterTableInput.class),
            f -> f.withMarshaller(UpdateTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> deleteTableColumnStatistics =
        genFordeleteTableColumnStatistics();

    private static HttpRequestDef<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> genFordeleteTableColumnStatistics() {
        // basic
        HttpRequestDef.Builder<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTableColumnStatisticsRequest.class,
                    DeleteTableColumnStatisticsResponse.class)
                .withName("DeleteTableColumnStatistics")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/column-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("column_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getColumnName, (req, v) -> {
                req.setColumnName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> listTableColumnStatistics =
        genForlistTableColumnStatistics();

    private static HttpRequestDef<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> genForlistTableColumnStatistics() {
        // basic
        HttpRequestDef.Builder<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTableColumnStatisticsRequest.class,
                    ListTableColumnStatisticsResponse.class)
                .withName("ListTableColumnStatistics")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/column-statistics/batch-get")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<GetTableColumnStatisticsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetTableColumnStatisticsInput.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ColumnStatisticsObj>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTableColumnStatisticsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ColumnStatisticsObj.class));

        return builder.build();
    }

    public static final HttpRequestDef<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> setTableColumnStatistics =
        genForsetTableColumnStatistics();

    private static HttpRequestDef<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> genForsetTableColumnStatistics() {
        // basic
        HttpRequestDef.Builder<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SetTableColumnStatisticsRequest.class, SetTableColumnStatisticsResponse.class)
                .withName("SetTableColumnStatistics")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/column-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<MergeTableColumnStatisticInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MergeTableColumnStatisticInput.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateConstraintRequest, BatchCreateConstraintResponse> batchCreateConstraint =
        genForbatchCreateConstraint();

    private static HttpRequestDef<BatchCreateConstraintRequest, BatchCreateConstraintResponse> genForbatchCreateConstraint() {
        // basic
        HttpRequestDef.Builder<BatchCreateConstraintRequest, BatchCreateConstraintResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateConstraintRequest.class, BatchCreateConstraintResponse.class)
            .withName("BatchCreateConstraint")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/constraints")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<TableConstraintsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableConstraintsInput.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConstraintRequest, DeleteConstraintResponse> deleteConstraint =
        genFordeleteConstraint();

    private static HttpRequestDef<DeleteConstraintRequest, DeleteConstraintResponse> genFordeleteConstraint() {
        // basic
        HttpRequestDef.Builder<DeleteConstraintRequest, DeleteConstraintResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConstraintRequest.class, DeleteConstraintResponse.class)
            .withName("DeleteConstraint")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/constraints/{constraint_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("constraint_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getConstraintName, (req, v) -> {
                req.setConstraintName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConstraintsRequest, ListConstraintsResponse> listConstraints =
        genForlistConstraints();

    private static HttpRequestDef<ListConstraintsRequest, ListConstraintsResponse> genForlistConstraints() {
        // basic
        HttpRequestDef.Builder<ListConstraintsRequest, ListConstraintsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListConstraintsRequest.class, ListConstraintsResponse.class)
            .withName("ListConstraints")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/constraints")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getCatalogName, (req, v) -> {
                req.setCatalogName(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<ListConstraintsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConstraintsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListConstraintsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("parent_db",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getParentDb, (req, v) -> {
                req.setParentDb(v);
            }));
        builder.<String>withRequestField("parent_tbl",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getParentTbl, (req, v) -> {
                req.setParentTbl(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsForDomainRequest, ListGroupsForDomainResponse> listGroupsForDomain =
        genForlistGroupsForDomain();

    private static HttpRequestDef<ListGroupsForDomainRequest, ListGroupsForDomainResponse> genForlistGroupsForDomain() {
        // basic
        HttpRequestDef.Builder<ListGroupsForDomainRequest, ListGroupsForDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupsForDomainRequest.class, ListGroupsForDomainResponse.class)
                .withName("ListGroupsForDomain")
                .withUri("/v1/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListGroupsForDomainRequest.GroupSourceEnum>withRequestField("group_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupsForDomainRequest.GroupSourceEnum.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getGroupSource, (req, v) -> {
                req.setGroupSource(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getReversePage, (req, v) -> {
                req.setReversePage(v);
            }));

        // response

        return builder.build();
    }

}
