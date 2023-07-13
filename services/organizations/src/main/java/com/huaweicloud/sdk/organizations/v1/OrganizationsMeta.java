package com.huaweicloud.sdk.organizations.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.organizations.v1.model.AcceptHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.AcceptHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.AttachPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.AttachPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.CancelHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.CancelHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitReqBody;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyReqBody;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateTagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateTagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeclineHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeclineHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.DelegatedAdministratorReqBody;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeleteTagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteTagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeregisterDelegatedAdministratorRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeregisterDelegatedAdministratorResponse;
import com.huaweicloud.sdk.organizations.v1.model.DetachPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.DetachPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.DisablePolicyTypeRequest;
import com.huaweicloud.sdk.organizations.v1.model.DisablePolicyTypeResponse;
import com.huaweicloud.sdk.organizations.v1.model.DisableTrustedServiceRequest;
import com.huaweicloud.sdk.organizations.v1.model.DisableTrustedServiceResponse;
import com.huaweicloud.sdk.organizations.v1.model.EnablePolicyTypeRequest;
import com.huaweicloud.sdk.organizations.v1.model.EnablePolicyTypeResponse;
import com.huaweicloud.sdk.organizations.v1.model.EnableTrustedServiceRequest;
import com.huaweicloud.sdk.organizations.v1.model.EnableTrustedServiceResponse;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountReqBody;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.LeaveOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.LeaveOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListAccountsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListCreateAccountStatusesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListCreateAccountStatusesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedAdministratorsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedAdministratorsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesForPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesForPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListHandshakesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListHandshakesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListOrganizationalUnitsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListOrganizationalUnitsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListPoliciesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListPoliciesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListReceivedHandshakesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListReceivedHandshakesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListRootsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListRootsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagPolicyServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagPolicyServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagResourcesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagResourcesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagsForResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagsForResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTrustedServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTrustedServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountReqBody;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.PolicyTachReqBody;
import com.huaweicloud.sdk.organizations.v1.model.PolicyTypeReqBody;
import com.huaweicloud.sdk.organizations.v1.model.RegisterDelegatedAdministratorRequest;
import com.huaweicloud.sdk.organizations.v1.model.RegisterDelegatedAdministratorResponse;
import com.huaweicloud.sdk.organizations.v1.model.RemoveAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.RemoveAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.ResourceInstanceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.ShowAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowCreateAccountStatusRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowCreateAccountStatusResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowEffectivePoliciesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowEffectivePoliciesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowResourceInstancesCountRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowResourceInstancesCountResponse;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.TrustedServiceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class OrganizationsMeta {

    public static final HttpRequestDef<InviteAccountRequest, InviteAccountResponse> inviteAccount =
        genForinviteAccount();

    private static HttpRequestDef<InviteAccountRequest, InviteAccountResponse> genForinviteAccount() {
        // basic
        HttpRequestDef.Builder<InviteAccountRequest, InviteAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteAccountRequest.class, InviteAccountResponse.class)
                .withName("InviteAccount")
                .withUri("/v1/organizations/accounts/invite")
                .withContentType("application/json");

        // requests
        builder.<InviteAccountReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InviteAccountReqBody.class),
            f -> f.withMarshaller(InviteAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountsRequest, ListAccountsResponse> listAccounts = genForlistAccounts();

    private static HttpRequestDef<ListAccountsRequest, ListAccountsResponse> genForlistAccounts() {
        // basic
        HttpRequestDef.Builder<ListAccountsRequest, ListAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccountsRequest.class, ListAccountsResponse.class)
                .withName("ListAccounts")
                .withUri("/v1/organizations/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> listCreateAccountStatuses =
        genForlistCreateAccountStatuses();

    private static HttpRequestDef<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> genForlistCreateAccountStatuses() {
        // basic
        HttpRequestDef.Builder<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCreateAccountStatusesRequest.class,
                    ListCreateAccountStatusesResponse.class)
                .withName("ListCreateAccountStatuses")
                .withUri("/v1/organizations/create-account-status")
                .withContentType("application/json");

        // requests
        builder.<List<ListCreateAccountStatusesRequest.StatesEnum>>withRequestField("states",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCreateAccountStatusesRequest::getStates, (req, v) -> {
                req.setStates(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCreateAccountStatusesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCreateAccountStatusesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MoveAccountRequest, MoveAccountResponse> moveAccount = genFormoveAccount();

    private static HttpRequestDef<MoveAccountRequest, MoveAccountResponse> genFormoveAccount() {
        // basic
        HttpRequestDef.Builder<MoveAccountRequest, MoveAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MoveAccountRequest.class, MoveAccountResponse.class)
                .withName("MoveAccount")
                .withUri("/v1/organizations/accounts/{account_id}/move")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveAccountRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<MoveAccountReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MoveAccountReqBody.class),
            f -> f.withMarshaller(MoveAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveAccountRequest, RemoveAccountResponse> removeAccount =
        genForremoveAccount();

    private static HttpRequestDef<RemoveAccountRequest, RemoveAccountResponse> genForremoveAccount() {
        // basic
        HttpRequestDef.Builder<RemoveAccountRequest, RemoveAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveAccountRequest.class, RemoveAccountResponse.class)
                .withName("RemoveAccount")
                .withUri("/v1/organizations/accounts/{account_id}/remove")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAccountRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccountRequest, ShowAccountResponse> showAccount = genForshowAccount();

    private static HttpRequestDef<ShowAccountRequest, ShowAccountResponse> genForshowAccount() {
        // basic
        HttpRequestDef.Builder<ShowAccountRequest, ShowAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccountRequest.class, ShowAccountResponse.class)
                .withName("ShowAccount")
                .withUri("/v1/organizations/accounts/{account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccountRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> showCreateAccountStatus =
        genForshowCreateAccountStatus();

    private static HttpRequestDef<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> genForshowCreateAccountStatus() {
        // basic
        HttpRequestDef.Builder<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCreateAccountStatusRequest.class, ShowCreateAccountStatusResponse.class)
            .withName("ShowCreateAccountStatus")
            .withUri("/v1/organizations/create-account-status/{create_account_status_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("create_account_status_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCreateAccountStatusRequest::getCreateAccountStatusId, (req, v) -> {
                req.setCreateAccountStatusId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator =
        genForderegisterDelegatedAdministrator();

    private static HttpRequestDef<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> genForderegisterDelegatedAdministrator() {
        // basic
        HttpRequestDef.Builder<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeregisterDelegatedAdministratorRequest.class,
                    DeregisterDelegatedAdministratorResponse.class)
                .withName("DeregisterDelegatedAdministrator")
                .withUri("/v1/organizations/delegated-administrators/deregister")
                .withContentType("application/json");

        // requests
        builder.<DelegatedAdministratorReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelegatedAdministratorReqBody.class),
            f -> f.withMarshaller(DeregisterDelegatedAdministratorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> listDelegatedAdministrators =
        genForlistDelegatedAdministrators();

    private static HttpRequestDef<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> genForlistDelegatedAdministrators() {
        // basic
        HttpRequestDef.Builder<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDelegatedAdministratorsRequest.class,
                    ListDelegatedAdministratorsResponse.class)
                .withName("ListDelegatedAdministrators")
                .withUri("/v1/organizations/delegated-administrators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_principal",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedAdministratorsRequest::getServicePrincipal, (req, v) -> {
                req.setServicePrincipal(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDelegatedAdministratorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedAdministratorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDelegatedServicesRequest, ListDelegatedServicesResponse> listDelegatedServices =
        genForlistDelegatedServices();

    private static HttpRequestDef<ListDelegatedServicesRequest, ListDelegatedServicesResponse> genForlistDelegatedServices() {
        // basic
        HttpRequestDef.Builder<ListDelegatedServicesRequest, ListDelegatedServicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDelegatedServicesRequest.class, ListDelegatedServicesResponse.class)
            .withName("ListDelegatedServices")
            .withUri("/v1/organizations/accounts/{account_id}/delegated-services")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedServicesRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDelegatedServicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedServicesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator =
        genForregisterDelegatedAdministrator();

    private static HttpRequestDef<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> genForregisterDelegatedAdministrator() {
        // basic
        HttpRequestDef.Builder<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RegisterDelegatedAdministratorRequest.class,
                    RegisterDelegatedAdministratorResponse.class)
                .withName("RegisterDelegatedAdministrator")
                .withUri("/v1/organizations/delegated-administrators/register")
                .withContentType("application/json");

        // requests
        builder.<DelegatedAdministratorReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelegatedAdministratorReqBody.class),
            f -> f.withMarshaller(RegisterDelegatedAdministratorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AcceptHandshakeRequest, AcceptHandshakeResponse> acceptHandshake =
        genForacceptHandshake();

    private static HttpRequestDef<AcceptHandshakeRequest, AcceptHandshakeResponse> genForacceptHandshake() {
        // basic
        HttpRequestDef.Builder<AcceptHandshakeRequest, AcceptHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AcceptHandshakeRequest.class, AcceptHandshakeResponse.class)
                .withName("AcceptHandshake")
                .withUri("/v1/received-handshakes/{handshake_id}/accept")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptHandshakeRequest::getHandshakeId, (req, v) -> {
                req.setHandshakeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelHandshakeRequest, CancelHandshakeResponse> cancelHandshake =
        genForcancelHandshake();

    private static HttpRequestDef<CancelHandshakeRequest, CancelHandshakeResponse> genForcancelHandshake() {
        // basic
        HttpRequestDef.Builder<CancelHandshakeRequest, CancelHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelHandshakeRequest.class, CancelHandshakeResponse.class)
                .withName("CancelHandshake")
                .withUri("/v1/organizations/handshakes/{handshake_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelHandshakeRequest::getHandshakeId, (req, v) -> {
                req.setHandshakeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeclineHandshakeRequest, DeclineHandshakeResponse> declineHandshake =
        genFordeclineHandshake();

    private static HttpRequestDef<DeclineHandshakeRequest, DeclineHandshakeResponse> genFordeclineHandshake() {
        // basic
        HttpRequestDef.Builder<DeclineHandshakeRequest, DeclineHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeclineHandshakeRequest.class, DeclineHandshakeResponse.class)
                .withName("DeclineHandshake")
                .withUri("/v1/received-handshakes/{handshake_id}/decline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeclineHandshakeRequest::getHandshakeId, (req, v) -> {
                req.setHandshakeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHandshakesRequest, ListHandshakesResponse> listHandshakes =
        genForlistHandshakes();

    private static HttpRequestDef<ListHandshakesRequest, ListHandshakesResponse> genForlistHandshakes() {
        // basic
        HttpRequestDef.Builder<ListHandshakesRequest, ListHandshakesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHandshakesRequest.class, ListHandshakesResponse.class)
                .withName("ListHandshakes")
                .withUri("/v1/organizations/handshakes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHandshakesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHandshakesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> listReceivedHandshakes =
        genForlistReceivedHandshakes();

    private static HttpRequestDef<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> genForlistReceivedHandshakes() {
        // basic
        HttpRequestDef.Builder<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListReceivedHandshakesRequest.class, ListReceivedHandshakesResponse.class)
            .withName("ListReceivedHandshakes")
            .withUri("/v1/received-handshakes")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReceivedHandshakesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReceivedHandshakesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHandshakeRequest, ShowHandshakeResponse> showHandshake =
        genForshowHandshake();

    private static HttpRequestDef<ShowHandshakeRequest, ShowHandshakeResponse> genForshowHandshake() {
        // basic
        HttpRequestDef.Builder<ShowHandshakeRequest, ShowHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHandshakeRequest.class, ShowHandshakeResponse.class)
                .withName("ShowHandshake")
                .withUri("/v1/organizations/handshakes/{handshake_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHandshakeRequest::getHandshakeId, (req, v) -> {
                req.setHandshakeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEntitiesRequest, ListEntitiesResponse> listEntities = genForlistEntities();

    private static HttpRequestDef<ListEntitiesRequest, ListEntitiesResponse> genForlistEntities() {
        // basic
        HttpRequestDef.Builder<ListEntitiesRequest, ListEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEntitiesRequest.class, ListEntitiesResponse.class)
                .withName("ListEntities")
                .withUri("/v1/organizations/entities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));
        builder.<String>withRequestField("child_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesRequest::getChildId, (req, v) -> {
                req.setChildId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEntitiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
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
                .withUri("/v1/organizations/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicesRequest, ListServicesResponse> listServices = genForlistServices();

    private static HttpRequestDef<ListServicesRequest, ListServicesResponse> genForlistServices() {
        // basic
        HttpRequestDef.Builder<ListServicesRequest, ListServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServicesRequest.class, ListServicesResponse.class)
                .withName("ListServices")
                .withUri("/v1/organizations/services")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> listTagPolicyServices =
        genForlistTagPolicyServices();

    private static HttpRequestDef<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> genForlistTagPolicyServices() {
        // basic
        HttpRequestDef.Builder<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTagPolicyServicesRequest.class, ListTagPolicyServicesResponse.class)
            .withName("ListTagPolicyServices")
            .withUri("/v1/organizations/tag-policy-services")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> showEffectivePolicies =
        genForshowEffectivePolicies();

    private static HttpRequestDef<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> genForshowEffectivePolicies() {
        // basic
        HttpRequestDef.Builder<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEffectivePoliciesRequest.class, ShowEffectivePoliciesResponse.class)
            .withName("ShowEffectivePolicies")
            .withUri("/v1/organizations/entities/effective-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("entity_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEffectivePoliciesRequest::getEntityId, (req, v) -> {
                req.setEntityId(v);
            }));
        builder.<ShowEffectivePoliciesRequest.PolicyTypeEnum>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowEffectivePoliciesRequest.PolicyTypeEnum.class),
            f -> f.withMarshaller(ShowEffectivePoliciesRequest::getPolicyType, (req, v) -> {
                req.setPolicyType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrganizationRequest, CreateOrganizationResponse> createOrganization =
        genForcreateOrganization();

    private static HttpRequestDef<CreateOrganizationRequest, CreateOrganizationResponse> genForcreateOrganization() {
        // basic
        HttpRequestDef.Builder<CreateOrganizationRequest, CreateOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrganizationRequest.class, CreateOrganizationResponse.class)
                .withName("CreateOrganization")
                .withUri("/v1/organizations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOrganizationRequest, DeleteOrganizationResponse> deleteOrganization =
        genFordeleteOrganization();

    private static HttpRequestDef<DeleteOrganizationRequest, DeleteOrganizationResponse> genFordeleteOrganization() {
        // basic
        HttpRequestDef.Builder<DeleteOrganizationRequest, DeleteOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteOrganizationRequest.class, DeleteOrganizationResponse.class)
                .withName("DeleteOrganization")
                .withUri("/v1/organizations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LeaveOrganizationRequest, LeaveOrganizationResponse> leaveOrganization =
        genForleaveOrganization();

    private static HttpRequestDef<LeaveOrganizationRequest, LeaveOrganizationResponse> genForleaveOrganization() {
        // basic
        HttpRequestDef.Builder<LeaveOrganizationRequest, LeaveOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LeaveOrganizationRequest.class, LeaveOrganizationResponse.class)
                .withName("LeaveOrganization")
                .withUri("/v1/organizations/leave")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRootsRequest, ListRootsResponse> listRoots = genForlistRoots();

    private static HttpRequestDef<ListRootsRequest, ListRootsResponse> genForlistRoots() {
        // basic
        HttpRequestDef.Builder<ListRootsRequest, ListRootsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRootsRequest.class, ListRootsResponse.class)
                .withName("ListRoots")
                .withUri("/v1/organizations/roots")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRootsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRootsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationRequest, ShowOrganizationResponse> showOrganization =
        genForshowOrganization();

    private static HttpRequestDef<ShowOrganizationRequest, ShowOrganizationResponse> genForshowOrganization() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationRequest, ShowOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOrganizationRequest.class, ShowOrganizationResponse.class)
                .withName("ShowOrganization")
                .withUri("/v1/organizations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> createOrganizationalUnit =
        genForcreateOrganizationalUnit();

    private static HttpRequestDef<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> genForcreateOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateOrganizationalUnitRequest.class, CreateOrganizationalUnitResponse.class)
                .withName("CreateOrganizationalUnit")
                .withUri("/v1/organizations/organizational-units")
                .withContentType("application/json");

        // requests
        builder.<CreateOrganizationalUnitReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrganizationalUnitReqBody.class),
            f -> f.withMarshaller(CreateOrganizationalUnitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> deleteOrganizationalUnit =
        genFordeleteOrganizationalUnit();

    private static HttpRequestDef<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> genFordeleteOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteOrganizationalUnitRequest.class,
                    DeleteOrganizationalUnitResponse.class)
                .withName("DeleteOrganizationalUnit")
                .withUri("/v1/organizations/organizational-units/{organizational_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOrganizationalUnitRequest::getOrganizationalUnitId, (req, v) -> {
                req.setOrganizationalUnitId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> listOrganizationalUnits =
        genForlistOrganizationalUnits();

    private static HttpRequestDef<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> genForlistOrganizationalUnits() {
        // basic
        HttpRequestDef.Builder<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOrganizationalUnitsRequest.class, ListOrganizationalUnitsResponse.class)
            .withName("ListOrganizationalUnits")
            .withUri("/v1/organizations/organizational-units")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationalUnitsRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrganizationalUnitsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationalUnitsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> showOrganizationalUnit =
        genForshowOrganizationalUnit();

    private static HttpRequestDef<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> genForshowOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOrganizationalUnitRequest.class, ShowOrganizationalUnitResponse.class)
            .withName("ShowOrganizationalUnit")
            .withUri("/v1/organizations/organizational-units/{organizational_unit_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationalUnitRequest::getOrganizationalUnitId, (req, v) -> {
                req.setOrganizationalUnitId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> updateOrganizationalUnit =
        genForupdateOrganizationalUnit();

    private static HttpRequestDef<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> genForupdateOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateOrganizationalUnitRequest.class,
                    UpdateOrganizationalUnitResponse.class)
                .withName("UpdateOrganizationalUnit")
                .withUri("/v1/organizations/organizational-units/{organizational_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOrganizationalUnitRequest::getOrganizationalUnitId, (req, v) -> {
                req.setOrganizationalUnitId(v);
            }));
        builder.<UpdateOrganizationalUnitReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOrganizationalUnitReqBody.class),
            f -> f.withMarshaller(UpdateOrganizationalUnitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachPolicyRequest, AttachPolicyResponse> attachPolicy = genForattachPolicy();

    private static HttpRequestDef<AttachPolicyRequest, AttachPolicyResponse> genForattachPolicy() {
        // basic
        HttpRequestDef.Builder<AttachPolicyRequest, AttachPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachPolicyRequest.class, AttachPolicyResponse.class)
                .withName("AttachPolicy")
                .withUri("/v1/organizations/policies/{policy_id}/attach")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<PolicyTachReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTachReqBody.class),
            f -> f.withMarshaller(AttachPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForcreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForcreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/organizations/policies")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreatePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyReqBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genFordeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genFordeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/organizations/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachPolicyRequest, DetachPolicyResponse> detachPolicy = genFordetachPolicy();

    private static HttpRequestDef<DetachPolicyRequest, DetachPolicyResponse> genFordetachPolicy() {
        // basic
        HttpRequestDef.Builder<DetachPolicyRequest, DetachPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachPolicyRequest.class, DetachPolicyResponse.class)
                .withName("DetachPolicy")
                .withUri("/v1/organizations/policies/{policy_id}/detach")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<PolicyTachReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTachReqBody.class),
            f -> f.withMarshaller(DetachPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisablePolicyTypeRequest, DisablePolicyTypeResponse> disablePolicyType =
        genFordisablePolicyType();

    private static HttpRequestDef<DisablePolicyTypeRequest, DisablePolicyTypeResponse> genFordisablePolicyType() {
        // basic
        HttpRequestDef.Builder<DisablePolicyTypeRequest, DisablePolicyTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisablePolicyTypeRequest.class, DisablePolicyTypeResponse.class)
                .withName("DisablePolicyType")
                .withUri("/v1/organizations/policies/disable")
                .withContentType("application/json");

        // requests
        builder.<PolicyTypeReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTypeReqBody.class),
            f -> f.withMarshaller(DisablePolicyTypeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnablePolicyTypeRequest, EnablePolicyTypeResponse> enablePolicyType =
        genForenablePolicyType();

    private static HttpRequestDef<EnablePolicyTypeRequest, EnablePolicyTypeResponse> genForenablePolicyType() {
        // basic
        HttpRequestDef.Builder<EnablePolicyTypeRequest, EnablePolicyTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnablePolicyTypeRequest.class, EnablePolicyTypeResponse.class)
                .withName("EnablePolicyType")
                .withUri("/v1/organizations/policies/enable")
                .withContentType("application/json");

        // requests
        builder.<PolicyTypeReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTypeReqBody.class),
            f -> f.withMarshaller(EnablePolicyTypeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> listEntitiesForPolicy =
        genForlistEntitiesForPolicy();

    private static HttpRequestDef<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> genForlistEntitiesForPolicy() {
        // basic
        HttpRequestDef.Builder<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEntitiesForPolicyRequest.class, ListEntitiesForPolicyResponse.class)
            .withName("ListEntitiesForPolicy")
            .withUri("/v1/organizations/policies/{policy_id}/attached-entities")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesForPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEntitiesForPolicyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesForPolicyRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForlistPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForlistPolicies() {
        // basic
        HttpRequestDef.Builder<ListPoliciesRequest, ListPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesRequest.class, ListPoliciesResponse.class)
                .withName("ListPolicies")
                .withUri("/v1/organizations/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("attached_entity_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getAttachedEntityId, (req, v) -> {
                req.setAttachedEntityId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ListPoliciesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoliciesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPoliciesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForshowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForshowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/organizations/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<ShowPolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForupdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForupdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/organizations/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<UpdatePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyReqBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagResourceRequest, CreateTagResourceResponse> createTagResource =
        genForcreateTagResource();

    private static HttpRequestDef<CreateTagResourceRequest, CreateTagResourceResponse> genForcreateTagResource() {
        // basic
        HttpRequestDef.Builder<CreateTagResourceRequest, CreateTagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagResourceRequest.class, CreateTagResourceResponse.class)
                .withName("CreateTagResource")
                .withUri("/v1/organizations/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<CreateTagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagResourceRequest, DeleteTagResourceResponse> deleteTagResource =
        genFordeleteTagResource();

    private static HttpRequestDef<DeleteTagResourceRequest, DeleteTagResourceResponse> genFordeleteTagResource() {
        // basic
        HttpRequestDef.Builder<DeleteTagResourceRequest, DeleteTagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTagResourceRequest.class, DeleteTagResourceResponse.class)
                .withName("DeleteTagResource")
                .withUri("/v1/organizations/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForlistResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForlistResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/v1/organizations/{resource_type}/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ResourceInstanceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceReqBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForlistResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForlistResourceTags() {
        // basic
        HttpRequestDef.Builder<ListResourceTagsRequest, ListResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagsRequest.class, ListResourceTagsResponse.class)
                .withName("ListResourceTags")
                .withUri("/v1/organizations/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagResourcesRequest, ListTagResourcesResponse> listTagResources =
        genForlistTagResources();

    private static HttpRequestDef<ListTagResourcesRequest, ListTagResourcesResponse> genForlistTagResources() {
        // basic
        HttpRequestDef.Builder<ListTagResourcesRequest, ListTagResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagResourcesRequest.class, ListTagResourcesResponse.class)
                .withName("ListTagResources")
                .withUri("/v1/organizations/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListTagResourcesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourcesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsForResourceRequest, ListTagsForResourceResponse> listTagsForResource =
        genForlistTagsForResource();

    private static HttpRequestDef<ListTagsForResourceRequest, ListTagsForResourceResponse> genForlistTagsForResource() {
        // basic
        HttpRequestDef.Builder<ListTagsForResourceRequest, ListTagsForResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsForResourceRequest.class, ListTagsForResourceResponse.class)
                .withName("ListTagsForResource")
                .withUri("/v1/organizations/resources/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> showResourceInstancesCount =
        genForshowResourceInstancesCount();

    private static HttpRequestDef<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> genForshowResourceInstancesCount() {
        // basic
        HttpRequestDef.Builder<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowResourceInstancesCountRequest.class,
                    ShowResourceInstancesCountResponse.class)
                .withName("ShowResourceInstancesCount")
                .withUri("/v1/organizations/{resource_type}/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ShowResourceInstancesCountRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceInstancesCountRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowResourceInstancesCountRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ResourceInstanceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceReqBody.class),
            f -> f.withMarshaller(ShowResourceInstancesCountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagResourceRequest, TagResourceResponse> tagResource = genFortagResource();

    private static HttpRequestDef<TagResourceRequest, TagResourceResponse> genFortagResource() {
        // basic
        HttpRequestDef.Builder<TagResourceRequest, TagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagResourceRequest.class, TagResourceResponse.class)
                .withName("TagResource")
                .withUri("/v1/organizations/resources/{resource_id}/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(TagResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UntagResourceRequest, UntagResourceResponse> untagResource =
        genForuntagResource();

    private static HttpRequestDef<UntagResourceRequest, UntagResourceResponse> genForuntagResource() {
        // basic
        HttpRequestDef.Builder<UntagResourceRequest, UntagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UntagResourceRequest.class, UntagResourceResponse.class)
                .withName("UntagResource")
                .withUri("/v1/organizations/resources/{resource_id}/untag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<UntagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagResourceReqBody.class),
            f -> f.withMarshaller(UntagResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableTrustedServiceRequest, DisableTrustedServiceResponse> disableTrustedService =
        genFordisableTrustedService();

    private static HttpRequestDef<DisableTrustedServiceRequest, DisableTrustedServiceResponse> genFordisableTrustedService() {
        // basic
        HttpRequestDef.Builder<DisableTrustedServiceRequest, DisableTrustedServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisableTrustedServiceRequest.class, DisableTrustedServiceResponse.class)
            .withName("DisableTrustedService")
            .withUri("/v1/organizations/trusted-services/disable")
            .withContentType("application/json");

        // requests
        builder.<TrustedServiceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrustedServiceReqBody.class),
            f -> f.withMarshaller(DisableTrustedServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableTrustedServiceRequest, EnableTrustedServiceResponse> enableTrustedService =
        genForenableTrustedService();

    private static HttpRequestDef<EnableTrustedServiceRequest, EnableTrustedServiceResponse> genForenableTrustedService() {
        // basic
        HttpRequestDef.Builder<EnableTrustedServiceRequest, EnableTrustedServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableTrustedServiceRequest.class, EnableTrustedServiceResponse.class)
            .withName("EnableTrustedService")
            .withUri("/v1/organizations/trusted-services/enable")
            .withContentType("application/json");

        // requests
        builder.<TrustedServiceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrustedServiceReqBody.class),
            f -> f.withMarshaller(EnableTrustedServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrustedServicesRequest, ListTrustedServicesResponse> listTrustedServices =
        genForlistTrustedServices();

    private static HttpRequestDef<ListTrustedServicesRequest, ListTrustedServicesResponse> genForlistTrustedServices() {
        // basic
        HttpRequestDef.Builder<ListTrustedServicesRequest, ListTrustedServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTrustedServicesRequest.class, ListTrustedServicesResponse.class)
                .withName("ListTrustedServices")
                .withUri("/v1/organizations/trusted-services")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedServicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrustedServicesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

}
