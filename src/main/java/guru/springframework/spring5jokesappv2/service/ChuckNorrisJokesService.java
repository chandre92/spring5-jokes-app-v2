package guru.springframework.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesService implements JokesService {
    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
