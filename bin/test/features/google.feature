Feature: Probar la busqueda en Google

Scenario: Busco algo en Google
Given navego a Google
And ingreso criterio de busqueda
When clickeo en boton de busqueda
Then obtengo resultado
   