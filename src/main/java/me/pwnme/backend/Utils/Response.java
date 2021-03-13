package me.pwnme.backend.Utils;

public class Response {

    public static final String ok                         = "0";
    public static final String email_already_exists       = "1";
    public static final String invalid_credentials        = "2";
    public static final String email_does_not_exist       = "3";
    public static final String null_or_empty_data         = "4";
    public static final String invalid_token              = "5";
    public static final String multiple_accounts_on_email = "6";
    public static final String token_expired              = "7";
    public static final String sql_injection              = "-1";
    public static final String internal_error             = "-2";
    public static final String string_format              = "-3";

}