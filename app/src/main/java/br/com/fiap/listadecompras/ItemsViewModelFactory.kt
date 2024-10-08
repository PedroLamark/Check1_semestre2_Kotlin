package carreiras.com.github.kotlin_android_lista_de_compras

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.fiap.listadecompras.ItemsViewModel

/*implementação padrão de uma classe ViewModel que implementa a interface ViewModelProvider.Factory
 com o Override da função create

 Classe muito necessária dentro do padrão MVVM

 */

class ItemsViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ItemsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ItemsViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
