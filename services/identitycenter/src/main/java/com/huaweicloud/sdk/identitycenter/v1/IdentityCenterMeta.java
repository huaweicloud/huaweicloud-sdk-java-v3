package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCustomerManagedPolicyReferencesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCustomerManagedPolicyReferencesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfileAssociationsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfileAssociationsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetResponse;

@SuppressWarnings("unchecked")
public class IdentityCenterMeta {

    public static final HttpRequestDef<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> createAccountAssignment =
        genForcreateAccountAssignment();

    private static HttpRequestDef<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> genForcreateAccountAssignment() {
        // basic
        HttpRequestDef.Builder<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAccountAssignmentRequest.class, CreateAccountAssignmentResponse.class)
            .withName("CreateAccountAssignment")
            .withUri("/v1/instances/{instance_id}/account-assignments/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateAccountAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccountAssignmentReqBody.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> deleteAccountAssignment =
        genFordeleteAccountAssignment();

    private static HttpRequestDef<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> genFordeleteAccountAssignment() {
        // basic
        HttpRequestDef.Builder<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteAccountAssignmentRequest.class, DeleteAccountAssignmentResponse.class)
            .withName("DeleteAccountAssignment")
            .withUri("/v1/instances/{instance_id}/account-assignments/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeleteAccountAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAccountAssignmentReqBody.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> describeAccountAssignmentCreationStatus =
        genFordescribeAccountAssignmentCreationStatus();

    private static HttpRequestDef<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> genFordescribeAccountAssignmentCreationStatus() {
        // basic
        HttpRequestDef.Builder<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeAccountAssignmentCreationStatusRequest.class,
                    DescribeAccountAssignmentCreationStatusResponse.class)
                .withName("DescribeAccountAssignmentCreationStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/creation-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> describeAccountAssignmentDeletionStatus =
        genFordescribeAccountAssignmentDeletionStatus();

    private static HttpRequestDef<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> genFordescribeAccountAssignmentDeletionStatus() {
        // basic
        HttpRequestDef.Builder<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeAccountAssignmentDeletionStatusRequest.class,
                    DescribeAccountAssignmentDeletionStatusResponse.class)
                .withName("DescribeAccountAssignmentDeletionStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/deletion-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> listAccountAssignmentCreationStatus =
        genForlistAccountAssignmentCreationStatus();

    private static HttpRequestDef<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> genForlistAccountAssignmentCreationStatus() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountAssignmentCreationStatusRequest.class,
                    ListAccountAssignmentCreationStatusResponse.class)
                .withName("ListAccountAssignmentCreationStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/creation-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListAccountAssignmentCreationStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountAssignmentCreationStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> listAccountAssignmentDeletionStatus =
        genForlistAccountAssignmentDeletionStatus();

    private static HttpRequestDef<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> genForlistAccountAssignmentDeletionStatus() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountAssignmentDeletionStatusRequest.class,
                    ListAccountAssignmentDeletionStatusResponse.class)
                .withName("ListAccountAssignmentDeletionStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/deletion-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListAccountAssignmentDeletionStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountAssignmentDeletionStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> listAccountAssignments =
        genForlistAccountAssignments();

    private static HttpRequestDef<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> genForlistAccountAssignments() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccountAssignmentsRequest.class, ListAccountAssignmentsResponse.class)
            .withName("ListAccountAssignments")
            .withUri("/v1/instances/{instance_id}/account-assignments")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProfileAssociationsRequest, ListProfileAssociationsResponse> listProfileAssociations =
        genForlistProfileAssociations();

    private static HttpRequestDef<ListProfileAssociationsRequest, ListProfileAssociationsResponse> genForlistProfileAssociations() {
        // basic
        HttpRequestDef.Builder<ListProfileAssociationsRequest, ListProfileAssociationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProfileAssociationsRequest.class, ListProfileAssociationsResponse.class)
            .withName("ListProfileAssociations")
            .withUri("/v1/instances/{instance_id}/profile-associations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfileAssociationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("profile_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfileAssociationsRequest::getProfileId, (req, v) -> {
                req.setProfileId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v1/instances")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> attachCustomerManagedPolicyToPermissionSet =
        genForattachCustomerManagedPolicyToPermissionSet();

    private static HttpRequestDef<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> genForattachCustomerManagedPolicyToPermissionSet() {
        // basic
        HttpRequestDef.Builder<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachCustomerManagedPolicyToPermissionSetRequest.class,
                    AttachCustomerManagedPolicyToPermissionSetResponse.class)
                .withName("AttachCustomerManagedPolicyToPermissionSet")
                .withUri(
                    "/v1/instances/{instance_id}/permission-sets/{permission_set_id}/attach-customer-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachCustomerManagedPolicyToPermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachCustomerManagedPolicyToPermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AttachCustomerManagedPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachCustomerManagedPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(AttachCustomerManagedPolicyToPermissionSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> attachManagedPolicyToPermissionSet =
        genForattachManagedPolicyToPermissionSet();

    private static HttpRequestDef<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> genForattachManagedPolicyToPermissionSet() {
        // basic
        HttpRequestDef.Builder<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachManagedPolicyToPermissionSetRequest.class,
                    AttachManagedPolicyToPermissionSetResponse.class)
                .withName("AttachManagedPolicyToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/attach-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));
        builder.<AttachManagedPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachManagedPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermissionSetRequest, CreatePermissionSetResponse> createPermissionSet =
        genForcreatePermissionSet();

    private static HttpRequestDef<CreatePermissionSetRequest, CreatePermissionSetResponse> genForcreatePermissionSet() {
        // basic
        HttpRequestDef.Builder<CreatePermissionSetRequest, CreatePermissionSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePermissionSetRequest.class, CreatePermissionSetResponse.class)
                .withName("CreatePermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePermissionSetReqBody.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePermissionSetRequest, DeletePermissionSetResponse> deletePermissionSet =
        genFordeletePermissionSet();

    private static HttpRequestDef<DeletePermissionSetRequest, DeletePermissionSetResponse> genFordeletePermissionSet() {
        // basic
        HttpRequestDef.Builder<DeletePermissionSetRequest, DeletePermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePermissionSetRequest.class, DeletePermissionSetResponse.class)
            .withName("DeletePermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribePermissionSetRequest, DescribePermissionSetResponse> describePermissionSet =
        genFordescribePermissionSet();

    private static HttpRequestDef<DescribePermissionSetRequest, DescribePermissionSetResponse> genFordescribePermissionSet() {
        // basic
        HttpRequestDef.Builder<DescribePermissionSetRequest, DescribePermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DescribePermissionSetRequest.class, DescribePermissionSetResponse.class)
            .withName("DescribePermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> describePermissionSetProvisioningStatus =
        genFordescribePermissionSetProvisioningStatus();

    private static HttpRequestDef<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> genFordescribePermissionSetProvisioningStatus() {
        // basic
        HttpRequestDef.Builder<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribePermissionSetProvisioningStatusRequest.class,
                    DescribePermissionSetProvisioningStatusResponse.class)
                .withName("DescribePermissionSetProvisioningStatus")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioning-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> detachCustomerManagedPolicyReferenceFromPermissionSet =
        genFordetachCustomerManagedPolicyReferenceFromPermissionSet();

    private static HttpRequestDef<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> genFordetachCustomerManagedPolicyReferenceFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetachCustomerManagedPolicyReferenceFromPermissionSetRequest.class,
                    DetachCustomerManagedPolicyReferenceFromPermissionSetResponse.class)
                .withName("DetachCustomerManagedPolicyReferenceFromPermissionSet")
                .withUri(
                    "/v1/instances/{instance_id}/permission-sets/{permission_set_id}/detach-customer-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::getInstanceId,
                (req, v) -> {
                    req.setInstanceId(v);
                }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::getPermissionSetId,
                (req, v) -> {
                    req.setPermissionSetId(v);
                }));
        builder.<DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> detachManagedPolicyFromPermissionSet =
        genFordetachManagedPolicyFromPermissionSet();

    private static HttpRequestDef<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> genFordetachManagedPolicyFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetachManagedPolicyFromPermissionSetRequest.class,
                    DetachManagedPolicyFromPermissionSetResponse.class)
                .withName("DetachManagedPolicyFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/detach-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));
        builder.<DetachManagedPolicyFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachManagedPolicyFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> listAccountsForProvisionedPermissionSet =
        genForlistAccountsForProvisionedPermissionSet();

    private static HttpRequestDef<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> genForlistAccountsForProvisionedPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountsForProvisionedPermissionSetRequest.class,
                    ListAccountsForProvisionedPermissionSetResponse.class)
                .withName("ListAccountsForProvisionedPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ListAccountsForProvisionedPermissionSetRequest.ProvisioningStatusEnum>withRequestField(
            "provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountsForProvisionedPermissionSetRequest.ProvisioningStatusEnum.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> listCustomerManagedPolicyReferencesInPermissionSet =
        genForlistCustomerManagedPolicyReferencesInPermissionSet();

    private static HttpRequestDef<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> genForlistCustomerManagedPolicyReferencesInPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCustomerManagedPolicyReferencesInPermissionSetRequest.class,
                    ListCustomerManagedPolicyReferencesInPermissionSetResponse.class)
                .withName("ListCustomerManagedPolicyReferencesInPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/customer-managed-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getInstanceId,
                (req, v) -> {
                    req.setInstanceId(v);
                }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getPermissionSetId,
                (req, v) -> {
                    req.setPermissionSetId(v);
                }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> listManagedPoliciesInPermissionSet =
        genForlistManagedPoliciesInPermissionSet();

    private static HttpRequestDef<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> genForlistManagedPoliciesInPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedPoliciesInPermissionSetRequest.class,
                    ListManagedPoliciesInPermissionSetResponse.class)
                .withName("ListManagedPoliciesInPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/managed-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> listPermissionSetProvisioningStatus =
        genForlistPermissionSetProvisioningStatus();

    private static HttpRequestDef<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> genForlistPermissionSetProvisioningStatus() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPermissionSetProvisioningStatusRequest.class,
                    ListPermissionSetProvisioningStatusResponse.class)
                .withName("ListPermissionSetProvisioningStatus")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioning-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ListPermissionSetProvisioningStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPermissionSetProvisioningStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetsRequest, ListPermissionSetsResponse> listPermissionSets =
        genForlistPermissionSets();

    private static HttpRequestDef<ListPermissionSetsRequest, ListPermissionSetsResponse> genForlistPermissionSets() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetsRequest, ListPermissionSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermissionSetsRequest.class, ListPermissionSetsResponse.class)
                .withName("ListPermissionSets")
                .withUri("/v1/instances/{instance_id}/permission-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));
        builder.<String>withRequestField("permission_urn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getPermissionUrn, (req, v) -> {
                req.setPermissionUrn(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> listPermissionSetsProvisionedToAccount =
        genForlistPermissionSetsProvisionedToAccount();

    private static HttpRequestDef<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> genForlistPermissionSetsProvisionedToAccount() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPermissionSetsProvisionedToAccountRequest.class,
                    ListPermissionSetsProvisionedToAccountResponse.class)
                .withName("ListPermissionSetsProvisionedToAccount")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioned-to-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<ListPermissionSetsProvisionedToAccountRequest.ProvisioningStatusEnum>withRequestField(
            "provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPermissionSetsProvisionedToAccountRequest.ProvisioningStatusEnum.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermissionSetRequest, UpdatePermissionSetResponse> updatePermissionSet =
        genForupdatePermissionSet();

    private static HttpRequestDef<UpdatePermissionSetRequest, UpdatePermissionSetResponse> genForupdatePermissionSet() {
        // basic
        HttpRequestDef.Builder<UpdatePermissionSetRequest, UpdatePermissionSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePermissionSetRequest.class, UpdatePermissionSetResponse.class)
                .withName("UpdatePermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getPermissionSetId, (req, v) -> {
                req.setPermissionSetId(v);
            }));
        builder.<UpdatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermissionSetReqBody.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
