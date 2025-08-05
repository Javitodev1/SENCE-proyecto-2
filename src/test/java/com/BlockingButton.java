package com;

import org.openqa.selenium.JavascriptExecutor;

public class BlockingButton {
    public static void addBlockButton(JavascriptExecutor js, String buttonID, String answer) {
        String script = String.format(
                "let intentosFallidos = 0; const loginBtn = document.querySelector(\"#%s\"); if (!loginBtn.dataset.listenerAttached) { loginBtn.addEventListener(\"click\", function() { const usuario = document.querySelector(\"#username\").value; const clave = document.querySelector(\"#password\").value; if (intentosFallidos >= 3) { loginBtn.disabled = true; alert(\"Cuenta bloqueada por múltiples intentos fallidos\"); } }); loginBtn.dataset.listenerAttached = true; }",
                buttonID);
        js.executeScript(script);
    }
}
