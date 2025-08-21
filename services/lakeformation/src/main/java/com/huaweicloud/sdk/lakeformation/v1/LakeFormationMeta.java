package com.huaweicloud.sdk.lakeformation.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.lakeformation.v1.model.AccessClientRequestBody;
import com.huaweicloud.sdk.lakeformation.v1.model.AccessPolicyInput;
import com.huaweicloud.sdk.lakeformation.v1.model.AccessRequestInfo;
import com.huaweicloud.sdk.lakeformation.v1.model.AddPartitionInput;
import com.huaweicloud.sdk.lakeformation.v1.model.AddPartitionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AddPartitionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AgencyRequestBody;
import com.huaweicloud.sdk.lakeformation.v1.model.AlterPartitionsInput;
import com.huaweicloud.sdk.lakeformation.v1.model.AlterRoleInput;
import com.huaweicloud.sdk.lakeformation.v1.model.AlterTableInput;
import com.huaweicloud.sdk.lakeformation.v1.model.ApplyForAccessRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ApplyForAccessResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociatePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociatePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociateRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociateRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AuthorizeAccessServiceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AuthorizeAccessServiceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchAuthorizeInterfaceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchAuthorizeInterfaceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCancelAuthorizationInterfaceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCancelAuthorizationInterfaceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCheckPermissionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCheckPermissionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCreateConstraintRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCreateConstraintResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionedStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionedStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchListPartitionByValuesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchListPartitionByValuesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchShowPartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchShowPartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdateLakeFormationInstanceTagsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdateLakeFormationInstanceTagsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdatePartitionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdatePartitionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdateTagsRequestBody;
import com.huaweicloud.sdk.lakeformation.v1.model.Catalog;
import com.huaweicloud.sdk.lakeformation.v1.model.CatalogInput;
import com.huaweicloud.sdk.lakeformation.v1.model.CheckPermissionInput;
import com.huaweicloud.sdk.lakeformation.v1.model.CheckPermissionResult;
import com.huaweicloud.sdk.lakeformation.v1.model.ColumnStatisticsObj;
import com.huaweicloud.sdk.lakeformation.v1.model.CountMetaObjRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CountMetaObjResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateInstanceRequestBody;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DatabaseInput;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAllTablesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAllTablesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteConstraintRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteConstraintResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeletePartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeletePartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DropPartitionsInput;
import com.huaweicloud.sdk.lakeformation.v1.model.FunctionInput;
import com.huaweicloud.sdk.lakeformation.v1.model.GetPartitionColumnStatisticsInput;
import com.huaweicloud.sdk.lakeformation.v1.model.GetPartitionsByValuesInput;
import com.huaweicloud.sdk.lakeformation.v1.model.GetTableColumnStatisticsInput;
import com.huaweicloud.sdk.lakeformation.v1.model.GrantAccessServiceRequestBody;
import com.huaweicloud.sdk.lakeformation.v1.model.IdentityInput;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessClientInfosRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessClientInfosResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessInfosRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessInfosResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAllFunctionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAllFunctionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListCatalogsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListCatalogsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConfigsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConfigsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConstraintsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConstraintsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabaseNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabaseNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListGroupsForDomainRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListGroupsForDomainResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListInterfacesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListInterfacesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstanceTagsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstanceTagsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstancesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstancesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsObjectRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsObjectResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesWithoutLimitRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesWithoutLimitResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRoleNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRoleNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListSpecsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListSpecsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableByNameInput;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableMetaRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableMetaResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesByNameRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesByNameResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUserRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUserRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.MergeTableColumnStatisticInput;
import com.huaweicloud.sdk.lakeformation.v1.model.MoveLakeFormationInstanceOutRecycleBinRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.MoveLakeFormationInstanceOutRecycleBinResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.Partition;
import com.huaweicloud.sdk.lakeformation.v1.model.Principal;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokeRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokeRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.Role;
import com.huaweicloud.sdk.lakeformation.v1.model.RoleInfoInput;
import com.huaweicloud.sdk.lakeformation.v1.model.RoleInput;
import com.huaweicloud.sdk.lakeformation.v1.model.SetPartitionColumnStatisticsInput;
import com.huaweicloud.sdk.lakeformation.v1.model.SetPartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.SetPartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.SetTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.SetTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessServiceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessServiceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRuleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRuleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCredentialRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCredentialResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowSyncPolicyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowSyncPolicyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.Table;
import com.huaweicloud.sdk.lakeformation.v1.model.TableConstraintsInput;
import com.huaweicloud.sdk.lakeformation.v1.model.TableInput;
import com.huaweicloud.sdk.lakeformation.v1.model.TenantAgreementBody;
import com.huaweicloud.sdk.lakeformation.v1.model.TruncatePartitionInput;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateAccessClientRequestBody;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstance;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceDefaultRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceDefaultResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceScale;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceScaleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceScaleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdatePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdatePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateTableResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class LakeFormationMeta {

    public static final HttpRequestDef<ApplyForAccessRequest, ApplyForAccessResponse> applyForAccess =
        genForApplyForAccess();

    private static HttpRequestDef<ApplyForAccessRequest, ApplyForAccessResponse> genForApplyForAccess() {
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
            f -> f.withMarshaller(ApplyForAccessRequest::getInstanceId, ApplyForAccessRequest::setInstanceId));
        builder.<List<AccessRequestInfo>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ApplyForAccessRequest::getBody, ApplyForAccessRequest::setBody)
                .withInnerContainerType(AccessRequestInfo.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> batchAuthorizeInterface =
        genForBatchAuthorizeInterface();

    private static HttpRequestDef<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> genForBatchAuthorizeInterface() {
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
            f -> f.withMarshaller(BatchAuthorizeInterfaceRequest::getInstanceId,
                BatchAuthorizeInterfaceRequest::setInstanceId));
        builder.<AccessPolicyInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessPolicyInput.class),
            f -> f.withMarshaller(BatchAuthorizeInterfaceRequest::getBody, BatchAuthorizeInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterface =
        genForBatchCancelAuthorizationInterface();

    private static HttpRequestDef<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> genForBatchCancelAuthorizationInterface() {
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
            f -> f.withMarshaller(BatchCancelAuthorizationInterfaceRequest::getInstanceId,
                BatchCancelAuthorizationInterfaceRequest::setInstanceId));
        builder.<AccessPolicyInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessPolicyInput.class),
            f -> f.withMarshaller(BatchCancelAuthorizationInterfaceRequest::getBody,
                BatchCancelAuthorizationInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckPermissionRequest, BatchCheckPermissionResponse> batchCheckPermission =
        genForBatchCheckPermission();

    private static HttpRequestDef<BatchCheckPermissionRequest, BatchCheckPermissionResponse> genForBatchCheckPermission() {
        // basic
        HttpRequestDef.Builder<BatchCheckPermissionRequest, BatchCheckPermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCheckPermissionRequest.class, BatchCheckPermissionResponse.class)
            .withName("BatchCheckPermission")
            .withUri("/v1/{project_id}/instances/{instance_id}/policies/check-permission")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckPermissionRequest::getInstanceId,
                BatchCheckPermissionRequest::setInstanceId));
        builder.<CheckPermissionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckPermissionInput.class),
            f -> f.withMarshaller(BatchCheckPermissionRequest::getBody, BatchCheckPermissionRequest::setBody));

        // response
        builder.<List<CheckPermissionResult>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchCheckPermissionResponse::getBody, BatchCheckPermissionResponse::setBody)
                .withInnerContainerType(CheckPermissionResult.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessClientRequest, CreateAccessClientResponse> createAccessClient =
        genForCreateAccessClient();

    private static HttpRequestDef<CreateAccessClientRequest, CreateAccessClientResponse> genForCreateAccessClient() {
        // basic
        HttpRequestDef.Builder<CreateAccessClientRequest, CreateAccessClientResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessClientRequest.class, CreateAccessClientResponse.class)
                .withName("CreateAccessClient")
                .withUri("/v1/{project_id}/instances/{instance_id}/access-clients")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessClientRequest::getInstanceId, CreateAccessClientRequest::setInstanceId));
        builder.<AccessClientRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessClientRequestBody.class),
            f -> f.withMarshaller(CreateAccessClientRequest::getBody, CreateAccessClientRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessClientRequest, DeleteAccessClientResponse> deleteAccessClient =
        genForDeleteAccessClient();

    private static HttpRequestDef<DeleteAccessClientRequest, DeleteAccessClientResponse> genForDeleteAccessClient() {
        // basic
        HttpRequestDef.Builder<DeleteAccessClientRequest, DeleteAccessClientResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccessClientRequest.class, DeleteAccessClientResponse.class)
                .withName("DeleteAccessClient")
                .withUri("/v1/{project_id}/instances/{instance_id}/access-clients/{client_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessClientRequest::getInstanceId, DeleteAccessClientRequest::setInstanceId));
        builder.<String>withRequestField("client_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessClientRequest::getClientId, DeleteAccessClientRequest::setClientId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessClientInfosRequest, ListAccessClientInfosResponse> listAccessClientInfos =
        genForListAccessClientInfos();

    private static HttpRequestDef<ListAccessClientInfosRequest, ListAccessClientInfosResponse> genForListAccessClientInfos() {
        // basic
        HttpRequestDef.Builder<ListAccessClientInfosRequest, ListAccessClientInfosResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessClientInfosRequest.class, ListAccessClientInfosResponse.class)
            .withName("ListAccessClientInfos")
            .withUri("/v1/{project_id}/instances/{instance_id}/access-clients")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessClientInfosRequest::getInstanceId,
                ListAccessClientInfosRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessClientInfosRequest::getId, ListAccessClientInfosRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessClientInfosRequest::getName, ListAccessClientInfosRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessClientInfosRequest::getOffset, ListAccessClientInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessClientInfosRequest::getLimit, ListAccessClientInfosRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessInfosRequest, ListAccessInfosResponse> listAccessInfos =
        genForListAccessInfos();

    private static HttpRequestDef<ListAccessInfosRequest, ListAccessInfosResponse> genForListAccessInfos() {
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
            f -> f.withMarshaller(ListAccessInfosRequest::getInstanceId, ListAccessInfosRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessInfosRequest::getOffset, ListAccessInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessInfosRequest::getLimit, ListAccessInfosRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInterfacesRequest, ListInterfacesResponse> listInterfaces =
        genForListInterfaces();

    private static HttpRequestDef<ListInterfacesRequest, ListInterfacesResponse> genForListInterfaces() {
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
            f -> f.withMarshaller(ListInterfacesRequest::getInstanceId, ListInterfacesRequest::setInstanceId));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getFilter, ListInterfacesRequest::setFilter));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getResourceName, ListInterfacesRequest::setResourceName));
        builder.<ListInterfacesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInterfacesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListInterfacesRequest::getResourceType, ListInterfacesRequest::setResourceType));
        builder.<ListInterfacesRequest.PrincipalSourceEnum>withRequestField("principal_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInterfacesRequest.PrincipalSourceEnum.class),
            f -> f.withMarshaller(ListInterfacesRequest::getPrincipalSource,
                ListInterfacesRequest::setPrincipalSource));
        builder.<ListInterfacesRequest.PrincipalTypeEnum>withRequestField("principal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInterfacesRequest.PrincipalTypeEnum.class),
            f -> f.withMarshaller(ListInterfacesRequest::getPrincipalType, ListInterfacesRequest::setPrincipalType));
        builder.<String>withRequestField("principal_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getPrincipalName, ListInterfacesRequest::setPrincipalName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInterfacesRequest::getLimit, ListInterfacesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterfacesRequest::getMarker, ListInterfacesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForListPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForListPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/{project_id}/instances/{instance_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getInstanceId, ListPolicyRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getLimit, ListPolicyRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getMarker, ListPolicyRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPolicyRequest::getReversePage, ListPolicyRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessClientRequest, ShowAccessClientResponse> showAccessClient =
        genForShowAccessClient();

    private static HttpRequestDef<ShowAccessClientRequest, ShowAccessClientResponse> genForShowAccessClient() {
        // basic
        HttpRequestDef.Builder<ShowAccessClientRequest, ShowAccessClientResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessClientRequest.class, ShowAccessClientResponse.class)
                .withName("ShowAccessClient")
                .withUri("/v1/{project_id}/instances/{instance_id}/access-clients/{client_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessClientRequest::getInstanceId, ShowAccessClientRequest::setInstanceId));
        builder.<String>withRequestField("client_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessClientRequest::getClientId, ShowAccessClientRequest::setClientId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncPolicyRequest, ShowSyncPolicyResponse> showSyncPolicy =
        genForShowSyncPolicy();

    private static HttpRequestDef<ShowSyncPolicyRequest, ShowSyncPolicyResponse> genForShowSyncPolicy() {
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
            f -> f.withMarshaller(ShowSyncPolicyRequest::getInstanceId, ShowSyncPolicyRequest::setInstanceId));
        builder.<Long>withRequestField("last_known_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSyncPolicyRequest::getLastKnownVersion,
                ShowSyncPolicyRequest::setLastKnownVersion));
        builder.<Boolean>withRequestField("supports_policy_deltas",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowSyncPolicyRequest::getSupportsPolicyDeltas,
                ShowSyncPolicyRequest::setSupportsPolicyDeltas));
        builder.<Boolean>withRequestField("is_return_policy_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowSyncPolicyRequest::getIsReturnPolicyData,
                ShowSyncPolicyRequest::setIsReturnPolicyData));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessClientRequest, UpdateAccessClientResponse> updateAccessClient =
        genForUpdateAccessClient();

    private static HttpRequestDef<UpdateAccessClientRequest, UpdateAccessClientResponse> genForUpdateAccessClient() {
        // basic
        HttpRequestDef.Builder<UpdateAccessClientRequest, UpdateAccessClientResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAccessClientRequest.class, UpdateAccessClientResponse.class)
                .withName("UpdateAccessClient")
                .withUri("/v1/{project_id}/instances/{instance_id}/access-clients/{client_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessClientRequest::getInstanceId, UpdateAccessClientRequest::setInstanceId));
        builder.<String>withRequestField("client_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessClientRequest::getClientId, UpdateAccessClientRequest::setClientId));
        builder.<UpdateAccessClientRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAccessClientRequestBody.class),
            f -> f.withMarshaller(UpdateAccessClientRequest::getBody, UpdateAccessClientRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForCreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForCreateAgency() {
        // basic
        HttpRequestDef.Builder<CreateAgencyRequest, CreateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyRequest.class, CreateAgencyResponse.class)
                .withName("CreateAgency")
                .withUri("/v2/agency")
                .withContentType("application/json");

        // requests
        builder.<AgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgencyRequestBody.class),
            f -> f.withMarshaller(CreateAgencyRequest::getBody, CreateAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgency = genForDeleteAgency();

    private static HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> genForDeleteAgency() {
        // basic
        HttpRequestDef.Builder<DeleteAgencyRequest, DeleteAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgencyRequest.class, DeleteAgencyResponse.class)
                .withName("DeleteAgency")
                .withUri("/v2/agency")
                .withContentType("application/json");

        // requests
        builder.<AgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgencyRequestBody.class),
            f -> f.withMarshaller(DeleteAgencyRequest::getBody, DeleteAgencyRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAgencyResponse::getXRequestId, DeleteAgencyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForShowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForShowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withName("ShowAgency")
                .withUri("/v2/agency")
                .withContentType("application/json");

        // requests
        builder.<ShowAgencyRequest.AgencyTypeEnum>withRequestField("agency_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAgencyRequest.AgencyTypeEnum.class),
            f -> f.withMarshaller(ShowAgencyRequest::getAgencyType, ShowAgencyRequest::setAgencyType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> createCatalog =
        genForCreateCatalog();

    private static HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> genForCreateCatalog() {
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
            f -> f.withMarshaller(CreateCatalogRequest::getInstanceId, CreateCatalogRequest::setInstanceId));
        builder.<CatalogInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogInput.class),
            f -> f.withMarshaller(CreateCatalogRequest::getBody, CreateCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalog =
        genForDeleteCatalog();

    private static HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> genForDeleteCatalog() {
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
            f -> f.withMarshaller(DeleteCatalogRequest::getInstanceId, DeleteCatalogRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCatalogRequest::getCatalogName, DeleteCatalogRequest::setCatalogName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogsRequest, ListCatalogsResponse> listCatalogs = genForListCatalogs();

    private static HttpRequestDef<ListCatalogsRequest, ListCatalogsResponse> genForListCatalogs() {
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
            f -> f.withMarshaller(ListCatalogsRequest::getInstanceId, ListCatalogsRequest::setInstanceId));

        // response
        builder.<List<Catalog>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCatalogsResponse::getBody, ListCatalogsResponse::setBody)
                .withInnerContainerType(Catalog.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCatalogRequest, ShowCatalogResponse> showCatalog = genForShowCatalog();

    private static HttpRequestDef<ShowCatalogRequest, ShowCatalogResponse> genForShowCatalog() {
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
            f -> f.withMarshaller(ShowCatalogRequest::getInstanceId, ShowCatalogRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCatalogRequest::getCatalogName, ShowCatalogRequest::setCatalogName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalog =
        genForUpdateCatalog();

    private static HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> genForUpdateCatalog() {
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
            f -> f.withMarshaller(UpdateCatalogRequest::getInstanceId, UpdateCatalogRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getCatalogName, UpdateCatalogRequest::setCatalogName));
        builder.<CatalogInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogInput.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getBody, UpdateCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigsRequest, ListConfigsResponse> listConfigs = genForListConfigs();

    private static HttpRequestDef<ListConfigsRequest, ListConfigsResponse> genForListConfigs() {
        // basic
        HttpRequestDef.Builder<ListConfigsRequest, ListConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigsRequest.class, ListConfigsResponse.class)
                .withName("ListConfigs")
                .withUri("/v1/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigsRequest::getInstanceId, ListConfigsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigsRequest::getLimit, ListConfigsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigsRequest::getMarker, ListConfigsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCredentialRequest, ShowCredentialResponse> showCredential =
        genForShowCredential();

    private static HttpRequestDef<ShowCredentialRequest, ShowCredentialResponse> genForShowCredential() {
        // basic
        HttpRequestDef.Builder<ShowCredentialRequest, ShowCredentialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowCredentialRequest.class, ShowCredentialResponse.class)
                .withName("ShowCredential")
                .withUri("/v1/{project_id}/instances/{instance_id}/credential")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCredentialRequest::getInstanceId, ShowCredentialRequest::setInstanceId));
        builder.<IdentityInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdentityInput.class),
            f -> f.withMarshaller(ShowCredentialRequest::getBody, ShowCredentialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForCreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForCreateDatabase() {
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
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, CreateDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getCatalogName, CreateDatabaseRequest::setCatalogName));
        builder.<DatabaseInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseInput.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, CreateDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genForDeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genForDeleteDatabase() {
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
            f -> f.withMarshaller(DeleteDatabaseRequest::getInstanceId, DeleteDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getCatalogName, DeleteDatabaseRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDatabaseName, DeleteDatabaseRequest::setDatabaseName));
        builder.<Boolean>withRequestField("delete_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDeleteData, DeleteDatabaseRequest::setDeleteData));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getCascade, DeleteDatabaseRequest::setCascade));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseNamesRequest, ListDatabaseNamesResponse> listDatabaseNames =
        genForListDatabaseNames();

    private static HttpRequestDef<ListDatabaseNamesRequest, ListDatabaseNamesResponse> genForListDatabaseNames() {
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
            f -> f.withMarshaller(ListDatabaseNamesRequest::getInstanceId, ListDatabaseNamesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseNamesRequest::getCatalogName, ListDatabaseNamesRequest::setCatalogName));
        builder.<String>withRequestField("database_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseNamesRequest::getDatabasePattern,
                ListDatabaseNamesRequest::setDatabasePattern));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDatabaseNamesResponse::getBody, ListDatabaseNamesResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForListDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForListDatabases() {
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
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, ListDatabasesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getCatalogName, ListDatabasesRequest::setCatalogName));
        builder.<String>withRequestField("database_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getDatabaseNamePattern,
                ListDatabasesRequest::setDatabaseNamePattern));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, ListDatabasesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getMarker, ListDatabasesRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDatabasesRequest::getReversePage, ListDatabasesRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseRequest, ShowDatabaseResponse> showDatabase = genForShowDatabase();

    private static HttpRequestDef<ShowDatabaseRequest, ShowDatabaseResponse> genForShowDatabase() {
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
            f -> f.withMarshaller(ShowDatabaseRequest::getInstanceId, ShowDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseRequest::getCatalogName, ShowDatabaseRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseRequest::getDatabaseName, ShowDatabaseRequest::setDatabaseName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabase =
        genForUpdateDatabase();

    private static HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> genForUpdateDatabase() {
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
            f -> f.withMarshaller(UpdateDatabaseRequest::getInstanceId, UpdateDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getCatalogName, UpdateDatabaseRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getDatabaseName, UpdateDatabaseRequest::setDatabaseName));
        builder.<DatabaseInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseInput.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getBody, UpdateDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> createFunction =
        genForCreateFunction();

    private static HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> genForCreateFunction() {
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
            f -> f.withMarshaller(CreateFunctionRequest::getInstanceId, CreateFunctionRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFunctionRequest::getCatalogName, CreateFunctionRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFunctionRequest::getDatabaseName, CreateFunctionRequest::setDatabaseName));
        builder.<FunctionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FunctionInput.class),
            f -> f.withMarshaller(CreateFunctionRequest::getBody, CreateFunctionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunction =
        genForDeleteFunction();

    private static HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> genForDeleteFunction() {
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
            f -> f.withMarshaller(DeleteFunctionRequest::getInstanceId, DeleteFunctionRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getCatalogName, DeleteFunctionRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getDatabaseName, DeleteFunctionRequest::setDatabaseName));
        builder.<String>withRequestField("function_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getFunctionName, DeleteFunctionRequest::setFunctionName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllFunctionsRequest, ListAllFunctionsResponse> listAllFunctions =
        genForListAllFunctions();

    private static HttpRequestDef<ListAllFunctionsRequest, ListAllFunctionsResponse> genForListAllFunctions() {
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
            f -> f.withMarshaller(ListAllFunctionsRequest::getInstanceId, ListAllFunctionsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getCatalogName, ListAllFunctionsRequest::setCatalogName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getLimit, ListAllFunctionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getMarker, ListAllFunctionsRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllFunctionsRequest::getReversePage, ListAllFunctionsRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionNamesRequest, ListFunctionNamesResponse> listFunctionNames =
        genForListFunctionNames();

    private static HttpRequestDef<ListFunctionNamesRequest, ListFunctionNamesResponse> genForListFunctionNames() {
        // basic
        HttpRequestDef.Builder<ListFunctionNamesRequest, ListFunctionNamesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFunctionNamesRequest.class, ListFunctionNamesResponse.class)
            .withName("ListFunctionNames")
            .withUri(
                "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/functions/names")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionNamesRequest::getInstanceId, ListFunctionNamesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionNamesRequest::getCatalogName, ListFunctionNamesRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionNamesRequest::getDatabaseName,
                ListFunctionNamesRequest::setDatabaseName));
        builder.<String>withRequestField("function_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionNamesRequest::getFunctionPattern,
                ListFunctionNamesRequest::setFunctionPattern));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFunctionNamesResponse::getBody, ListFunctionNamesResponse::setBody)
                .withInnerContainerType(String.class));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFunctionNamesResponse::getXRequestId, ListFunctionNamesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> listFunctions =
        genForListFunctions();

    private static HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> genForListFunctions() {
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
            f -> f.withMarshaller(ListFunctionsRequest::getInstanceId, ListFunctionsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getCatalogName, ListFunctionsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getDatabaseName, ListFunctionsRequest::setDatabaseName));
        builder.<String>withRequestField("function_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getFunctionNamePattern,
                ListFunctionsRequest::setFunctionNamePattern));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFunctionsRequest::getLimit, ListFunctionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getMarker, ListFunctionsRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFunctionsRequest::getReversePage, ListFunctionsRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionRequest, ShowFunctionResponse> showFunction = genForShowFunction();

    private static HttpRequestDef<ShowFunctionRequest, ShowFunctionResponse> genForShowFunction() {
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
            f -> f.withMarshaller(ShowFunctionRequest::getInstanceId, ShowFunctionRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionRequest::getCatalogName, ShowFunctionRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionRequest::getDatabaseName, ShowFunctionRequest::setDatabaseName));
        builder.<String>withRequestField("function_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionRequest::getFunctionName, ShowFunctionRequest::setFunctionName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionRequest, UpdateFunctionResponse> updateFunction =
        genForUpdateFunction();

    private static HttpRequestDef<UpdateFunctionRequest, UpdateFunctionResponse> genForUpdateFunction() {
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
            f -> f.withMarshaller(UpdateFunctionRequest::getInstanceId, UpdateFunctionRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getCatalogName, UpdateFunctionRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getDatabaseName, UpdateFunctionRequest::setDatabaseName));
        builder.<String>withRequestField("function_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getFunctionName, UpdateFunctionRequest::setFunctionName));
        builder.<FunctionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FunctionInput.class),
            f -> f.withMarshaller(UpdateFunctionRequest::getBody, UpdateFunctionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse> authorizeAccessService =
        genForAuthorizeAccessService();

    private static HttpRequestDef<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse> genForAuthorizeAccessService() {
        // basic
        HttpRequestDef.Builder<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AuthorizeAccessServiceRequest.class, AuthorizeAccessServiceResponse.class)
            .withName("AuthorizeAccessService")
            .withUri("/v1/{project_id}/access-service")
            .withContentType("application/json");

        // requests
        builder.<GrantAccessServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantAccessServiceRequestBody.class),
            f -> f.withMarshaller(AuthorizeAccessServiceRequest::getBody, AuthorizeAccessServiceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AuthorizeAccessServiceResponse::getXRequestId,
                AuthorizeAccessServiceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAgreementRequest, CreateAgreementResponse> createAgreement =
        genForCreateAgreement();

    private static HttpRequestDef<CreateAgreementRequest, CreateAgreementResponse> genForCreateAgreement() {
        // basic
        HttpRequestDef.Builder<CreateAgreementRequest, CreateAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgreementRequest.class, CreateAgreementResponse.class)
                .withName("CreateAgreement")
                .withUri("/v2/agreement")
                .withContentType("application/json");

        // requests
        builder.<TenantAgreementBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TenantAgreementBody.class),
            f -> f.withMarshaller(CreateAgreementRequest::getBody, CreateAgreementRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAgreementResponse::getXRequestId, CreateAgreementResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgreementRequest, DeleteAgreementResponse> deleteAgreement =
        genForDeleteAgreement();

    private static HttpRequestDef<DeleteAgreementRequest, DeleteAgreementResponse> genForDeleteAgreement() {
        // basic
        HttpRequestDef.Builder<DeleteAgreementRequest, DeleteAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgreementRequest.class, DeleteAgreementResponse.class)
                .withName("DeleteAgreement")
                .withUri("/v2/agreement")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAgreementResponse::getXRequestId, DeleteAgreementResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessServiceRequest, ShowAccessServiceResponse> showAccessService =
        genForShowAccessService();

    private static HttpRequestDef<ShowAccessServiceRequest, ShowAccessServiceResponse> genForShowAccessService() {
        // basic
        HttpRequestDef.Builder<ShowAccessServiceRequest, ShowAccessServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessServiceRequest.class, ShowAccessServiceResponse.class)
                .withName("ShowAccessService")
                .withUri("/v1/{project_id}/access-service")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAccessServiceResponse::getXRequestId, ShowAccessServiceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAgreementRequest, ShowAgreementResponse> showAgreement =
        genForShowAgreement();

    private static HttpRequestDef<ShowAgreementRequest, ShowAgreementResponse> genForShowAgreement() {
        // basic
        HttpRequestDef.Builder<ShowAgreementRequest, ShowAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgreementRequest.class, ShowAgreementResponse.class)
                .withName("ShowAgreement")
                .withUri("/v2/agreement")
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
        genForShowAgreementRule();

    private static HttpRequestDef<ShowAgreementRuleRequest, ShowAgreementRuleResponse> genForShowAgreementRule() {
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

    public static final HttpRequestDef<CountMetaObjRequest, CountMetaObjResponse> countMetaObj = genForCountMetaObj();

    private static HttpRequestDef<CountMetaObjRequest, CountMetaObjResponse> genForCountMetaObj() {
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
            f -> f.withMarshaller(CountMetaObjRequest::getInstanceId, CountMetaObjRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse> createLakeFormationInstance =
        genForCreateLakeFormationInstance();

    private static HttpRequestDef<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse> genForCreateLakeFormationInstance() {
        // basic
        HttpRequestDef.Builder<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateLakeFormationInstanceRequest.class,
                    CreateLakeFormationInstanceResponse.class)
                .withName("CreateLakeFormationInstance")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateLakeFormationInstanceRequest::getBody,
                CreateLakeFormationInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLakeFormationInstanceResponse::getXRequestId,
                CreateLakeFormationInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> deleteLakeFormationInstance =
        genForDeleteLakeFormationInstance();

    private static HttpRequestDef<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> genForDeleteLakeFormationInstance() {
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
            f -> f.withMarshaller(DeleteLakeFormationInstanceRequest::getInstanceId,
                DeleteLakeFormationInstanceRequest::setInstanceId));
        builder.<Boolean>withRequestField("to_recycle_bin",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteLakeFormationInstanceRequest::getToRecycleBin,
                DeleteLakeFormationInstanceRequest::setToRecycleBin));

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
        genForListLakeFormationInstances();

    private static HttpRequestDef<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> genForListLakeFormationInstances() {
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
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getInRecycleBin,
                ListLakeFormationInstancesRequest::setInRecycleBin));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getOffset,
                ListLakeFormationInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getLimit,
                ListLakeFormationInstancesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getName,
                ListLakeFormationInstancesRequest::setName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getEnterpriseProjectId,
                ListLakeFormationInstancesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLakeFormationInstancesRequest::getTags,
                ListLakeFormationInstancesRequest::setTags));

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
        genForMoveLakeFormationInstanceOutRecycleBin();

    private static HttpRequestDef<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> genForMoveLakeFormationInstanceOutRecycleBin() {
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
            f -> f.withMarshaller(MoveLakeFormationInstanceOutRecycleBinRequest::getInstanceId,
                MoveLakeFormationInstanceOutRecycleBinRequest::setInstanceId));

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
        genForShowLakeFormationInstance();

    private static HttpRequestDef<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> genForShowLakeFormationInstance() {
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
            f -> f.withMarshaller(ShowLakeFormationInstanceRequest::getInstanceId,
                ShowLakeFormationInstanceRequest::setInstanceId));

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
        genForUpdateLakeFormationInstance();

    private static HttpRequestDef<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> genForUpdateLakeFormationInstance() {
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
            f -> f.withMarshaller(UpdateLakeFormationInstanceRequest::getInstanceId,
                UpdateLakeFormationInstanceRequest::setInstanceId));
        builder.<UpdateLakeFormationInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLakeFormationInstance.class),
            f -> f.withMarshaller(UpdateLakeFormationInstanceRequest::getBody,
                UpdateLakeFormationInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse> updateLakeFormationInstanceDefault =
        genForUpdateLakeFormationInstanceDefault();

    private static HttpRequestDef<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse> genForUpdateLakeFormationInstanceDefault() {
        // basic
        HttpRequestDef.Builder<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateLakeFormationInstanceDefaultRequest.class,
                    UpdateLakeFormationInstanceDefaultResponse.class)
                .withName("UpdateLakeFormationInstanceDefault")
                .withUri("/v1/{project_id}/instances/{instance_id}/default")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLakeFormationInstanceDefaultRequest::getInstanceId,
                UpdateLakeFormationInstanceDefaultRequest::setInstanceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLakeFormationInstanceDefaultResponse::getXRequestId,
                UpdateLakeFormationInstanceDefaultResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse> updateLakeFormationInstanceScale =
        genForUpdateLakeFormationInstanceScale();

    private static HttpRequestDef<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse> genForUpdateLakeFormationInstanceScale() {
        // basic
        HttpRequestDef.Builder<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateLakeFormationInstanceScaleRequest.class,
                    UpdateLakeFormationInstanceScaleResponse.class)
                .withName("UpdateLakeFormationInstanceScale")
                .withUri("/v1/{project_id}/instances/{instance_id}/scale")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLakeFormationInstanceScaleRequest::getInstanceId,
                UpdateLakeFormationInstanceScaleRequest::setInstanceId));
        builder.<UpdateLakeFormationInstanceScale>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLakeFormationInstanceScale.class),
            f -> f.withMarshaller(UpdateLakeFormationInstanceScaleRequest::getBody,
                UpdateLakeFormationInstanceScaleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLakeFormationInstanceScaleResponse::getXRequestId,
                UpdateLakeFormationInstanceScaleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> listObsBuckets =
        genForListObsBuckets();

    private static HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> genForListObsBuckets() {
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
            f -> f.withMarshaller(ListObsBucketsRequest::getOffset, ListObsBucketsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getLimit, ListObsBucketsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObsBucketsResponse::getXRequestId, ListObsBucketsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListObsObjectRequest, ListObsObjectResponse> listObsObject =
        genForListObsObject();

    private static HttpRequestDef<ListObsObjectRequest, ListObsObjectResponse> genForListObsObject() {
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
            f -> f.withMarshaller(ListObsObjectRequest::getBucketName, ListObsObjectRequest::setBucketName));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsObjectRequest::getMarker, ListObsObjectRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsObjectRequest::getLimit, ListObsObjectRequest::setLimit));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsObjectRequest::getPrefix, ListObsObjectRequest::setPrefix));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPartitionsRequest, AddPartitionsResponse> addPartitions =
        genForAddPartitions();

    private static HttpRequestDef<AddPartitionsRequest, AddPartitionsResponse> genForAddPartitions() {
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
            f -> f.withMarshaller(AddPartitionsRequest::getInstanceId, AddPartitionsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPartitionsRequest::getCatalogName, AddPartitionsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPartitionsRequest::getDatabaseName, AddPartitionsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPartitionsRequest::getTableName, AddPartitionsRequest::setTableName));
        builder.<AddPartitionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddPartitionInput.class),
            f -> f.withMarshaller(AddPartitionsRequest::getBody, AddPartitionsRequest::setBody));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddPartitionsResponse::getBody, AddPartitionsResponse::setBody)
                .withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePartitionRequest, BatchDeletePartitionResponse> batchDeletePartition =
        genForBatchDeletePartition();

    private static HttpRequestDef<BatchDeletePartitionRequest, BatchDeletePartitionResponse> genForBatchDeletePartition() {
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
            f -> f.withMarshaller(BatchDeletePartitionRequest::getInstanceId,
                BatchDeletePartitionRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getCatalogName,
                BatchDeletePartitionRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getDatabaseName,
                BatchDeletePartitionRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getTableName,
                BatchDeletePartitionRequest::setTableName));
        builder.<DropPartitionsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DropPartitionsInput.class),
            f -> f.withMarshaller(BatchDeletePartitionRequest::getBody, BatchDeletePartitionRequest::setBody));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeletePartitionResponse::getBody, BatchDeletePartitionResponse::setBody)
                .withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatistics =
        genForBatchDeletePartitionedStatistics();

    private static HttpRequestDef<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> genForBatchDeletePartitionedStatistics() {
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
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getInstanceId,
                BatchDeletePartitionedStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getCatalogName,
                BatchDeletePartitionedStatisticsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getDatabaseName,
                BatchDeletePartitionedStatisticsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getTableName,
                BatchDeletePartitionedStatisticsRequest::setTableName));
        builder.<TruncatePartitionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TruncatePartitionInput.class),
            f -> f.withMarshaller(BatchDeletePartitionedStatisticsRequest::getBody,
                BatchDeletePartitionedStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> batchListPartitionByValues =
        genForBatchListPartitionByValues();

    private static HttpRequestDef<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> genForBatchListPartitionByValues() {
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
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getInstanceId,
                BatchListPartitionByValuesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getCatalogName,
                BatchListPartitionByValuesRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getDatabaseName,
                BatchListPartitionByValuesRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getTableName,
                BatchListPartitionByValuesRequest::setTableName));
        builder.<GetPartitionsByValuesInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetPartitionsByValuesInput.class),
            f -> f.withMarshaller(BatchListPartitionByValuesRequest::getBody,
                BatchListPartitionByValuesRequest::setBody));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchListPartitionByValuesResponse::getBody,
                    BatchListPartitionByValuesResponse::setBody)
                .withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> batchUpdatePartition =
        genForBatchUpdatePartition();

    private static HttpRequestDef<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> genForBatchUpdatePartition() {
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
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getInstanceId,
                BatchUpdatePartitionRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getCatalogName,
                BatchUpdatePartitionRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getDatabaseName,
                BatchUpdatePartitionRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getTableName,
                BatchUpdatePartitionRequest::setTableName));
        builder.<AlterPartitionsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterPartitionsInput.class),
            f -> f.withMarshaller(BatchUpdatePartitionRequest::getBody, BatchUpdatePartitionRequest::setBody));

        // response
        builder.<List<Partition>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdatePartitionResponse::getBody, BatchUpdatePartitionResponse::setBody)
                .withInnerContainerType(Partition.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionNamesRequest, ListPartitionNamesResponse> listPartitionNames =
        genForListPartitionNames();

    private static HttpRequestDef<ListPartitionNamesRequest, ListPartitionNamesResponse> genForListPartitionNames() {
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
            f -> f.withMarshaller(ListPartitionNamesRequest::getInstanceId, ListPartitionNamesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getCatalogName,
                ListPartitionNamesRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getDatabaseName,
                ListPartitionNamesRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getTableName, ListPartitionNamesRequest::setTableName));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getFilter, ListPartitionNamesRequest::setFilter));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getLimit, ListPartitionNamesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getMarker, ListPartitionNamesRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPartitionNamesRequest::getReversePage,
                ListPartitionNamesRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse> listPartitionNamesWithoutLimit =
        genForListPartitionNamesWithoutLimit();

    private static HttpRequestDef<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse> genForListPartitionNamesWithoutLimit() {
        // basic
        HttpRequestDef.Builder<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPartitionNamesWithoutLimitRequest.class,
                    ListPartitionNamesWithoutLimitResponse.class)
                .withName("ListPartitionNamesWithoutLimit")
                .withUri(
                    "/v1/{project_id}/instances/{instance_id}/catalogs/{catalog_name}/databases/{database_name}/tables/{table_name}/partitions/names")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesWithoutLimitRequest::getInstanceId,
                ListPartitionNamesWithoutLimitRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesWithoutLimitRequest::getCatalogName,
                ListPartitionNamesWithoutLimitRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesWithoutLimitRequest::getDatabaseName,
                ListPartitionNamesWithoutLimitRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionNamesWithoutLimitRequest::getTableName,
                ListPartitionNamesWithoutLimitRequest::setTableName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartitionNamesWithoutLimitRequest::getLimit,
                ListPartitionNamesWithoutLimitRequest::setLimit));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListPartitionNamesWithoutLimitResponse::getBody,
                    ListPartitionNamesWithoutLimitResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> listPartitions =
        genForListPartitions();

    private static HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> genForListPartitions() {
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
            f -> f.withMarshaller(ListPartitionsRequest::getInstanceId, ListPartitionsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getCatalogName, ListPartitionsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getDatabaseName, ListPartitionsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getTableName, ListPartitionsRequest::setTableName));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getFilter, ListPartitionsRequest::setFilter));
        builder.<List<String>>withRequestField("partition_values",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPartitionsRequest::getPartitionValues,
                ListPartitionsRequest::setPartitionValues));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartitionsRequest::getLimit, ListPartitionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getMarker, ListPartitionsRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPartitionsRequest::getReversePage, ListPartitionsRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatistics =
        genForBatchShowPartitionColumnStatistics();

    private static HttpRequestDef<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> genForBatchShowPartitionColumnStatistics() {
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
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getInstanceId,
                BatchShowPartitionColumnStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getCatalogName,
                BatchShowPartitionColumnStatisticsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getDatabaseName,
                BatchShowPartitionColumnStatisticsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getTableName,
                BatchShowPartitionColumnStatisticsRequest::setTableName));
        builder.<GetPartitionColumnStatisticsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetPartitionColumnStatisticsInput.class),
            f -> f.withMarshaller(BatchShowPartitionColumnStatisticsRequest::getBody,
                BatchShowPartitionColumnStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatistics =
        genForDeletePartitionColumnStatistics();

    private static HttpRequestDef<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> genForDeletePartitionColumnStatistics() {
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
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getInstanceId,
                DeletePartitionColumnStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getCatalogName,
                DeletePartitionColumnStatisticsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getDatabaseName,
                DeletePartitionColumnStatisticsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getTableName,
                DeletePartitionColumnStatisticsRequest::setTableName));
        builder.<List<String>>withRequestField("partition_values",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getPartitionValues,
                DeletePartitionColumnStatisticsRequest::setPartitionValues));
        builder.<String>withRequestField("column_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePartitionColumnStatisticsRequest::getColumnName,
                DeletePartitionColumnStatisticsRequest::setColumnName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> setPartitionColumnStatistics =
        genForSetPartitionColumnStatistics();

    private static HttpRequestDef<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> genForSetPartitionColumnStatistics() {
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
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getInstanceId,
                SetPartitionColumnStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getCatalogName,
                SetPartitionColumnStatisticsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getDatabaseName,
                SetPartitionColumnStatisticsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getTableName,
                SetPartitionColumnStatisticsRequest::setTableName));
        builder.<SetPartitionColumnStatisticsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetPartitionColumnStatisticsInput.class),
            f -> f.withMarshaller(SetPartitionColumnStatisticsRequest::getBody,
                SetPartitionColumnStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(ListQuotasResponse::getBody, ListQuotasResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQuotasResponse::getXRequestId, ListQuotasResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AssociatePrincipalsRequest, AssociatePrincipalsResponse> associatePrincipals =
        genForAssociatePrincipals();

    private static HttpRequestDef<AssociatePrincipalsRequest, AssociatePrincipalsResponse> genForAssociatePrincipals() {
        // basic
        HttpRequestDef.Builder<AssociatePrincipalsRequest, AssociatePrincipalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociatePrincipalsRequest.class, AssociatePrincipalsResponse.class)
                .withName("AssociatePrincipals")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/{role_name}/grant-principals")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePrincipalsRequest::getInstanceId,
                AssociatePrincipalsRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePrincipalsRequest::getRoleName, AssociatePrincipalsRequest::setRoleName));
        builder.<List<Principal>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AssociatePrincipalsRequest::getBody, AssociatePrincipalsRequest::setBody)
                .withInnerContainerType(Principal.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoleRequest, CreateRoleResponse> createRole = genForCreateRole();

    private static HttpRequestDef<CreateRoleRequest, CreateRoleResponse> genForCreateRole() {
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
            f -> f.withMarshaller(CreateRoleRequest::getInstanceId, CreateRoleRequest::setInstanceId));
        builder.<RoleInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoleInput.class),
            f -> f.withMarshaller(CreateRoleRequest::getBody, CreateRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoleRequest, DeleteRoleResponse> deleteRole = genForDeleteRole();

    private static HttpRequestDef<DeleteRoleRequest, DeleteRoleResponse> genForDeleteRole() {
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
            f -> f.withMarshaller(DeleteRoleRequest::getInstanceId, DeleteRoleRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoleRequest::getRoleName, DeleteRoleRequest::setRoleName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrincipalsRequest, ListPrincipalsResponse> listPrincipals =
        genForListPrincipals();

    private static HttpRequestDef<ListPrincipalsRequest, ListPrincipalsResponse> genForListPrincipals() {
        // basic
        HttpRequestDef.Builder<ListPrincipalsRequest, ListPrincipalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrincipalsRequest.class, ListPrincipalsResponse.class)
                .withName("ListPrincipals")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/{role_name}/principals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrincipalsRequest::getInstanceId, ListPrincipalsRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrincipalsRequest::getRoleName, ListPrincipalsRequest::setRoleName));
        builder.<String>withRequestField("principal_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrincipalsRequest::getPrincipalPattern,
                ListPrincipalsRequest::setPrincipalPattern));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrincipalsRequest::getLimit, ListPrincipalsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrincipalsRequest::getMarker, ListPrincipalsRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPrincipalsRequest::getReversePage, ListPrincipalsRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRoleNamesRequest, ListRoleNamesResponse> listRoleNames =
        genForListRoleNames();

    private static HttpRequestDef<ListRoleNamesRequest, ListRoleNamesResponse> genForListRoleNames() {
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
            f -> f.withMarshaller(ListRoleNamesRequest::getInstanceId, ListRoleNamesRequest::setInstanceId));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRoleNamesResponse::getBody, ListRoleNamesResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRolesRequest, ListRolesResponse> listRoles = genForListRoles();

    private static HttpRequestDef<ListRolesRequest, ListRolesResponse> genForListRoles() {
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
            f -> f.withMarshaller(ListRolesRequest::getInstanceId, ListRolesRequest::setInstanceId));
        builder.<String>withRequestField("role_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesRequest::getRolePattern, ListRolesRequest::setRolePattern));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRolesRequest::getLimit, ListRolesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesRequest::getMarker, ListRolesRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRolesRequest::getReversePage, ListRolesRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokePrincipalsRequest, RevokePrincipalsResponse> revokePrincipals =
        genForRevokePrincipals();

    private static HttpRequestDef<RevokePrincipalsRequest, RevokePrincipalsResponse> genForRevokePrincipals() {
        // basic
        HttpRequestDef.Builder<RevokePrincipalsRequest, RevokePrincipalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RevokePrincipalsRequest.class, RevokePrincipalsResponse.class)
                .withName("RevokePrincipals")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/{role_name}/revoke-principals")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokePrincipalsRequest::getInstanceId, RevokePrincipalsRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokePrincipalsRequest::getRoleName, RevokePrincipalsRequest::setRoleName));
        builder.<List<Principal>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(RevokePrincipalsRequest::getBody, RevokePrincipalsRequest::setBody)
                .withInnerContainerType(Principal.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoleRequest, ShowRoleResponse> showRole = genForShowRole();

    private static HttpRequestDef<ShowRoleRequest, ShowRoleResponse> genForShowRole() {
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
            f -> f.withMarshaller(ShowRoleRequest::getInstanceId, ShowRoleRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoleRequest::getRoleName, ShowRoleRequest::setRoleName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrincipalsRequest, UpdatePrincipalsResponse> updatePrincipals =
        genForUpdatePrincipals();

    private static HttpRequestDef<UpdatePrincipalsRequest, UpdatePrincipalsResponse> genForUpdatePrincipals() {
        // basic
        HttpRequestDef.Builder<UpdatePrincipalsRequest, UpdatePrincipalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrincipalsRequest.class, UpdatePrincipalsResponse.class)
                .withName("UpdatePrincipals")
                .withUri("/v1/{project_id}/instances/{instance_id}/roles/{role_name}/update-principals")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrincipalsRequest::getInstanceId, UpdatePrincipalsRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrincipalsRequest::getRoleName, UpdatePrincipalsRequest::setRoleName));
        builder.<List<Principal>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdatePrincipalsRequest::getBody, UpdatePrincipalsRequest::setBody)
                .withInnerContainerType(Principal.class));

        // response
        builder.<List<Principal>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdatePrincipalsResponse::getBody, UpdatePrincipalsResponse::setBody)
                .withInnerContainerType(Principal.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoleRequest, UpdateRoleResponse> updateRole = genForUpdateRole();

    private static HttpRequestDef<UpdateRoleRequest, UpdateRoleResponse> genForUpdateRole() {
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
            f -> f.withMarshaller(UpdateRoleRequest::getInstanceId, UpdateRoleRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoleRequest::getRoleName, UpdateRoleRequest::setRoleName));
        builder.<AlterRoleInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterRoleInput.class),
            f -> f.withMarshaller(UpdateRoleRequest::getBody, UpdateRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecsRequest, ListSpecsResponse> listSpecs = genForListSpecs();

    private static HttpRequestDef<ListSpecsRequest, ListSpecsResponse> genForListSpecs() {
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
            f -> f.withMarshaller(ListSpecsRequest::getSpecCode, ListSpecsRequest::setSpecCode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecsRequest::getOffset, ListSpecsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecsRequest::getLimit, ListSpecsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForCreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForCreateTable() {
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
            f -> f.withMarshaller(CreateTableRequest::getInstanceId, CreateTableRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getCatalogName, CreateTableRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getDatabaseName, CreateTableRequest::setDatabaseName));
        builder.<TableInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableInput.class),
            f -> f.withMarshaller(CreateTableRequest::getBody, CreateTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAllTablesRequest, DeleteAllTablesResponse> deleteAllTables =
        genForDeleteAllTables();

    private static HttpRequestDef<DeleteAllTablesRequest, DeleteAllTablesResponse> genForDeleteAllTables() {
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
            f -> f.withMarshaller(DeleteAllTablesRequest::getInstanceId, DeleteAllTablesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAllTablesRequest::getCatalogName, DeleteAllTablesRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAllTablesRequest::getDatabaseName, DeleteAllTablesRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAllTablesRequest::getTableName, DeleteAllTablesRequest::setTableName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genForDeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genForDeleteTable() {
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
            f -> f.withMarshaller(DeleteTableRequest::getInstanceId, DeleteTableRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getCatalogName, DeleteTableRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getDatabaseName, DeleteTableRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getTableName, DeleteTableRequest::setTableName));
        builder.<Boolean>withRequestField("delete_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteTableRequest::getDeleteData, DeleteTableRequest::setDeleteData));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableMetaRequest, ListTableMetaResponse> listTableMeta =
        genForListTableMeta();

    private static HttpRequestDef<ListTableMetaRequest, ListTableMetaResponse> genForListTableMeta() {
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
            f -> f.withMarshaller(ListTableMetaRequest::getInstanceId, ListTableMetaRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getCatalogName, ListTableMetaRequest::setCatalogName));
        builder.<String>withRequestField("database_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getDatabaseNamePattern,
                ListTableMetaRequest::setDatabaseNamePattern));
        builder.<String>withRequestField("table_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getTableNamePattern,
                ListTableMetaRequest::setTableNamePattern));
        builder.<List<ListTableMetaRequest.TableTypesEnum>>withRequestField("table_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTableMetaRequest::getTableTypes, ListTableMetaRequest::setTableTypes));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableMetaRequest::getLimit, ListTableMetaRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableMetaRequest::getMarker, ListTableMetaRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTableMetaRequest::getReversePage, ListTableMetaRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableNamesRequest, ListTableNamesResponse> listTableNames =
        genForListTableNames();

    private static HttpRequestDef<ListTableNamesRequest, ListTableNamesResponse> genForListTableNames() {
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
            f -> f.withMarshaller(ListTableNamesRequest::getInstanceId, ListTableNamesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getCatalogName, ListTableNamesRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getDatabaseName, ListTableNamesRequest::setDatabaseName));
        builder.<String>withRequestField("table_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getTablePattern, ListTableNamesRequest::setTablePattern));
        builder.<String>withRequestField("table_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableNamesRequest::getTableType, ListTableNamesRequest::setTableType));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTableNamesResponse::getBody, ListTableNamesResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesRequest, ListTablesResponse> listTables = genForListTables();

    private static HttpRequestDef<ListTablesRequest, ListTablesResponse> genForListTables() {
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
            f -> f.withMarshaller(ListTablesRequest::getInstanceId, ListTablesRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getCatalogName, ListTablesRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getDatabaseName, ListTablesRequest::setDatabaseName));
        builder.<String>withRequestField("table_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTableNamePattern, ListTablesRequest::setTableNamePattern));
        builder.<ListTablesRequest.TableTypeEnum>withRequestField("table_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTablesRequest.TableTypeEnum.class),
            f -> f.withMarshaller(ListTablesRequest::getTableType, ListTablesRequest::setTableType));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getFilter, ListTablesRequest::setFilter));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getLimit, ListTablesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getMarker, ListTablesRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTablesRequest::getReversePage, ListTablesRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesByNameRequest, ListTablesByNameResponse> listTablesByName =
        genForListTablesByName();

    private static HttpRequestDef<ListTablesByNameRequest, ListTablesByNameResponse> genForListTablesByName() {
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
            f -> f.withMarshaller(ListTablesByNameRequest::getInstanceId, ListTablesByNameRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesByNameRequest::getCatalogName, ListTablesByNameRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesByNameRequest::getDatabaseName, ListTablesByNameRequest::setDatabaseName));
        builder.<ListTableByNameInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTableByNameInput.class),
            f -> f.withMarshaller(ListTablesByNameRequest::getBody, ListTablesByNameRequest::setBody));

        // response
        builder.<List<Table>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTablesByNameResponse::getBody, ListTablesByNameResponse::setBody)
                .withInnerContainerType(Table.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableRequest, ShowTableResponse> showTable = genForShowTable();

    private static HttpRequestDef<ShowTableRequest, ShowTableResponse> genForShowTable() {
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
            f -> f.withMarshaller(ShowTableRequest::getInstanceId, ShowTableRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getCatalogName, ShowTableRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getDatabaseName, ShowTableRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getTableName, ShowTableRequest::setTableName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableRequest, UpdateTableResponse> updateTable = genForUpdateTable();

    private static HttpRequestDef<UpdateTableRequest, UpdateTableResponse> genForUpdateTable() {
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
            f -> f.withMarshaller(UpdateTableRequest::getInstanceId, UpdateTableRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getCatalogName, UpdateTableRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getDatabaseName, UpdateTableRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getTableName, UpdateTableRequest::setTableName));
        builder.<AlterTableInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterTableInput.class),
            f -> f.withMarshaller(UpdateTableRequest::getBody, UpdateTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> deleteTableColumnStatistics =
        genForDeleteTableColumnStatistics();

    private static HttpRequestDef<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> genForDeleteTableColumnStatistics() {
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
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getInstanceId,
                DeleteTableColumnStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getCatalogName,
                DeleteTableColumnStatisticsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getDatabaseName,
                DeleteTableColumnStatisticsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getTableName,
                DeleteTableColumnStatisticsRequest::setTableName));
        builder.<String>withRequestField("column_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableColumnStatisticsRequest::getColumnName,
                DeleteTableColumnStatisticsRequest::setColumnName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> listTableColumnStatistics =
        genForListTableColumnStatistics();

    private static HttpRequestDef<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> genForListTableColumnStatistics() {
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
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getInstanceId,
                ListTableColumnStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getCatalogName,
                ListTableColumnStatisticsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getDatabaseName,
                ListTableColumnStatisticsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getTableName,
                ListTableColumnStatisticsRequest::setTableName));
        builder.<GetTableColumnStatisticsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetTableColumnStatisticsInput.class),
            f -> f.withMarshaller(ListTableColumnStatisticsRequest::getBody,
                ListTableColumnStatisticsRequest::setBody));

        // response
        builder.<List<ColumnStatisticsObj>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListTableColumnStatisticsResponse::getBody, ListTableColumnStatisticsResponse::setBody)
                .withInnerContainerType(ColumnStatisticsObj.class));

        return builder.build();
    }

    public static final HttpRequestDef<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> setTableColumnStatistics =
        genForSetTableColumnStatistics();

    private static HttpRequestDef<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> genForSetTableColumnStatistics() {
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
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getInstanceId,
                SetTableColumnStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getCatalogName,
                SetTableColumnStatisticsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getDatabaseName,
                SetTableColumnStatisticsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getTableName,
                SetTableColumnStatisticsRequest::setTableName));
        builder.<MergeTableColumnStatisticInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MergeTableColumnStatisticInput.class),
            f -> f.withMarshaller(SetTableColumnStatisticsRequest::getBody, SetTableColumnStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateConstraintRequest, BatchCreateConstraintResponse> batchCreateConstraint =
        genForBatchCreateConstraint();

    private static HttpRequestDef<BatchCreateConstraintRequest, BatchCreateConstraintResponse> genForBatchCreateConstraint() {
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
            f -> f.withMarshaller(BatchCreateConstraintRequest::getInstanceId,
                BatchCreateConstraintRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getCatalogName,
                BatchCreateConstraintRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getDatabaseName,
                BatchCreateConstraintRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getTableName,
                BatchCreateConstraintRequest::setTableName));
        builder.<TableConstraintsInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableConstraintsInput.class),
            f -> f.withMarshaller(BatchCreateConstraintRequest::getBody, BatchCreateConstraintRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConstraintRequest, DeleteConstraintResponse> deleteConstraint =
        genForDeleteConstraint();

    private static HttpRequestDef<DeleteConstraintRequest, DeleteConstraintResponse> genForDeleteConstraint() {
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
            f -> f.withMarshaller(DeleteConstraintRequest::getInstanceId, DeleteConstraintRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getCatalogName, DeleteConstraintRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getDatabaseName, DeleteConstraintRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getTableName, DeleteConstraintRequest::setTableName));
        builder.<String>withRequestField("constraint_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConstraintRequest::getConstraintName,
                DeleteConstraintRequest::setConstraintName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConstraintsRequest, ListConstraintsResponse> listConstraints =
        genForListConstraints();

    private static HttpRequestDef<ListConstraintsRequest, ListConstraintsResponse> genForListConstraints() {
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
            f -> f.withMarshaller(ListConstraintsRequest::getInstanceId, ListConstraintsRequest::setInstanceId));
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getCatalogName, ListConstraintsRequest::setCatalogName));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getDatabaseName, ListConstraintsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getTableName, ListConstraintsRequest::setTableName));
        builder.<ListConstraintsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConstraintsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListConstraintsRequest::getType, ListConstraintsRequest::setType));
        builder.<String>withRequestField("parent_db",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getParentDb, ListConstraintsRequest::setParentDb));
        builder.<String>withRequestField("parent_tbl",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConstraintsRequest::getParentTbl, ListConstraintsRequest::setParentTbl));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse> batchUpdateLakeFormationInstanceTags =
        genForBatchUpdateLakeFormationInstanceTags();

    private static HttpRequestDef<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse> genForBatchUpdateLakeFormationInstanceTags() {
        // basic
        HttpRequestDef.Builder<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateLakeFormationInstanceTagsRequest.class,
                    BatchUpdateLakeFormationInstanceTagsResponse.class)
                .withName("BatchUpdateLakeFormationInstanceTags")
                .withUri("/v1/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateLakeFormationInstanceTagsRequest::getInstanceId,
                BatchUpdateLakeFormationInstanceTagsRequest::setInstanceId));
        builder.<BatchUpdateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchUpdateTagsRequestBody.class),
            f -> f.withMarshaller(BatchUpdateLakeFormationInstanceTagsRequest::getBody,
                BatchUpdateLakeFormationInstanceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse> listLakeFormationInstanceTags =
        genForListLakeFormationInstanceTags();

    private static HttpRequestDef<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse> genForListLakeFormationInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLakeFormationInstanceTagsRequest.class,
                    ListLakeFormationInstanceTagsResponse.class)
                .withName("ListLakeFormationInstanceTags")
                .withUri("/v1/{project_id}/lakeformation-instance/tags")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("use_predefine_tags",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLakeFormationInstanceTagsRequest::getUsePredefineTags,
                ListLakeFormationInstanceTagsRequest::setUsePredefineTags));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLakeFormationInstanceTagsResponse::getXRequestId,
                ListLakeFormationInstanceTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AssociateRolesRequest, AssociateRolesResponse> associateRoles =
        genForAssociateRoles();

    private static HttpRequestDef<AssociateRolesRequest, AssociateRolesResponse> genForAssociateRoles() {
        // basic
        HttpRequestDef.Builder<AssociateRolesRequest, AssociateRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateRolesRequest.class, AssociateRolesResponse.class)
                .withName("AssociateRoles")
                .withUri("/v1/{project_id}/instances/{instance_id}/users/{user_name}/grant-roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRolesRequest::getInstanceId, AssociateRolesRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRolesRequest::getUserName, AssociateRolesRequest::setUserName));
        builder.<List<RoleInfoInput>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AssociateRolesRequest::getBody, AssociateRolesRequest::setBody)
                .withInnerContainerType(RoleInfoInput.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRolesRequest, ListUserRolesResponse> listUserRoles =
        genForListUserRoles();

    private static HttpRequestDef<ListUserRolesRequest, ListUserRolesResponse> genForListUserRoles() {
        // basic
        HttpRequestDef.Builder<ListUserRolesRequest, ListUserRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserRolesRequest.class, ListUserRolesResponse.class)
                .withName("ListUserRoles")
                .withUri("/v1/{project_id}/instances/{instance_id}/users/{user_name}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRolesRequest::getInstanceId, ListUserRolesRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRolesRequest::getUserName, ListUserRolesRequest::setUserName));
        builder.<String>withRequestField("role_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRolesRequest::getRolePattern, ListUserRolesRequest::setRolePattern));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserRolesRequest::getLimit, ListUserRolesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRolesRequest::getMarker, ListUserRolesRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserRolesRequest::getReversePage, ListUserRolesRequest::setReversePage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v1/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getInstanceId, ListUsersRequest::setInstanceId));
        builder.<String>withRequestField("user_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserSource, ListUsersRequest::setUserSource));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getMarker, ListUsersRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getReversePage, ListUsersRequest::setReversePage));
        builder.<String>withRequestField("user_name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserNamePattern, ListUsersRequest::setUserNamePattern));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRolesRequest, RevokeRolesResponse> revokeRoles = genForRevokeRoles();

    private static HttpRequestDef<RevokeRolesRequest, RevokeRolesResponse> genForRevokeRoles() {
        // basic
        HttpRequestDef.Builder<RevokeRolesRequest, RevokeRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RevokeRolesRequest.class, RevokeRolesResponse.class)
                .withName("RevokeRoles")
                .withUri("/v1/{project_id}/instances/{instance_id}/users/{user_name}/revoke-roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRolesRequest::getInstanceId, RevokeRolesRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRolesRequest::getUserName, RevokeRolesRequest::setUserName));
        builder.<List<RoleInfoInput>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(RevokeRolesRequest::getBody, RevokeRolesRequest::setBody)
                .withInnerContainerType(RoleInfoInput.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRolesRequest, UpdateRolesResponse> updateRoles = genForUpdateRoles();

    private static HttpRequestDef<UpdateRolesRequest, UpdateRolesResponse> genForUpdateRoles() {
        // basic
        HttpRequestDef.Builder<UpdateRolesRequest, UpdateRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRolesRequest.class, UpdateRolesResponse.class)
                .withName("UpdateRoles")
                .withUri("/v1/{project_id}/instances/{instance_id}/users/{user_name}/update-roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRolesRequest::getInstanceId, UpdateRolesRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRolesRequest::getUserName, UpdateRolesRequest::setUserName));
        builder.<List<RoleInfoInput>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateRolesRequest::getBody, UpdateRolesRequest::setBody)
                .withInnerContainerType(RoleInfoInput.class));

        // response
        builder.<List<Role>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateRolesResponse::getBody, UpdateRolesResponse::setBody)
                .withInnerContainerType(Role.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsForDomainRequest, ListGroupsForDomainResponse> listGroupsForDomain =
        genForListGroupsForDomain();

    private static HttpRequestDef<ListGroupsForDomainRequest, ListGroupsForDomainResponse> genForListGroupsForDomain() {
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
            f -> f.withMarshaller(ListGroupsForDomainRequest::getInstanceId,
                ListGroupsForDomainRequest::setInstanceId));
        builder.<ListGroupsForDomainRequest.GroupSourceEnum>withRequestField("group_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupsForDomainRequest.GroupSourceEnum.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getGroupSource,
                ListGroupsForDomainRequest::setGroupSource));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getLimit, ListGroupsForDomainRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getMarker, ListGroupsForDomainRequest::setMarker));
        builder.<Boolean>withRequestField("reverse_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGroupsForDomainRequest::getReversePage,
                ListGroupsForDomainRequest::setReversePage));

        // response

        return builder.build();
    }

}
